package com.example.camela.Cameldemoa.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file:src/main/resources/input")
                .log("{$body}")
                .to("file:src/main/resources/output");

    }
}
