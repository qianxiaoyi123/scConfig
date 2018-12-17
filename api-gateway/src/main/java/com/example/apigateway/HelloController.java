package com.example.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// 我希望用户在访问/local时能够自动跳转到这个方法上来处理，
// 那么此时我们需要用到Zuul的本地跳转，配置方式如下
// zuul:
//  prefix: /myapi
//  ignored-patterns: /**/hello/**
// routes:
// local:
// path: /local/**
// url: forward:/local

@RestController
public class HelloController {
    @RequestMapping("/local")
    public String hello(){
        return "aip gateway";
    }
}
