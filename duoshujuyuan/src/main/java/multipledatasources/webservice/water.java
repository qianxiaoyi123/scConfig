package multipledatasources.webservice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import multipledatasources.bordertrade.controller.DoCheckRelManifestData;
import multipledatasources.common.WaterResponse;
import multipledatasources.water.controller.WaterFlightReqDTO;
import multipledatasources.water.controller.WaterFlightResDTO;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.service.model.BindingInfo;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.xml.namespace.QName;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangmingyu on 2020/1/8.
 * 水空舱单接口调用测试
 */
public class water {
    private static QName getOperateQname(Client client,String operation){
        Endpoint endpoint=client.getEndpoint();
        QName opName =new QName(endpoint.getService().getName().getNamespaceURI(),operation);
        BindingInfo bindingInfo=endpoint.getEndpointInfo().getBinding();
        if(bindingInfo.getOperation(opName)==null){
            for (BindingOperationInfo operationInfo:bindingInfo.getOperations()){
                if(operation.equals(operationInfo.getName().getLocalPart())){
                    opName=operationInfo.getName();
                    break;
                }
            }
        }
        return opName;
    }
    public static void main(String[] args) {

        //        private String ParamTransportId;//进出境运输工具代码  chuanbohao
//        private String ParamIeFlag;//进出口方式
//        private String ParamVoyageNo;//航班航次号
//        private String ParamTrafMod;//运输方式
//        private String ParamBillNo;//提运单号

//        private String ParamChkWt;//合住核销重量
        //        private String ParamFormID;//申报单编号
//        private String ParamCustomsCode;//管辖关区号码
//        private String ParamSetChkRel;//操作方式：（核注核销，反核注核销）核注：NTCHT 核销 CHK 反核注核销:UNCHK
//        private String ParamCheckRelType;//核注核销类型  空和1表示一对一核注，0表示一对多，这个参数只有核注时使用
        WaterFlightReqDTO manifest=new WaterFlightReqDTO("HS072101",
                "I",
                "HS072101",
                "2",
                "HS072101",
                "20000",
                "7210110320191112022",
                "7210",
                "NTCHT",
                "1");
        List<WaterFlightReqDTO> list =new ArrayList<WaterFlightReqDTO>();
        list.add(manifest);
        Gson gson = new Gson();
        String setMftParam = gson.toJson(list);
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://10.99.29.216/MFTOutService/ManifestWriterServiceHS.svc?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        //设置连接超时
//        HTTPConduit conduit= (HTTPConduit) client.getConduit();
//        HTTPClientPolicy policy=new HTTPClientPolicy();
//        policy.setConnectionTimeout(10000);//连接超时 默认30秒
//        policy.setAllowChunking(false); //取消块编码
//        policy.setReceiveTimeout(10000);//接收消息超时 默认60秒
//        conduit.setClient(policy);
    //当实现类与接口的命名空间不一致时，不符合规范，但是由于我们是调用方没办法，所以需要我们来调整
        //Qname 已知情况直接用这种方法直接创建
   //     QName operateQname=new QName("http://tempuri.org/","SetChkNew");
                //qname未知  需要动态获取
        QName operateQname=getOperateQname(client,"SetChkNew");
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke(operateQname,setMftParam);
            JSONObject jsonObject=JSONObject.parseObject((String) objects[0]);
            String ResultStatus=jsonObject.getString("ResultStatus");
            String ErrorData=jsonObject.getString("ErrorData");
            JSONArray jsonArray=jsonObject.getJSONArray("ResultData");
            for (int i = 0; i <jsonArray.size() ; i++) {
                JSONObject jsonObject1=jsonArray.getJSONObject(i);

                String ErrorMesg=jsonObject1.getString("ErrorMesg");
                System.out.println("ErrorMesg :"+ErrorMesg);
            }
            WaterResponse result=new JSONObject().parseObject(jsonObject.toString(), WaterResponse.class);
      //  List<String> ids=result.getResultData().stream().map(f ->f.)
            System.out.println("返回数据:" + result.toString());
           // System.out.println("返回数据:" + objects[0]);
          //  System.out.println("返回数据:" + ResultStatus+"ErrorData:"+ErrorData+"ResultData:"+ResultData);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}