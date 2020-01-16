package multipledatasources.webservice;

/**
 * Created by zhangmingyu on 2020/1/8.
 * 监管场所接口地址调用测试
 */
import com.google.gson.Gson;
import multipledatasources.bordertrade.controller.DoCheckRelManifestData;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.math.BigDecimal;


public class GetBtDataFromCSA {
    public static void main(String[] args) {
        // 创建动态客户端

        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://10.99.23.76:7001/CSA/NetWsdlServiceBt?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));

        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("getBtDataFromCSA");
//            //解析由string类型拼接的XML格式
//            Document dom= DocumentHelper.parseText((String) objects[0]);
//            Element root=dom.getRootElement();
//            String Result=root.element("Result").getText();
//            String Msg=root.element("Msg").getText();
            System.out.println("返回数据:" + objects[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}