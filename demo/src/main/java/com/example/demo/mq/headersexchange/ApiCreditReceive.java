package com.example.demo.mq.headersexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*添加creditBank()方法，监听routingKey为credit.bank的队列消息

添加creditFinance()方法，监听routingKey为credit.finance的队列消息*/
@Component
public class ApiCreditReceive {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    @RabbitListener(queues = "credit.bank")
    public void creditBank(String msg) {
        logger.info("credit.bank receive message: "+msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "credit.finance")
    public void creditFinance(String msg) {
        logger.info("credit.finance receive message: "+msg);
    }
}
