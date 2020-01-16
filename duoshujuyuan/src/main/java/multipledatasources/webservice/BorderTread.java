package multipledatasources.webservice;

/**
 * Created by zhangmingyu on 2020/1/8.
 * 公路舱单接口调用测试
 */
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import multipledatasources.bordertrade.controller.DoCheckRelManifestData;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.math.BigDecimal;


public class BorderTread {
    public static void main(String[] args) {
        // 创建动态客户端
        DoCheckRelManifestData manifest=new DoCheckRelManifestData(
                "4123456789041",
                "001",
                "4",
                "E",
                "7207",
                "123",
                "100");
        Gson gson = new Gson();
        String json = gson.toJson(manifest);
        BigDecimal weight=new BigDecimal(manifest.getWeight());
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
       Client client = dcf.createClient("http://10.99.85.186/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL");
        //Client client = dcf.createClient("http://rmft.hg.cn/ManifestRoadBorderTrade/BorderTrade.asmx?WSDL");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("DoCheckRelManifest",manifest.getManifest_id(),manifest.getBill_no(),manifest.getDecl_traf_mode(),manifest.getI_e_flag(),manifest.getCustomscode(),manifest.getForm_id(),weight);


            //解析由string类型拼接的XML格式
            Document dom= DocumentHelper.parseText((String) objects[0]);
            Element root=dom.getRootElement();
            String Result=root.element("Result").getText();
            String Msg=root.element("Msg").getText();
            System.out.println("Result:" + Result+ "  Msg ："+Msg);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}