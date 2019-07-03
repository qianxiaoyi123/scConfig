package com.example.demo.mq.directexchange;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*//配置一个routingKey为notify.payment的消息队列
//DirectExchange是RabbitMQ的默认交换机，直接使用routingKey匹配队列

https://www.cnblogs.com/skychenjiajun/p/9037324.html
*/
@Configuration
public class DirectConfig {
    @Bean
    public Queue paymentNotifyQueue() {
        return new Queue("notify.payment");
    }
//实际项目中，请求信息可能包含多个字段。为了保证生产者与消费者两端的字段一致性，通常会传递一个对象
    @Bean
    public Queue refundNotifyQueue() {
        return new Queue("notify.refund");
    }
//RabbitMQ支持RPC远程调用，同步返回结果
    @Bean
    public Queue queryOrderQueue() {
        return new Queue("query.order");
    }
}