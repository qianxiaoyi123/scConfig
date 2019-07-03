package com.example.demo.mq.fanoutexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiReportSender {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void generateReports(String msg){
        logger.info("api.generate.reports send message: "+msg);
        rabbitTemplate.convertAndSend("reportExchange", "api.generate.reports", msg);
    }
}