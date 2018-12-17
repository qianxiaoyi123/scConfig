package org.sang;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sang on 2017/9/9.
 */
@RestController
public class BookController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String hello() {
//        List<ServiceInstance> instances = client.getInstances("hello-service");
//        for (int i = 0; i < instances.size(); i++) {
//            ServiceInstance instance = instances.get(i);
//            logger.info("/hello,host:" + instance.getHost() + ",serivce_id:" + instance.getServiceId());
//        }
//        return "hello";
//    }

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/getbook1", method = RequestMethod.GET)
    public Book book1() {
        return new Book("三国演义", 90, "罗贯中", "花城出版社");
    }

    @RequestMapping(value = "/getbook2", method = RequestMethod.POST)
    public Book book2(@RequestBody Book book) {
        System.out.println(book.getName());
        book.setPrice(33);
        book.setAuthor("曹雪芹");
        book.setPublisher("人民文学出版社");
        return book;
    }

    @RequestMapping(value = "/getbook3/{id}", method = RequestMethod.PUT)
    public void book3(@RequestBody Book book, @PathVariable int id) {
        logger.info("book:" + book);
        logger.info("id:" + id);
    }

    @RequestMapping(value = "/getbook4/{id}", method = RequestMethod.DELETE)
    public void book4(@PathVariable int id) {
        logger.info("id:" + id);
    }
    //****************************************
    @RequestMapping(value = "/zhangmingyu",method = RequestMethod.GET)
    public String zhangmingyu(String name){
        return name+"get请求";
    }
//    @RequestMapping(value = "/map",method = RequestMethod.GET)
//    public Map<String,String>map(@RequestBody Map<String,String>map){
//        Map<String,String>map1=new HashMap<>();
//        map1.put("xm","zhangsdan");
//        map1.put("xingbie","nan");
//        System.out.println(map.get("shijian"));
//        map1.putAll(map);
//        return map1;
//    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        return "hello " + name + "!";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public Book hello2(@RequestHeader String name, @RequestHeader String author, @RequestHeader Integer price) throws UnsupportedEncodingException {
        Book book = new Book();
        book.setName(URLDecoder.decode(name,"UTF-8"));
        book.setAuthor(URLDecoder.decode(author,"UTF-8"));
        book.setPrice(price);
        System.out.println(book);
        return book;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody Book book) {
        return "书名为：" + book.getName() + ";作者为：" + book.getAuthor();
    }
    @RequestMapping(value = "feigntest3",method = RequestMethod.POST)
    public String feigntest3(@RequestBody Book book){
        String str=book.getName();
        System.out.println(str);
       return str;
       // return"书名为aa：" + book.getName() + ";作者为aa：" + book.getAuthor();
    }

    @RequestMapping(value = "/feigntest1",method = RequestMethod.GET)
    public String feigntest1(@RequestParam String name){
        String str=name+"0.0";
        return str;
    }
    @RequestMapping(value = "feigntest2",method = RequestMethod.GET)
    public Book feigntest2(@RequestHeader String name,@RequestHeader String sex,@RequestHeader int age) throws UnsupportedEncodingException {
        Book book=new Book();
        book.setName(URLDecoder.decode(name,"UTF-8"));
        book.setAuthor(URLDecoder.decode(sex,"UTF-8"));
        book.setPrice(age);
        return book;
    }

}
