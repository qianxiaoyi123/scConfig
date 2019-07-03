package com.example.demo.mq.directexchange;

import com.example.demo.bean.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class RefundNotifySender {
    private  final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(Order order){

        logger.info("notify.refund send message: "+order);
        rabbitTemplate.convertAndSend("notify.refund", order);
    }
}
