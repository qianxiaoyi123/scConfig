package com.example.demo.mq.directexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//添加一个消息监听类（消费者）
//
//监听routingKey为notify.payment的队列消息
@Component
@RabbitListener(queues = "notify.payment")
public class PaymentNotifyReceive {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    public void receive(String msg) {
        logger.info("notify.payment receive message: "+msg);
    }
}
