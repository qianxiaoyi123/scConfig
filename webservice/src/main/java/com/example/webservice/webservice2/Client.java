package com.example.webservice.webservice2;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.AxisEngine;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.SOAPConstants;


public class Client extends org.apache.axis.client.Stub{

    public static void main(String[] args) {
        try {
            new Client().get();
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

        call.setTargetEndpointAddress("http://localhost:7081/Hermes/services/HermesService");
        call.setSOAPActionURI("http://com.boco.esb.receive/example");
        call.setOperationName(new QName("http://com.boco.esb.receive", "example")); // example 为服务端接口方法名

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

        call.setReturnType(XMLType.XSD_STRING);// 设置返回数据类型

        String[] param = new String[1]; // 参数
        param[0] = "参数1,参数2，参数3"; // 实际可用json

        String result = (String) call.invoke(param);
        System.out.println("result为--------------------"+result);
    }


}
