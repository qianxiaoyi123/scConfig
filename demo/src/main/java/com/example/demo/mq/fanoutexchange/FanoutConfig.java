package com.example.demo.mq.fanoutexchange;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*配置一个routingKey为api.report.payment的消息队列并绑定在reportExchange交换机上

配置一个routingKey为api.report.refund的消息队列并绑定在reportExchange交换机上*/
@Configuration
public class FanoutConfig {
    @Bean
    public Queue reportPaymentQueue() {
        return new Queue("api.report.payment");
    }

    @Bean
    public Queue reportRefundQueue() {
        return new Queue("api.report.refund");
    }

    @Bean
    public FanoutExchange reportExchange() {
        return new FanoutExchange("reportExchange");
    }

    @Bean
    public Binding bindingReportPaymentExchange(Queue reportPaymentQueue, FanoutExchange reportExchange) {
        return BindingBuilder.bind(reportPaymentQueue).to(reportExchange);
    }

    @Bean
    public Binding bindingReportRefundExchange(Queue reportRefundQueue, FanoutExchange reportExchange) {
        return BindingBuilder.bind(reportRefundQueue).to(reportExchange);
    }
}
