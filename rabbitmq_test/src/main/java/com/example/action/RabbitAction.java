package com.example.action;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitAction {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/send")
    public String send(String message){
        rabbitTemplate.convertAndSend("my", message);
        return "消息已发送：" + message;
    }
}
