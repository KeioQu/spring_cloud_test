package com.example.demo.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerAction {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello_consumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}
