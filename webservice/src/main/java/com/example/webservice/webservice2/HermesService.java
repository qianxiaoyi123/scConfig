package com.example.webservice.webservice2;



import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
//import org.apache.axis2.context.MessageContext;

@WebService(serviceName="HermesService",targetNamespace = "http://com.boco.esb.receive")
public class HermesService {


    //该方法就是要暴露给其他应用程序调用的方法
    @WebMethod(operationName="example")
    public String example(String param){

        System.out.println("------------------- 调用服务端方法 ！-----------------");
        StringBuffer paramStr = new StringBuffer(param);
        System.out.println("-----param参数为:"+paramStr);
        return param;
    }

    /**
     * 认证
     */
    public static void checkHesder() throws Exception
    {

    }


    //这里我们使用main方法来发布我们的service
    public static void main(String[] args){

        /**
         * 参数1：服务的发布地址
         * 参数2：服务的实现者
         * Endpoint 会重新启动一个线程
         */
        Endpoint.publish("http://localhost:7081/Hermes/services/HermesService",new HermesService());
        System.out.println("------- com.boco.esb.receive的HDMP的服务启动成功！   -----   ~_~   ----- ");
    }

}
