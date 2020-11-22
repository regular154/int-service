package com.example.intservice.controller;

import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IntController {

    private final ProducerTemplate producerTemplate;

    public IntController(ProducerTemplate producerTemplate) {
        this.producerTemplate = producerTemplate;
    }

    @PostMapping("/email/send")
    public Object sendEmail(@RequestBody Map<String, Object> body) {
        return producerTemplate.sendBody("direct:sendEmail", ExchangePattern.InOut, body);
    }

}
