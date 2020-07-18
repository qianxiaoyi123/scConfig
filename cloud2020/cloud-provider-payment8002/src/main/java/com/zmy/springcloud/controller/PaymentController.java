package com.zmy.springcloud.controller;

import com.zmy.springcloud.entities.CommonResult;
import com.zmy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.zmy.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;
    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入");
        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(444, "插入数据失败");
        }
    }
    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
         Payment payment = paymentService.getPaymentById(id);
        log.info("***插入");
        if (payment !=null) {
            return new CommonResult(200, "chaxun成功123"+port, payment);
        } else {
            return new CommonResult(444, "没有记录",null);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return port;
    }
}
