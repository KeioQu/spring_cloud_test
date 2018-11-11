package com.example.demo.action;

import com.example.demo.api.HelloActionApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAction implements HelloActionApi {

    private Logger logger = LoggerFactory.getLogger(HelloAction.class);

    @Override
    public String hello(){
        logger.info("hello");
        return "hello";
    }

    @Override
    public String test(){
        logger.info("test");
        return "test";
    }

    @Override
    public String test1() {
        logger.info("test1");
        return "test1";
    }

    @Override
    public String test2() {
        logger.info("test2");
        return "test2";
    }

    @Override
    public String test3() {
        logger.info("test3");
        return "test3";
    }
}
