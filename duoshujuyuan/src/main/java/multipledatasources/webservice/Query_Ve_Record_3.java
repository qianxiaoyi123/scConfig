package multipledatasources.webservice;


import multipledatasources.bordertrade.controller.BusinessException;
import multipledatasources.bordertrade.controller.DateUtil;
import multipledatasources.bordertrade.controller.QueryVeRecord;
import multipledatasources.bordertrade.controller.RoadTrspmcBsc;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.commons.lang3.StringUtils;

/**进出境运输工具
 * Created by zhangmingyu on 2019/11/19.
 */
public class Query_Ve_Record_3 {

    public List<RoadTrspmcBsc> queryExistsRemoteRoadTrspmc(QueryVeRecord queryVeRecord) throws Exception{
        String allow_ve_ie_port = queryVeRecord.getAllow_ve_ie_port();
        List<RoadTrspmcBsc> roadList = new ArrayList<>();
        if (allow_ve_ie_port != null && allow_ve_ie_port.length() != 0) {
            String[] split = allow_ve_ie_port.split(",");
            queryVeRecord.setCuscdList(split);
        }

        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        String propertyPath ="http://10.99.85.27/ConveyanceWebRoadService/ForBMHSConveyanceDataAccess.asmx?WSDL";
        URL endpoint= new URL(new URL(propertyPath), "",new URLStreamHandler() {
            @Override
            protected URLConnection openConnection(URL url) throws IOException {
                URL target = new URL(url.toString());
                URLConnection connection = target.openConnection();
                connection.setConnectTimeout(30*1000);//timeout时间为30秒
                connection.setReadTimeout(30*1000);//timeout时间为30秒
                return(connection);
            }
        });
        javax.xml.soap.SOAPMessage response = soapConnection.call(createSoapRequest(queryVeRecord), endpoint);
//		String textContent = response.getSOAPBody().getTextContent();
        SOAPBody soapBody = response.getSOAPBody();
        Iterator<SOAPElement> childElements = soapBody.getChildElements();
        List<QueryVeRecord> list = new ArrayList<QueryVeRecord>();
        while (childElements.hasNext()) {
            SOAPElement next = childElements.next();
            Iterator<SOAPElement> childElements2 = next.getChildElements();
            while (childElements2.hasNext()) {
                SOAPElement next2 = childElements2.next();
                if("faultcode".equals(next2.getNodeName())){
                    throw new BusinessException("公路运输工具管理系统：接口调用失败！");
                }
                Iterator<SOAPElement> childElements3 = next2.getChildElements();
                SOAPElement next3 = childElements3.next();
                org.w3c.dom.Node nextSibling = next3.getNextSibling();
                if (nextSibling == null) {
                    return roadList;
                }
                org.w3c.dom.Node NewDataSet =nextSibling.getFirstChild();
                if (NewDataSet == null) {
                    return roadList;
                }
                org.w3c.dom.Node table =NewDataSet.getFirstChild();
                if (table == null) {
                    return roadList;
                }
                NodeList childNodes =table.getChildNodes();
                QueryVeRecord record = new QueryVeRecord();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    org.w3c.dom.Node item2 = childNodes.item(j);
                    Field[] fields = record.getClass().getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        if (field.getName().equalsIgnoreCase(item2.getLocalName())) {
                            field.set(record, item2.getTextContent());
                            break;
                        }
                    }
                }
                list.add(record);
            }
        }


        for (QueryVeRecord qvr : list) {
            RoadTrspmcBsc record = new RoadTrspmcBsc();
            record.setVeCusmNo(qvr.getVe_customs_no());
            record.setDomsPltno(qvr.getDomestic_lisence_no());
            record.setBybordPltno(qvr.getForeign_license());
            record.setVeRegPlcNm(qvr.getVe_reg_place());
            record.setTrcretNo(qvr.getVe_card_no());
            record.setVeChkinVeownNm(qvr.getVe_owner_name());
            record.setVeChkinVeownCredNo(qvr.getVe_owner_no());
            record.setVeownInbordConcAddr(qvr.getOwner_inside_addr());
            record.setVeownInbordTelnum(qvr.getOwner_inside_tel());
            record.setVeTypecd(qvr.getVe_type());
            record.setCobrdNm(qvr.getBrand());
            record.setVefrmNo(qvr.getVe_frame_no());
            if(!StringUtils.isEmpty(qvr.getVe_ton())){
                record.setVrfcofCrypsgCnt(new BigDecimal(qvr.getVe_ton()));
            }
            if(!StringUtils.isEmpty(qvr.getSelf_wt())){
                record.setVeSelfWt(new BigDecimal(qvr.getSelf_wt()));
            }
            record.setVeColcd(qvr.getVe_body_color());
            if(!StringUtils.isEmpty(qvr.getAppr_period())){
                record.setRfileLicValidDate(DateUtil.parse(qvr.getAppr_period(), "yyyy-MM-dd"));
            }
            record.setApplyErName(qvr.getProposer());
            record.setVeNatyNm(qvr.getNationality());
            record.setEmvryCusrno(qvr.getAuditor());
            if(!StringUtils.isEmpty(qvr.getPropose_time())){
                record.setApplyTime(DateUtil.parse(qvr.getPropose_time(), "yyyy-MM-dd"));
            }
            if(!StringUtils.isEmpty(qvr.getAudit_time())){
                record.setEmvryTime(DateUtil.parse(qvr.getAudit_time(), "yyyy-MM-dd"));
            }
            record.setEmvryRmk(qvr.getAudit_memo());
            record.setRoadTrspmcBscNo(UUID.randomUUID().toString());
            record.setEmvryStscd("1");
            roadList.add(record);
        }
        return roadList;
    }
    private SOAPMessage  createSoapRequest(QueryVeRecord data) throws Exception {
        return createSoapRequest(data, "http://tempuri.org/Query_Ve_Record_3", "http://tempuri.org/");
    }
    private static SOAPMessage  createSoapRequest(QueryVeRecord data, String soapAction, String serverURI) throws Exception {
        SOAPMessage soapMsg = MessageFactory.newInstance().createMessage();
        MimeHeaders mimeHeaders = soapMsg.getMimeHeaders();
        mimeHeaders.addHeader("SOAPAction", soapAction);
        SOAPPart soapPart = soapMsg.getSOAPPart();
        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        String ServerURI = serverURI;
        SOAPBody soapBody = soapMsg.getSOAPBody();
        QName totalName = new QName(ServerURI,"Query_Ve_Record_3");
        SOAPBodyElement addBodyElement = soapBody.addBodyElement(totalName);
        QName qname1 = new QName(ServerURI,"audit_state");
        addBodyElement.addChildElement(qname1).setValue("1");
        QName qname2 = new QName(ServerURI,"domestic_lisence_no");
        if (data.getDomestic_lisence_no() == null) {
            addBodyElement.addChildElement(qname2).setValue("");
        }else {
            addBodyElement.addChildElement(qname2).setValue(data.getDomestic_lisence_no());
        }
        QName qname3 = new QName(ServerURI,"foreign_license");
        if (data.getForeign_license() == null) {
            addBodyElement.addChildElement(qname3).setValue("");
        }else {
            addBodyElement.addChildElement(qname3).setValue(data.getForeign_license());
        }
        QName qname4 = new QName(ServerURI,"ve_frame_no");
        if (data.getVe_frame_no() == null) {
            addBodyElement.addChildElement(qname4).setValue("");
        }else {
            addBodyElement.addChildElement(qname4).setValue(data.getVe_frame_no());
        }
        QName qname5 = new QName(ServerURI,"allow_ve_ie_port");
        if (data.getAllow_ve_ie_port() == null) {
            addBodyElement.addChildElement(qname5).setValue("");
        }else {
            addBodyElement.addChildElement(qname5).setValue(data.getAllow_ve_ie_port());
        }
        QName qname6 = new QName(ServerURI,"start_propose_time");
        if (data.getStart_propose_time() == null) {
            addBodyElement.addChildElement(qname6).setValue("1900-01-01");
        }else {
            addBodyElement.addChildElement(qname6).setValue(data.getStart_propose_time());
        }
        QName qname7 = new QName(ServerURI,"end_propose_time");
        if (data.getEnd_propose_time() == null) {
            addBodyElement.addChildElement(qname7).setValue(DateUtil.format(new Date(), "yyyy-MM-dd"));
        }else {
            addBodyElement.addChildElement(qname7).setValue(data.getEnd_propose_time());
        }
        soapMsg.writeTo(System.out);
        soapMsg.saveChanges();
        return soapMsg;
    }
    public static void main(String[] args) {
        Query_Ve_Record_3 t=new Query_Ve_Record_3();
        QueryVeRecord bsc =new QueryVeRecord();
        bsc.setDomestic_lisence_no("");
        try {
            List<RoadTrspmcBsc> roadList=t.queryExistsRemoteRoadTrspmc(bsc);
            RoadTrspmcBsc roadTrspmcBsc=roadList.get(0);
            System.out.println(roadTrspmcBsc.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
