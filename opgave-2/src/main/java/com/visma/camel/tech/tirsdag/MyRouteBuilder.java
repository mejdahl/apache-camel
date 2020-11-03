package com.visma.camel.tech.tirsdag;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import dk.naturerhverv.fishery.lists.v2.List;

/**
 * A Camel Java DSL Router
 */

@PropertySource("classpath:foo.properties")
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
	
    public void configure() {
    	
    	restConfiguration()
    		.component("undertow")
    		.host("localhost").port(8080)
    		.bindingMode(RestBindingMode.auto);
    	
    	 rest("/city")
    	 	.get("/hello")
    	 	.outType(List.class)
    	 	.produces("")
         	.to("direct:getall");

    	
        from("direct:getall")
        	.streamCaching()
        	.setHeader(Exchange.HTTP_METHOD, constant("GET"))
        	.to("https://fiskeriservice-q.fiskeristyrelsen.dk/common-integration/rest/list/LocationList?bridgeEndpoint=true")
        	.log("${headers}")
        	.log("${body}")
        	;
    }

}
