package com.example.feignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;



@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    Book hello(@RequestHeader("name") String name, @RequestHeader("author") String author, @RequestHeader("price") Integer price);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody Book book);
    @RequestMapping(value = "/feigntest3",method = RequestMethod.POST)
    String feigntest3(@RequestBody Book book);
    @RequestMapping(value = "/feigntest1",method = RequestMethod.GET)
    String feigntest1(@RequestParam("name") String name);
    //@RequestHeader String name,@RequestHeader String sex,@RequestHeader int age
    @RequestMapping(value = "feigntest2",method = RequestMethod.GET)
    Book feigntest2(@RequestHeader("name")String name,@RequestHeader("sex")String sex,@RequestHeader("age")Integer age);

}
