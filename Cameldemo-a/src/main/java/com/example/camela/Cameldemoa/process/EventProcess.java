package com.example.camela.Cameldemoa.process;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


public class EventProcess implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("processing message from exchange " +exchange.getMessage().getBody());
    }
}
