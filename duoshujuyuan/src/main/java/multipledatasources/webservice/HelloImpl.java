package multipledatasources.webservice;

/**
 * Created by zhangmingyu on 2020/1/7.
 */
import multipledatasources.webservice.IHello;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @Description TODO
 * @Author wuqingyan
 * Date 2019/5/17 10:22
 * Modify Log
 **/

@Component
@WebService(serviceName="helloService",  //【对外发布的服务名 】：需要见名知意
        targetNamespace="http://webservice.multipledatasources", //【名称空间】：要跟接口的保持一致
        endpointInterface = "multipledatasources.webservice.IHello") //【服务接口全路径】
public class HelloImpl implements IHello {

    @Override
    public String sayHello(String userName) {
        System.out.println("hello!"+userName);
        return "hello!"+userName;
    }
}