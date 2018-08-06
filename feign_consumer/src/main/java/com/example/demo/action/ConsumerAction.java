package com.example.demo.action;

import com.example.demo.rest.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerAction {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello_consumer")
    public String helloConsumer(){
        return helloService.hello();
    }
}
