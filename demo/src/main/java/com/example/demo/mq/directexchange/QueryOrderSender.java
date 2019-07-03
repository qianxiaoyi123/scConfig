package com.example.demo.mq.directexchange;

import com.example.demo.bean.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryOrderSender {
    private  final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(String orderId){
        logger.info("query.order send message: "+orderId);
        Order order = (Order) rabbitTemplate.convertSendAndReceive("query.order", orderId);
        logger.info("query.order return message: "+order);
    }
}
