package com.example.webservice.service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@WebService
public class TestwebService {
    @WebMethod(operationName = "sayHello")
    public String sayHello(String firstname) {
        System.out.println(firstname);
        return "Hello world!    hello  " + firstname;
    }
    @WebMethod(operationName = "sayHello2")
    public String sayHello2(String firstname,String Secondname) {
        System.out.println(firstname+Secondname);
        return "Hello world! "+Secondname+"   hello  " + firstname;
    }
//    @WebMethod(operationName = "sayHello2")
//    public HashMap<String, String> sayHello2() {
//        HashMap<String, String> inMsg=new HashMap<>();
//        inMsg.put("zname","zhangmingyu");
//        inMsg.put("sex","man");
//        return inMsg;
//    }


//    @WebMethod(operationName = "sayHello")
//    public Map<String,String> sayHello(String ss) {
//        Map<String,String> map=new HashMap<>();
//        map.put("1","ss");
//
//        System.out.println(ss);
//        return map;
//    }

    @WebMethod(operationName = "getSum")
    public int getSum(int a, int b) {
        return a + b;

    }
}