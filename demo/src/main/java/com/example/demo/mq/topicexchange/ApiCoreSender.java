package com.example.demo.mq.topicexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*添加两个消息发送类（生产者）

添加一个user()方法，发送消息至coreExchange交换机且routingKey为api.core.user

添加一个userQuery()方法，发送消息至coreExchange交换机且routingKey为api.core.user.query*/
@Component
public class ApiCoreSender {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void user(String msg){
        logger.info("api.core.user send message: "+msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user", msg);
    }

    public void userQuery(String msg){
        logger.info("api.core.user.query send message: "+msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user.query", msg);
    }
}
