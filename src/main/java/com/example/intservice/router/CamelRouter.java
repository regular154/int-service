package com.example.intservice.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:sendEmail")
                .bean("")
                .end();
    }
}
