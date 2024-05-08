package com.example.camela.Cameldemoa.router;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import com.example.camela.Cameldemoa.process.EventProcess;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class MyFirstRoute extends RouteBuilder {


    @Autowired
    private GetLocaltimeBean getLocaltimeBean;

//    @Autowired
//    private EventProcess eventProcess;

    @Override
    public void configure() throws Exception {
        //queue ,transformation database
        from("timer:first-timer")

                .log("${body}")
                .transform().constant("My constant message" + LocalDateTime.now())
                .log("${body}")
                .bean(getLocaltimeBean,"getCurrentTime")
                .log("${body}")
                .bean(new EventProcess())
                .to("log:first-timer");
    }
}

@Component
class GetLocaltimeBean{
    public String getCurrentTime(){
        return " timeNow is " + LocalDateTime.now();
    }
}
