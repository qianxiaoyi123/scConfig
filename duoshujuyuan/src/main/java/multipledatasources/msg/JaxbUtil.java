package multipledatasources.msg;


import multipledatasources.msg.Package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;


public class JaxbUtil {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	public JaxbUtil() throws ParserConfigurationException, JAXBException {
	}

	/**
	 * JavaBean转换成xml文件 默认编码UTF-8
	 * @throws JAXBException 
	 * 
	 */
	public static boolean convertToXmlFile(Object obj, String filename) throws JAXBException {
		return convertToXmlFile(obj,  filename,"UTF-8");
	}	
	
	/**
	 * JavaBean转换成xml文件	 
	 * @param obj
	 * @param filename
	 * @param encoding
	 * @return
	 * @throws JAXBException 
	 */
	public static boolean convertToXmlFile(Object obj, String filename,String encoding) throws JAXBException {
		boolean result = false;
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		marshaller.marshal(obj, new File(filename));
		result = true;
		return result;
	}
	
//==============================================================================================================
	
	/**
	 * JavaBean转换成xml 字符串	 
	 * @param obj
	 * @param encoding 为空时,默认为utf-8
	 * @return
	 * @throws JAXBException 
	 */
	public static String convertToXmlStr(Object obj) throws JAXBException {
		String encoding="UTF-8";
		return convertToXmlStr(obj,encoding);
		
	}
	
	/**
	 * JavaBean转换成xml 字符串	 
	 * @param obj
	 * @param encoding 字符串编码
	 * @return
	 * @throws JAXBException 
	 */
	public static String convertToXmlStr(Object obj, String encoding) throws JAXBException {		
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
//		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //换行
		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
	}
	
	
//==========================================================================================================

	/**
	 * 将 objMain 和  objDetail 对象转成xml 文件
	 * @param objMain
	 * @param objDetail
	 * @param pathname
	 * @return  
	 * @throws JAXBException
	 */
	public static boolean convertToXmlFile(Object objMain,Object objDetail,String pathname) throws JAXBException {		
		return convertToXmlFile(objMain,objDetail,pathname,"UTF-8");
	}
	
	/**
	 * 将 objMain 和  objDetail 对象转成xml 文件
	 * @param objMain
	 * @param objDetail
	 * @param pathname
	 * @param encoding
	 * @return 
	 * @throws JAXBException
	 */
	public static boolean convertToXmlFile(Object objMain,Object objDetail,String pathname,String encoding) throws JAXBException {		
		boolean result=false;
		JAXBContext context = JAXBContext.newInstance(objMain.getClass(),objDetail.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		
		marshaller.marshal(objMain, new File(pathname));
		result = true;
		return result;
	}	
	
	
	
//==========================================================================================================
	
	/**
	 * 将 objMain 对象转成xml 字符串
	 * @param <T>
	 * @param objMain
	 * @param clazz
	 * @return String
	 * @throws JAXBException
	 */
	public static  String convertToXmlStr(Object objMain,Class<?> clazz) throws Exception {		 		
		return convertToXmlStr(objMain,clazz,"UTF-8");
	}
	
	/**
	 * 将 objMain 对象转成xml 字符串
	 * @param <T>
	 * @param objMain
	 * @param clazz
	 * @param encoding
	 * @return String
	 * @throws JAXBException
	 */
	public static  String convertToXmlStr(Object objMain,Class<?> clazz, String encoding) throws Exception {		 		
		JAXBContext context = JAXBContext.newInstance(objMain.getClass(),clazz);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		
		StringWriter writer = new StringWriter();
        marshaller.marshal(objMain,writer);
        return writer.toString() ;
	}
	
//==========================================================================================================

	/**
	 * 将 objMain 对象转成xml 字符串
	 * @param <T>
	 * @param objMain
	 * @param clazz
	 * @param pathname
	 * @return 
	 * @throws JAXBException
	 */
	public static  boolean convertToXmlFile(Object objMain,Class<?> clazz,String pathname) throws Exception {		 		
		return convertToXmlFile(objMain,clazz,pathname,"UTF-8");
	}
	
	/**
	 * 将 objMain 对象转成xml 字符串
	 * @param <T>
	 * @param objMain
	 * @param clazz
	 * @param pathname
	 * @param encoding
	 * @return 
	 * @throws JAXBException
	 */
	public static  boolean convertToXmlFile(Object objMain,Class<?> clazz,String pathname, String encoding) throws Exception {		 		
		boolean result=false;
		JAXBContext context = JAXBContext.newInstance(objMain.getClass(),clazz);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		
		marshaller.marshal(objMain, new File(pathname));
		result = true;
		return result;
	}	
	
	
	/**
	 * xml 一段数据  转换成JavaBean
	 * @param File xml文件
	 * @param xmlExpress 截取xml path，
	 *          比如： /Signature/Object/Package/DataInfo/BussinessData等
	 * @param clazz 类的实例
	 * @return
	 * @throws JAXBException
	 */
	public static <T> T converyToInnerJavaBean(File file,String xmlExpress, Class<T> clazz) 
			throws XPathExpressionException,ParserConfigurationException, SAXException,IOException,JAXBException {		
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse(file);
		XPath xpath = XPathFactory.newInstance().newXPath();
		Node widgetNode = (Node) xpath.evaluate(xmlExpress, document, XPathConstants.NODE);
					
		JAXBContext context = JAXBContext.newInstance(clazz);
	    Binder<Node> binder = context.createBinder();
	    T t=(T)binder.unmarshal(widgetNode);
	    return t;		     	
	}


	/**
	 * 如果当前DocumentBuilder对象正在转换文档，此时再次请求转换文档，
	 * 那么直接抛出XNIException(“FWK005 parse may not be called while parsing.”);异常。
	 * 方一：synchronized
	 * 方二：ThreadLocal
	 */
	private ThreadLocal<DocumentBuilder> builderThreadLocal = new ThreadLocal() {
		protected DocumentBuilder initialValue() {
			try {
				return DocumentBuilderFactory.newInstance().newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				throw new IllegalStateException(e);
			}
		}
	};

	/**
	 * 这个可以不使用ThreadLocal 直接new 成本微乎其微
	 */
	private ThreadLocal<XPath> xpathThreadLocal = new ThreadLocal() {
		protected XPath initialValue() {
			return XPathFactory.newInstance().newXPath();
		}
	};

	/**
	 * 一定不能直接new 在多线程下，每次newInstance的时间与线程数成正比
	 */
	private ThreadLocal<JAXBContext> JAXBContextThreadLocal = new ThreadLocal() {
		protected JAXBContext initialValue() {
			try {
				return JAXBContext.newInstance(Package.class);
			} catch (JAXBException e) {
				throw new IllegalStateException(e);
			}
		}
	};


	public <T> T convertXmlStrToJavaBean(String xmlStr, String xmlExpress)
			throws XPathExpressionException, SAXException,IOException,JAXBException {
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xmlStr.getBytes());
		Document document = builderThreadLocal.get().parse(byteArrayInputStream);
		Node widgetNode = (Node) xpathThreadLocal.get().evaluate(xmlExpress, document, XPathConstants.NODE);
		Binder<Node> binder = JAXBContextThreadLocal.get().createBinder();
		return (T)binder.unmarshal(widgetNode);
	}
	
	
	/**
	 * xml转换成JavaBean
	 * 
	 * @param xml
	 * @param c
	 * @return
	 * @throws JAXBException
	 */
	public static <T> T converyToJavaBean(String file, Class<T> c) throws JAXBException {
		T t = null;
		JAXBContext context = JAXBContext.newInstance(c);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		t = (T) unmarshaller.unmarshal(new File(file));
		return t;
	}	

	@SuppressWarnings("unchecked")
	public <T> T converyToJavaBean(File sourceFile, Class<T> c) {
		T t = null;
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(c);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			t = (T) unmarshaller.unmarshal(sourceFile);
		} catch (JAXBException e) {
			logger.info("JAXB异常" + e);
		}
		
		return t;
	}
	
	
}
