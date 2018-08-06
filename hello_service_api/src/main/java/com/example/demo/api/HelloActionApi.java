package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello-service")
public interface HelloActionApi {

    @GetMapping(value = "/hello")
    public String hello();
}
