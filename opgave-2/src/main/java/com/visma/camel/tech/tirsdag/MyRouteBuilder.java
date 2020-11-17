package com.visma.camel.tech.tirsdag;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;

import dk.naturerhverv.fishery.lists.v2.EntryType;
import dk.naturerhverv.fishery.lists.v2.List;

/**
 * A Camel Java DSL Router
 */

public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
	
    public void configure() {
    	restConfiguration()
			.component("undertow")
			.host("localhost").port(8080)
			.bindingMode(RestBindingMode.auto);
			;

    	rest("/country/{land}")
    		.get()
    		.param()
    			.name("land")
    			.type(RestParamType.path)
    			.dataType("string")
    		.endParam()

    	 		.outType(List.class)
    	 		.to("direct:getall")
    	 		.produces("application/json;charset=UTF-8")
;
    	rest("/city")
    	 	.get("/all")
    	 		.outType(List.class)
    	 		.to("direct:getall")
    	 		.produces("application/json;charset=UTF-8")
	 		.post("/search")
	 			.type(List.class)
	 			.outType(List.class)
	 			.to("direct:search");
    	 		;
    
    	 from("direct:search")
       		.routeId("Do Search")    		
       		.log("${headers}")
       		.enrich("direct:getEntry", new AggregationStrategy() {
       			@Override
				public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
       				List oldList=oldExchange.getIn().getBody(List.class);
					List newList=newExchange.getIn().getBody(List.class);
       				
       				Set<String> entrySet=new HashSet();
					oldList.getEntry().forEach(entry -> entrySet.add(entry.getLocation()) );
					
					java.util.List<EntryType> entryList=newList.getEntry().stream()
							.filter(entry -> entrySet.contains( entry.getLocation() ))
							.collect(Collectors.toList());
					List dkList= new List();
					dkList.setType("Ny enrich");
					dkList.getEntry().addAll(entryList);
					  
					oldExchange.getIn().setBody(dkList);
       				return oldExchange;
       			}
       		})
        	
       		;
    	 
         from("direct:getEntry")
    		.setHeader(Exchange.HTTP_METHOD, constant("GET"))
        	.to("https://fiskeriservice-q.fiskeristyrelsen.dk/common-integration/rest/list/LocationList?bridgeEndpoint=true")
         	.unmarshal().json(JsonLibrary.Jackson, List.class)
        	;
    	 		
    	 from("direct:getall")
     		.routeId("getAll")
     		.log("${headers}")
        	.setHeader(Exchange.HTTP_METHOD, constant("GET"))
 //       	.to("https://fiskeriservice-q.fiskeristyrelsen.dk/common-integration/rest/list/LocationList?bridgeEndpoint=true")
 //       	.unmarshal().json(JsonLibrary.Jackson, List.class)
            .process(new Processor() {
    			
        		@Override
        		public void process(Exchange exchange) throws Exception {
        			List list=exchange.getIn().getBody(List.class);
        			int i=0;
        			
        			java.util.List<EntryType> entryList=list.getEntry().stream()
        					.filter(entry -> entry.getLocation().substring(0,2).equals("DK"))
        					.collect(Collectors.toList());
        			
        			List dkList= new List();
        			dkList.setType("ny-liste");
        			dkList.getEntry().addAll(entryList);
        			exchange.getIn().setBody(dkList);
        		}
        	})
        	.setHeader(Exchange.CONTENT_TYPE,constant("application/json;charset=UTF-8"))
        	.setHeader(Exchange.CONTENT_ENCODING,constant("UTF-8"))
     		;
    }
}
