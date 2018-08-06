package com.example.demo.action;

import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAction {

    private Logger logger = LoggerFactory.getLogger(HelloAction.class);

    @GetMapping(value = "/hello")
    public String hello(){
        logger.info("hello");
        return "hello";
    }
}
