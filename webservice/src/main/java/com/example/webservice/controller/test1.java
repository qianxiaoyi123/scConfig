package com.example.webservice.controller;

import java.util.HashMap;

public class test1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 该WebService文档==>http://ws.webxml.com.cn/webservices/DomesticAirline.asmx
        WebServiceClient ws = new WebServiceClient("http://service.webservice.example.com/",
                "http://localhost:8081/HelloWorld?wsdl",
                "TestwebServiceService", "TestwebServicePort",
                "sayHello", "*");
        HashMap<String, String> inMsg = new HashMap<String, String>();

//        inMsg.put("startCity", "宁波");
//        inMsg.put("lastCity", "青岛");
//        inMsg.put("theDate", "2018-12-25");
        inMsg.put("firstname", "张明毓");

        try {
            String ret = ws.sendMessage(inMsg);
            System.out.println(ret.toString()); // 没有对结果做处理
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
