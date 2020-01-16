package multipledatasources.webservice;

/**
 * Created by zhangmingyu on 2020/1/7.
 * 		<dependency>
 <groupId>org.apache.cxf</groupId>
 <artifactId>cxf-rt-frontend-jaxws</artifactId>
 <version>3.1.6</version>
 </dependency>
 <dependency>
 <groupId>org.apache.cxf</groupId>
 <artifactId>cxf-rt-transports-http</artifactId>
 <version>3.1.6</version>
 </dependency>
 <dependency>
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Description TODO
 * @Author wuqingyan
 * Date 2019/5/17 10:19
 * Modify Log
 **/

@WebService(targetNamespace = "http://webservice.multipledatasources")
public interface IHello {

    @WebMethod
    public @WebResult String sayHello(@WebParam(name = "userName") String userName);
}