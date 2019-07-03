package com.example.demo.mq.directexchange;

import com.example.demo.bean.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "notify.refund")
public class RefundNotifyReceive {
    private  final Logger logger=LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    public void receive(Order order) {
        logger.info("notify.refund receive message: "+order);
    }
}
