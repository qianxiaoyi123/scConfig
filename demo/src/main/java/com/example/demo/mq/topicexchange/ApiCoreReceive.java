package com.example.demo.mq.topicexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

/*添加两个消息监听类（消费者）

监听routingKey为api.core的队列消息*/
@Component
public class ApiCoreReceive {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    @RabbitListener(queues = "api.core")
    public void user(String msg) {
        logger.info("api.core receive message: "+msg);
    }
}
