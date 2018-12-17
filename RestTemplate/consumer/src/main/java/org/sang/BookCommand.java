package org.sang;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;
/*
* 在BookCommand中注入RestTemplate，然后重写两个方法：一个是getFallback，这个方法将在服务调用失败时回调；另一个是run方法，执行请求时调用。构造方法的第一个参数主要用来保存一些分组信息。*/
public class BookCommand extends HystrixCommand<Book> {
    private RestTemplate restTemplate;

    @Override
    protected Book getFallback() {
        return new Book("zmy", 88, "zmy", "自定义的HystrixCommand");
    }
    public BookCommand(Setter setter,RestTemplate restTemplate){
        super(setter);
        this.restTemplate=restTemplate;
    }

    @Override
    protected Book run()throws Exception {
        return restTemplate.getForObject("http://HELLO-SERVICE/getbook1", Book.class);
    }
}
