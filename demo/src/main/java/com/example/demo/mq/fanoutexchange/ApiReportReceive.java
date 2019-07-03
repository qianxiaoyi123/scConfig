package com.example.demo.mq.fanoutexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*添加payment()方法，监听routingKey为api.report.payment的队列消息

添加refund()方法，监听routingKey为api.report.refund的队列消息*/
@Component
public class ApiReportReceive {
    private final Logger logger=LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    @RabbitListener(queues = "api.report.payment")
    public void payment(String msg) {
        logger.info("api.report.payment receive message: "+msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "api.report.refund")
    public void refund(String msg) {
        logger.info("api.report.refund receive message: "+msg);
    }
}
