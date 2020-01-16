package multipledatasources.controller;


import multipledatasources.bean.TeachersBean;
import multipledatasources.bean.TestBean;
import multipledatasources.msg.ReceiveMsg;
import multipledatasources.msg.ReceiveMsgUtil;
import multipledatasources.msg.ReceiveMsgWithBLOBs;
import multipledatasources.service.TransactionService1;
import multipledatasources.service.TransactionService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * 多数据源事务测试
 *
 * @author acer
 *BtrnbChktstDmdDt
 */
@RestController
public class TransactionController {
	@Autowired
	private TransactionService1 ts1;
	@Autowired
	private TransactionService2 ts2;


	@RequestMapping("/savetest.do")
	public String savetest() {
		TestBean tb = new TestBean();
		tb.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		tb.setScore(70);
		tb.setClassid("1");
		tb.setUserid("a");
		ts1.test01_saveTestBean(tb);
		return "success";
	}

	@RequestMapping("/saveteacher.do")
	public String saveteacher() {
		TeachersBean tb = new TeachersBean();
		tb.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		tb.setTeachername("王老师");
		tb.setClassid("1");
		ts2.test02_saveTeachersBean(tb);
		return "success";
	}
	@RequestMapping("/select.do")
	public String select() {

		Map<String, Object> str=ts2.test02_select();
		System.out.println(str+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return "success";
	}
	@RequestMapping("/select1.do")
	public String select1() {

		Map<String, Object> str=ts1.test01_select();
		System.out.println(str+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return "success";
	}
	@RequestMapping("/select2.do")
	public String select2() {

		Map<String, Object> str=ts1.test01_select();
		System.out.println(str+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return "success";
	}
	@RequestMapping("/select3.do")
	public String select3() {

		Map<String, Object> str=ts1.test01_select3();
	//	System.out.println(str+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ReceiveMsgWithBLOBs rbs=new ReceiveMsgWithBLOBs();
		rbs.setMessageContent(str.get("MESSAGE_CONTENT").toString());
		rbs.setMessageCode(str.get("MESSAGE_CODE").toString());
		rbs.setId(str.get("ID").toString());
		rbs.setMessageId(str.get("MESSAGE_ID").toString());
		rbs.setBizId(str.get("BIZ_ID").toString());
		rbs.setSenderId(str.get("SENDER_ID").toString());
		rbs.setNotes("null");
		ReceiveMsgUtil rm= new ReceiveMsgUtil();
		try {
			rm.receiveMessage(rbs);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "success";
	}




}
