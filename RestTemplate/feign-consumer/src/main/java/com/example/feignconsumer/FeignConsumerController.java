package com.example.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
public class FeignConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
    @RequestMapping("/hello1")
    public String hello1() {
        return helloService.hello("张三");
    }

    @RequestMapping(value = "/hello2")
    public Book hello2() throws UnsupportedEncodingException {
        Book book = helloService.hello(URLEncoder.encode("三国演义","UTF-8"), URLEncoder.encode("罗贯中","UTF-8"), 33);
        System.out.println(book);
        return book;
    }
    @RequestMapping("/feigntest2")
    public Book feigntest2() throws UnsupportedEncodingException {
        Book book=helloService.feigntest2(URLEncoder.encode("zhangming","UTF-8"),URLEncoder.encode("hahah","UTF-8"),22);
        System.out.println(book);
        return  book;
    }

    @RequestMapping("/hello3")
    public String hello3() {
        Book book = new Book();
        book.setName("红楼梦");
        book.setPrice(44);
        book.setAuthor("曹雪芹");
        return helloService.hello(book);
    }
    @RequestMapping("feigntest1")
    public String feigntest(){
        String name="张明毓feigntest1";
        return helloService.feigntest1(name);
    }

    @RequestMapping("/feigntest3")
    public String feigntest3(){
        Book book=new Book();
        book.setName("xiaoming");
        book.setAuthor("haha");
        book.setPrice(3);
//        book.setName("红楼梦");
//        book.setPrice(44);
//        book.setAuthor("曹雪芹");
        return helloService.feigntest3(book);
    }
}