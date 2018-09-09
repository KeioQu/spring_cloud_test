package com.example.consumer;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
//指定监听 my 队列
@RabbitListener(queues = {"my"})
public class Consumer {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Consumer.class);

    //指定消息处理
    @RabbitHandler
    public void process(String message){
        logger.info("接受的消息："+ message);
    }
}
