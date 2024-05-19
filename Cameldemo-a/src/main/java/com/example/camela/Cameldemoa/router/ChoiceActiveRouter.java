package com.example.camela.Cameldemoa.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ChoiceActiveRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file:src/main/resources")
                .routeId("Files-Input-Route-")
                .transform().body(String.class)
                .choice()
                    .when(simple("${file: ext} == 'xml'"))
                         .log("XML FILE")
                    .when(simple("${body} contains 'USD'"))
                        .log("Not an XML file")
                    .otherwise()
                        .log("not a XML file")
                .end()
                .log("${body}")
                .to("file:files/output");

    }
}
