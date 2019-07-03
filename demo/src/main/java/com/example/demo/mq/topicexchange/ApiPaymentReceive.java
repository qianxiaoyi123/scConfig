package com.example.demo.mq.topicexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*监听routingKey为api.payment的队列消息*/
@Component
public class ApiPaymentReceive {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    @RabbitListener(queues = "api.payment")
    public void order(String msg) {
        logger.info("api.payment.order receive message: "+msg);
    }
}