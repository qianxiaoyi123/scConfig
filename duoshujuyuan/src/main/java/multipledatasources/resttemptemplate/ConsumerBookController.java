package multipledatasources.resttemptemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sang on 2017/9/9.
 */
@RestController
public class ConsumerBookController {
    @Autowired
    RestTemplate restTemplate;
/*第一种：getForEntity
第二种：getForObject

getForEntity方法的返回值是一个ResponseEntity<T>，ResponseEntity<T>是Spring对HTTP请求响应的封装，
包括了几个重要的元素，如响应码、contentType、contentLength、响应消息体等
//*/
//    @RequestMapping("/gethello")
//    public String getHello() {
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class);
//        String body = responseEntity.getBody();
//        HttpStatus statusCode = responseEntity.getStatusCode();
//        int statusCodeValue = responseEntity.getStatusCodeValue();
//        HttpHeaders headers = responseEntity.getHeaders();
//        StringBuffer result = new StringBuffer();
//        result.append("responseEntity.getBody()：").append(body).append("<hr>")
//                .append("responseEntity.getStatusCode()：").append(statusCode).append("<hr>")
//                .append("responseEntity.getStatusCodeValue()：").append(statusCodeValue).append("<hr>")
//                .append("responseEntity.getHeaders()：").append(headers).append("<hr>");
//        return result.toString();
//    }
    /*
    * 可以用一个数字做占位符，最后是一个可变长度的参数，来一一替换前面的占位符
也可以前面使用name={name}这种形式，最后一个参数是一个map，map的key即为前边占位符的名字，
map的value为参数值*/
    @RequestMapping("/sayhello")
    public String sayHello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/sayhello?name={1}", String.class, "张三");
        return responseEntity.getBody();
    }
    @RequestMapping("")
    public String hello() {

        return "https验证OK";
    }
    @RequestMapping("/sayhello2")
    public String sayHello2() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "李四");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/sayhello?name={name}", String.class, map);
        return responseEntity.getBody();
    }
    @RequestMapping("/sayhello3")
    public String sayHello3() {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://localhost:8080/sayhello?name={name}").build().expand("王五").encode();
        URI uri = uriComponents.toUri();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody();
    }
    @RequestMapping("/book1")
    public Book book1() {
        ResponseEntity<Book> responseEntity = restTemplate.getForEntity("http://HELLO-SERVICE/getbook1", Book.class);
        return responseEntity.getBody();
    }
    @RequestMapping("/book2")
    public Book book2() {

        Book book = restTemplate.getForObject("http://HELLO-SERVICE/getbook1", Book.class);
        return book;
    }
    /*
    post方法
    第一种：postForEntity
    方法的第一参数表示要调用的服务的地址
方法的第二个参数表示上传的参数
方法的第三个参数表示返回的消息体的数据类型
我这里创建了一个Book对象，这个Book对象只有name属性有值，将之传递到服务提供者那里去，服务提供者代码如下：
第二种：postForObject

如果你只关注，返回的消息体，可以直接使用postForObject。用法和getForObject一致。

第三种：postForLocation
    */
    @RequestMapping("/book3")
    public Book book3() {
        Book book = new Book();
        book.setName("红楼梦");
        ResponseEntity<Book> responseEntity = restTemplate.postForEntity("http://HELLO-SERVICE/getbook2", book, Book.class);
        return responseEntity.getBody();
    }
    /*
    * 在RestTemplate中，PUT请求可以通过put方法调用，
    * put方法的参数和前面介绍的postForEntity方法的参数基本一致，
    * 只是put方法没有返回值而已。举一个简单的例子，如下：*/
    @RequestMapping("/put")
    public void put() {
        Book book = new Book();
        book.setName("红楼梦");
        restTemplate.put("http://HELLO-SERVICE/getbook3/{1}", book, 99);
    }
    @RequestMapping("/delete")
    public void delete() {
        restTemplate.delete("http://HELLO-SERVICE/getbook4/{1}", 100);
    }
    //*************************************************************
    @RequestMapping("/zhangmingyu")
    public  String zhangmingyu(){
        Map<String,String> map=new HashMap<>();
        map.put("name","张三");
        ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://HELLO-SERVICE/zhangmingyu?name={name}",String.class,map);
        return  responseEntity.getBody();
    }
    @RequestMapping("/zhangmingyu1")
    public  String zhangmingyu1(){
        Map<String,String> map=new HashMap<>();
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://HELLO-SERVICE/zhangmingyu?name={name}").build();
        URI uri=uriComponents.toUri();
        map.put("name","张三1");
        ResponseEntity<String> responseEntity=restTemplate.getForEntity(uri,String.class);
        return  responseEntity.getBody();
    }
    @RequestMapping("/map")
    public Book map(){
        Book book = new Book();
        book.setName("红楼梦");
        ResponseEntity<Book> responseEntity=restTemplate.postForEntity("http://HELLO-SERVICE/getbook2",book, Book.class);
        return responseEntity.getBody();
    }
}
