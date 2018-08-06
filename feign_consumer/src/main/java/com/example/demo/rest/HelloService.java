package com.example.demo.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过@FeignClient 注解
 * 将 HELLO-SERVICE 服务绑定到该接口
 */
@FeignClient(value = "hello-service")
public interface HelloService {

    @GetMapping(value = "/hello")
    public String hello();
}
