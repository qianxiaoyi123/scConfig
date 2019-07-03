package com.example.demo;

import com.example.demo.bean.Order;
import com.example.demo.mq.directexchange.RefundNotifySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RefundNotifySenderTests {
    @Autowired
    private RefundNotifySender sender;

    @Test
    public void test_sender() {
        Order order = new Order();
        order.setId(100001);
        order.setOrderId(String.valueOf(System.currentTimeMillis()));
        order.setAmount(new BigDecimal("1999.99"));
        order.setCreateTime(new Date());
        sender.sender(order);
    }
}
