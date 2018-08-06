package com.example.demo.action;

import com.example.demo.api.HelloActionApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAction implements HelloActionApi {

    private Logger logger = LoggerFactory.getLogger(HelloAction.class);

    @Override
    public String hello(){
        logger.info("hello");
        return "hello";
    }
}
