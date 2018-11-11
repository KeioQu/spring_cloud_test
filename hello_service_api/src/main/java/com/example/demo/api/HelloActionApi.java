package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "hello-service")
public interface HelloActionApi {

    @GetMapping(value = "/hello")
    public String hello();

    /**
     * params 参数的四种用法
     * age=20 有参数age，且等于20
     * name!=keio 有参数name，且不等于keio
     * address 有参数address，可以为任何值
     * !sex 没有参数sex
     * @return
     */
    @PostMapping(value = "/test", params = {"age=20","name!=keio","address","!sex"})
    public String test();

    /**
     * headers 的四种用法，意义跟params参数一样
     * @return
     */
    @PostMapping(value = "/test", headers = {"Accept=application/json","age=20","name!=keio","address","!sex"})
    public String test1();

    /**
     * consumes 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html
     * @return
     */
    @PostMapping(value = "/test", consumes = {"application/json"})
    public String test2();

    /**
     * produces 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
     * @return
     */
    @PostMapping(value = "/test", produces = {"application/json"})
    public String test3();

}
