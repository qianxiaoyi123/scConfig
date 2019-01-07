package com.example.webservice.controller;

import java.util.HashMap;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 该WebService文档==>http://ws.webxml.com.cn/webservices/DomesticAirline.asmx
        WebServiceClient ws = new WebServiceClient("http://WebXml.com.cn/",
                "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx",
                "DomesticAirline", "DomesticAirlineSoap12",
                "getDomesticAirlinesTime", "getDomesticAirlinesTimeResult");
        HashMap<String, String> inMsg = new HashMap<String, String>();
        inMsg.put("startCity", "宁波");
        inMsg.put("lastCity", "青岛");
        inMsg.put("theDate", "2019-01-06");

        try {
            String ret = ws.sendMessage(inMsg);
            System.out.println(ret.toString()); // 没有对结果做处理
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
