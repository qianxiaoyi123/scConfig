package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sang on 2017/9/4.
 * 创建一个Controller类，并向Controller类中注入RestTemplate对象，
 * 同时在Controller中提供一个名为/ribbon-consumer的接口，
 * 在该接口中，我们通过刚刚注入的restTemplate来实现对HELLO-SERVICE
 * 服务提供的/hello接口进行调用（上篇文章中我们有详细介绍HELLO-SERVICE的实现）。
 * 在调用的过程中，我们的访问地址是HELLO-SERVICE，而不是一个具体的地址
 */
@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;
//    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
//    public String helloController() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
//    }
@Autowired
private HelloService helloService;
    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloController() {
        return helloService.hello();
    }
}
