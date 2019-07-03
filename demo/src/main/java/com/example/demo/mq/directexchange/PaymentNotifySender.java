package com.example.demo.mq.directexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//添加一个消息发送类（生产者）
//
//将消息发送至默认的交换机且routingKey为notify.payment
@Component
public class PaymentNotifySender {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(String msg){
        logger.info("notify.payment send message: "+msg);
        rabbitTemplate.convertAndSend("notify.payment", msg);
    }
}
