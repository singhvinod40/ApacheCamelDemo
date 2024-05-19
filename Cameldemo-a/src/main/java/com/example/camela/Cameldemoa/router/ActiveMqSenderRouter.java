package com.example.camela.Cameldemoa.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class ActiveMqSenderRouter extends RouteBuilder {


    // send message to MQ
//    @Override
//    public void configure() throws Exception {
//        //timer , first end point to send message
//        from("timer:active-mq-timer?period=10000")
//                .transform().constant("My message for Active MQ")
//                .log("${body}")
//                .to("activemq:my-activemq-queue"); //message to queue
//
//
//    }

//send JSON message to MQ
//    @Override
//    public void configure() throws Exception {
//
//        from("file:src/main/resources/files/json")
//                .log("${body}")
//                .to("activemq:my-activemq-queue");
//    }

    //active -mq  xml sender
    @Override
    public void configure() throws Exception {

        from("file:src/main/resources/files/xml")
                .log("${body}")
                .to("activemq:my-activemq-queue");
    }

}
