package multipledatasources.msg;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.lang.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 为了 使反射创建的类也能使用事务 而建立的工具类
 */
@Component
public class ReceiveMsgUtil {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    /**
     * 解析报文报文
     */
    @Transactional
    public void receiveMessage(ReceiveMsgWithBLOBs receiveMsgWithBLOBs) throws IllegalAccessException, ClassNotFoundException, InstantiationException, ParserConfigurationException, IOException, SAXException, XPathExpressionException, JAXBException {

        //解析报文
        saveMessage(receiveMsgWithBLOBs);
    }



    /**
     * 解析报文，并保存到业务表中
     */
    private void saveMessage(ReceiveMsgWithBLOBs receiveMsgWithBLOBs) throws ParserConfigurationException, JAXBException, SAXException, XPathExpressionException, IOException {
        String massageCode = receiveMsgWithBLOBs.getMessageCode();
        //xml文件内容，此处的xml是加了签名的
        String messageContent = receiveMsgWithBLOBs.getMessageContent();
        String path = "/Signature/Object/Package";
        JaxbUtil jaxbUtil=new JaxbUtil();
        Package xmlPackage = jaxbUtil.convertXmlStrToJavaBean(messageContent, path);

        //包裹了业务数据的节点
        BussinessData bussinessData = xmlPackage.getDataInfo().getBussinessData();
        MessageHandle messageHandle = MessageFactory.createMessageHandle(massageCode);
        if (messageHandle != null){
            messageHandle.analyzeMessage(bussinessData);
        }else {
            logger.info("处理异常！类型报文【" + massageCode + "】没有找到相应的报文处理类");
            throw new RuntimeException("处理异常！类型报文【" + massageCode + "】没有找到相应的报文处理类");
        }
    }
}
