package com.example.camela.Cameldemoa.router;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyFirstRoute extends RouteBuilder {


    @Autowired
    private GetLocaltimeBean getLocaltimeBean;

    @Override
    public void configure() throws Exception {
        //queue ,transformation database
        from("timer:first-timer")
               // .transform().constant("My constant message" + LocalDateTime.now())
                .bean(getLocaltimeBean,"getCurrentTime")
                .to("log:first-timer");
    }
}

@Component
class GetLocaltimeBean{
    public String getCurrentTime(){
        return " timeNow is " + LocalDateTime.now();
    }
}
