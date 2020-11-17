package com.visma.camel.tech.tirsdag;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;


import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.PropertySource;

import dk.naturerhverv.fishery.lists.v2.EntryType;
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
    	
    	 
}
