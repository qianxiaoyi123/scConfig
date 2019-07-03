package com.example.demo.mq.directexchange;

import com.example.demo.bean.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
//监听routingKey为query.order的队列消息
@Component
@RabbitListener(queues = "query.order")
public class QueryOrderReceive {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    public Order receive(String orderId) {
        logger.info("notify.refund receive message: "+orderId);

        Order order = new Order();
        order.setId(100001);
        order.setOrderId(orderId);
        order.setAmount(new BigDecimal("2999.99"));
        order.setCreateTime(new Date());
        return order;
    }
}
