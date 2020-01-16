package multipledatasources.bordertrade.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import multipledatasources.water.controller.res.Response;
import multipledatasources.water.controller.res.ResponseHeader;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



@SuppressWarnings("all")
@Service
public class DoCheckRelManifestServiceImpl  {

	@Autowired
	private Environment environment;
	/**
     * 核注核销接口
     * @param doCheckRelManifestData
     * @return
     * @throws Exception
     */

	public Response<String> queryDoCheckRelManifest(DoCheckRelManifestData doCheckRelManifestData) throws Exception {
		Response<String> res = makeResponse();
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection soapConnection = soapConnectionFactory.createConnection();
		String propertyPath ="http://10.99.85.186/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL";
		//String propertyPath ="http://10.99.20.99/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL";
		
		 URL endpoint= new URL(new URL(propertyPath), "",new URLStreamHandler() {
			@Override
			protected URLConnection openConnection(URL url) throws IOException {
				 URL target = new URL(url.toString());
				 URLConnection connection = target.openConnection();
				 connection.setConnectTimeout(3*1000);//timeout时间为30秒
				 connection.setReadTimeout(3*1000);//timeout时间为30秒
				 return(connection);
			}
		});

		SOAPMessage response = soapConnection.call(createSoapRequest(doCheckRelManifestData), endpoint);
		SOAPBody soapBody = response.getSOAPBody();
		String textContent = soapBody.getTextContent();
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(new ByteArrayInputStream(textContent.getBytes()));
		Element element = document.getRootElement();
		List<Element> children = element.getChildren();
		//List<DoCheckRelManifestData> list = new ArrayList<>();
		if (children != null && children.size() > 0) {
			
			for (int i = 0; i< children.size(); i++) {
				Element ele = children.get(i);
				String name = ele.getName();
				if (name.equals("Result")) {
					res.getHeader().setCode(ele.getText());
				}
				else if (name.equals("Msg")) {
					res.getHeader().setMessage(ele.getText());
				}
			}
			
		}
		//PageHelper.startPage(doCheckRelManifestData.getPage(), doCheckRelManifestData.getPageSize());
		return res;
	}
	private  SOAPMessage createSoapRequest(DoCheckRelManifestData doCheckRelManifestData) throws Exception {
		return createSoapRequest(doCheckRelManifestData,"http://ChinaCustoms.Application.Manifest.Road.BorderTrade/DoCheckRelManifest","http://ChinaCustoms.Application.Manifest.Road.BorderTrade/");
	}
	private static SOAPMessage createSoapRequest(DoCheckRelManifestData doCheckRelManifestData, String saopAction, String serverURI) throws Exception {
		SOAPMessage soapMsg = MessageFactory.newInstance().createMessage();
		MimeHeaders mimeHeaders = soapMsg.getMimeHeaders();
		mimeHeaders.addHeader("SOAPAction", saopAction);
		SOAPPart soapPart = soapMsg.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		String ServerURI = serverURI;
		String prefix="chin";
		soapEnvelope.addNamespaceDeclaration(prefix, ServerURI);
		SOAPBody soapBody = soapMsg.getSOAPBody();
		QName totalName = new QName(ServerURI,"DoCheckRelManifest",prefix);// 公路舱单边民互市核注核销接口
		SOAPBodyElement addBodyElement = soapBody.addBodyElement(totalName);
		QName qname1 = new QName(ServerURI,"manifest_id", prefix);// 货物运输批次号/航班航次号
		addBodyElement.addChildElement(qname1).setValue(doCheckRelManifestData.getManifest_id());// 4000000005612
		QName qname2 = new QName(ServerURI,"bill_no", prefix);// 提单号
		addBodyElement.addChildElement(qname2).setValue(doCheckRelManifestData.getBill_no());// A1111
		QName qname3 = new QName(ServerURI,"decl_traf_mode", prefix);// 运输方式代码(4 公路运输)
		addBodyElement.addChildElement(qname3).setValue(doCheckRelManifestData.getDecl_traf_mode());// 4
		QName qname4 = new QName(ServerURI,"i_e_flag", prefix);// 进出境标志（I进口 E出口）
		addBodyElement.addChildElement(qname4).setValue(doCheckRelManifestData.getI_e_flag());// I
		QName qname5 = new QName(ServerURI,"customs_code", prefix);// 进出境海关代码（4位关区代码）
		addBodyElement.addChildElement(qname5).setValue(doCheckRelManifestData.getCustomscode());// 5300
		QName qname6 = new QName(ServerURI,"form_id", prefix);// 互市申报单号
		addBodyElement.addChildElement(qname6).setValue(doCheckRelManifestData.getForm_id());
		QName qname7 = new QName(ServerURI,"weight", prefix);// 反核注重量
		addBodyElement.addChildElement(qname7).setValue(doCheckRelManifestData.getWeight());
		/*QName qname6 = new QName(ServerURI,"form_id", prefix);// 互市申报单号
		addBodyElement.addChildElement(qname6).setValue(doCheckRelManifestData.getForm_id());
		QName qname7 = new QName(ServerURI,"weight", prefix);// 反核注重量
		addBodyElement.addChildElement(qname7).setValue(doCheckRelManifestData.getWeight());*/
		soapMsg.writeTo(System.out);
		soapMsg.saveChanges();
		return soapMsg;
	}
	
	/*public static void main(String[] args) {
		DoCheckRelManifestServiceImpl service = new DoCheckRelManifestServiceImpl();
		DoCheckRelManifestData data = new DoCheckRelManifestData();
		//DoAntiCheckRelManifestData data = new DoAntiCheckRelManifestData();
		*//*data.setManifest_id("4000000005451");
		data.setI_e_flag("I");
		data.setDecl_traf_mode("4");
		data.setCustomscode("5300");
		data.setBill_no("123");*//*
		*//*data.setWeight("123");
		data.setForm_id("123456");*//*
		*//*data.setAuditDate(auditDate);
		data.setAuditEr(auditEr);
		data.setBill_no(bill_no);*//*
		data.setCtrlId("S2018041617042427Pbi7");
		data.setCtrlObjId("001");
		data.setCtrlObjType("H");
		data.setCtrlSource("9");
		data.setCtrlType("1");
		data.setCustomscode("5301");
		data.setDecl_traf_mode("4");
		data.setGenDate("0");
		data.setHitMark("1");
		data.setHitTime("2018-4-16 17:04:24");
		data.setI_e_flag("I");
		data.setManifest_id("1100263945732");
		data.setReleaseDate("0");
		data.setReleaseEr("0");
		//data.setRemark(remark);
		data.setRskApproveDate("2018-4-16 15:32:45");
		data.setRskApproveEr("0100000");
		data.setRskDate("2018-4-16 17:04:31");
		data.setRskEr("0050000");
		data.setRskPhone("34243242");
		data.setRskRequest("查验货物确定价格,查验货物确定归类,查验单货是否相符,联系税管中心");
		data.setRskResult("0");
		data.setRskType("B");
		data.setGenDate("2018-4-16 10:04:31");
		data.setAuditDate("2018-4-16 11:24:31");
		data.setReleaseDate("2018-4-16 18:04:24");
		try {
            service.makeRiskRequest(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	/**
     * 反核注核销接口
     * @param doCheckRelManifestData
     * @return
     * @throws Exception
     */
    public Response<String> queryDoAntiCheckRelManifest(DoCheckRelManifestData doCheckRelManifestData) throws Exception {
    	Response<String> res = makeResponse();
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection soapConnection = soapConnectionFactory.createConnection();
		String propertyPath ="http://10.99.85.186/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL";
		//String propertyPath ="http://10.99.20.99/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL";
		URL endpoint= new URL(new URL(propertyPath), "",new URLStreamHandler() {
			@Override
			protected URLConnection openConnection(URL url) throws IOException {
				 URL target = new URL(url.toString());
				 URLConnection connection = target.openConnection();
				 connection.setConnectTimeout(5*1000);
				 connection.setReadTimeout(5*1000);
				 return(connection);
			}
		});
		SOAPMessage response = soapConnection.call(createSoapRequest2(doCheckRelManifestData), endpoint);
		SOAPBody soapBody = response.getSOAPBody();
		String textContent = soapBody.getTextContent();
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(new ByteArrayInputStream(textContent.getBytes()));
		Element element = document.getRootElement();
		List<Element> children = element.getChildren();
        if (children != null && children.size() > 0) {
			for (int i = 0; i< children.size(); i++) {
				Element ele = children.get(i);
				String name = ele.getName();
				if (name.equals("Result")) {
					res.getHeader().setCode(ele.getText());
				}
				else if (name.equals("Msg")) {
					res.getHeader().setMessage(ele.getText());
				}
			}
			
		}
		//PageHelper.startPage(doAntiCheckRelManifestData.getPage(), doAntiCheckRelManifestData.getPageSize());
		return res;
	}
    /**
     * 风险接口
     * @author lujingya
     * 2018-8-22 12:48:43
     */
	/*@Override
	public Response<String> makeRiskRequest(DoCheckRelManifestData doCheckRelManifestData) throws Exception {
		Response<String> res = makeResponse();
		QName SERVICE_NAME = new QName("http://ChinaCustoms.Application.Manifest.Road.BorderTrade/", "BorderTrade");
		URL wsdlURL = BorderTrade.WSDL_LOCATION;
		BorderTrade ss = new BorderTrade(wsdlURL, SERVICE_NAME);
	    BorderTradeSoap port = ss.getBorderTradeSoap();
        FreemarkerUtil futil = FreemarkerUtil.getInstance();
        Map<String, Object> map = new HashMap<>();
		map.put("riskReq", doCheckRelManifestData);
		String result = futil.getStrByTemplate(map, "risk.xml");
		System.out.println(result);
        String textContent = port.insertRiskInfo(doCheckRelManifestData.getRiskFlag(), result);
        System.out.println(textContent);
        SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(new ByteArrayInputStream(textContent.getBytes()));
		Element element = document.getRootElement();
		List<Element> children = element.getChildren();
        if (children != null && children.size() > 0) {
			for (int i = 0; i< children.size(); i++) {
				Element ele = children.get(i);
				String name = ele.getName();
				if (name.equals("Result")) {
					res.getHeader().setCode(ele.getText());
				}
				else if (name.equals("Msg")) {
					res.getHeader().setMessage(ele.getText());
				}
			}
			
		}
        return res;
	}*/

	private Response<String> makeResponse() {
		Response<String> res = new Response<String>();
		ResponseHeader header = new ResponseHeader();
		res.setHeader(header);
		return res;
	}

	private SOAPMessage createSoapRequest2(DoCheckRelManifestData data) throws Exception {
        return createSoapRequest2(data,"http://ChinaCustoms.Application.Manifest.Road.BorderTrade/DoAntiCheckRelManifest","http://ChinaCustoms.Application.Manifest.Road.BorderTrade/");
	}

    public static SOAPMessage createSoapRequest2(DoCheckRelManifestData doCheckRelManifestData, String soapAtion, String serverURI) throws Exception {
		SOAPMessage soapMsg = MessageFactory.newInstance().createMessage();
		MimeHeaders mimeHeaders = soapMsg.getMimeHeaders();
		mimeHeaders.addHeader("SOAPAction", soapAtion);
		SOAPPart soapPart = soapMsg.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		String ServerURI = serverURI;
		String prefix="chin";
		soapEnvelope.addNamespaceDeclaration(prefix, ServerURI);
		SOAPBody soapBody = soapMsg.getSOAPBody();
		QName totalName = new QName(ServerURI,"DoAntiCheckRelManifest",prefix);// 公路舱单边民互市核注核销接口
		SOAPBodyElement addBodyElement = soapBody.addBodyElement(totalName);
		QName qname1 = new QName(ServerURI,"manifest_id", prefix);// 货物运输批次号/航班航次号
		addBodyElement.addChildElement(qname1).setValue(doCheckRelManifestData.getManifest_id());// 4000000005612
		QName qname2 = new QName(ServerURI,"bill_no", prefix);// 提单号
		addBodyElement.addChildElement(qname2).setValue(doCheckRelManifestData.getBill_no());// A1111
		QName qname3 = new QName(ServerURI,"decl_traf_mode", prefix);// 运输方式代码(4 公路运输)
		addBodyElement.addChildElement(qname3).setValue(doCheckRelManifestData.getDecl_traf_mode());// 4
		QName qname4 = new QName(ServerURI,"i_e_flag", prefix);// 进出境标志（I进口 E出口）
		addBodyElement.addChildElement(qname4).setValue(doCheckRelManifestData.getI_e_flag());// I
		QName qname5 = new QName(ServerURI,"customs_code", prefix);// 进出境海关代码（4位关区代码）
		addBodyElement.addChildElement(qname5).setValue(doCheckRelManifestData.getCustomscode());// 5300
		QName qname6 = new QName(ServerURI,"form_id", prefix);// 互市申报单号
		addBodyElement.addChildElement(qname6).setValue(doCheckRelManifestData.getForm_id());
		QName qname7 = new QName(ServerURI,"weight", prefix);// 反核注重量
		addBodyElement.addChildElement(qname7).setValue(doCheckRelManifestData.getWeight());
		soapMsg.writeTo(System.out);
		soapMsg.saveChanges();
		return soapMsg;
	}

	/*public static SOAPMessage createSoapRequest3(DoCheckRelManifestData doCheckRelManifestData) throws Exception {
		SOAPMessage soapMsg = MessageFactory.newInstance().createMessage();
		MimeHeaders mimeHeaders = soapMsg.getMimeHeaders();
		mimeHeaders.addHeader("SOAPAction", "http://ChinaCustoms.Application.Manifest.Road.BorderTrade/InsertRiskInfo");
		SOAPPart soapPart = soapMsg.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		String ServerURI = "http://ChinaCustoms.Application.Manifest.Road.BorderTrade/";
		String prefix="chin";
		soapEnvelope.addNamespaceDeclaration(prefix, ServerURI);
		SOAPBody soapBody = soapMsg.getSOAPBody();
		FreemarkerUtil futil = FreemarkerUtil.getInstance();
		Map<String, Object> map = new HashMap<>();
		map.put("riskReq", doCheckRelManifestData);
		String result = futil.getStrByTemplate(map, "risk.xml");
		StringBuilder builder = new StringBuilder("<![CDATA[");
		builder.append(result);
		builder.append("]]>");
		//result = result.replaceAll("\\\\r\\\\n", "");
		QName totalName = new QName(ServerURI,"InsertRiskInfo",prefix);// 公路舱单边民互市核注核销接口
		SOAPBodyElement addBodyElement = soapBody.addBodyElement(totalName);
		QName qname1 = new QName(ServerURI,"riskFlag", prefix);// 货物运输批次号/航班航次号
		addBodyElement.addChildElement(qname1).setValue("2");// 4000000005612
		QName qname2 = new QName(ServerURI,"xmlRisk", prefix);// 提单号
		addBodyElement.addChildElement(qname2).setValue(builder.toString());// A1111
		soapMsg.writeTo(System.out);
		soapMsg.saveChanges();
		return soapMsg;
	}*/

}


