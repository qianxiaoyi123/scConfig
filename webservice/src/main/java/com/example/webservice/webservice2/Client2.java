package com.example.webservice.webservice2;

import org.apache.axis.AxisEngine;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.SOAPConstants;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;


public class Client2 extends org.apache.axis.client.Stub{

    public static void main(String[] args) {
        try {
            new Client2().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void get() throws Exception {

        Service service = new Service() ;
        Call call = (Call) service.createCall();

        SOAPHeaderElement serviceCode = new SOAPHeaderElement(new QName("cn.com.boco.HermesService", "ServiceCode"), "SRCH.SERVICE.TEST_GIS.GIS_APP");
        SOAPHeaderElement userName = new SOAPHeaderElement(new QName("cn.com.boco.HermesService", "UserName"), "IRMS");
        SOAPHeaderElement authCode = new SOAPHeaderElement(new QName("cn.com.boco.HermesService", "AuthCode"), "ca45672f-2c9a-4961-9597-a6f562fdf787");
        SOAPHeaderElement eventId = new SOAPHeaderElement(new QName("cn.com.boco.HermesService", "EventId"), "41591591");
        call.addHeader(serviceCode);
        call.addHeader(userName);
        call.addHeader(authCode);
        call.addHeader(eventId);

        call.setTargetEndpointAddress("http://localhost:8081/HelloWorld");
        call.setSOAPActionURI("http://service.webservice.example.com/sayHello2 ");
        call.setOperationName(new QName("http://service.webservice.example.com/", "sayHello2")); // example 为服务端接口方法名

        call.setEncodingStyle(null);
        call.setUseSOAPAction(true);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);

        setRequestHeaders(call);
        setAttachments(call);

        // 设置接口参数与类型（ 以下2种都能正常传参 ）
//		call.addParameter(new QName("arg0"),XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("arg0", XMLType.XSD_DATE,ParameterMode.IN);
        call.addParameter("arg1", XMLType.XSD_DATE,ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);// 设置返回数据类型

        String[] firstname = new String[2]; // 参数
        firstname[0] = "参数1,参数2，参数3"; // 实际可用json
        firstname[1] = "参数4,参数5，参数6";
        String result = (String) call.invoke(firstname);
        System.out.println("result为--------------------"+result);
    }


}
