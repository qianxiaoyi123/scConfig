package multipledatasources.water.controller;

import multipledatasources.water.controller.req.Request;
import multipledatasources.water.controller.req.RequestBody;
import multipledatasources.water.controller.res.Response;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by zhangmingyu on 2019/5/7.
 *
 */
public class test {


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
        RequestBody<List<WaterFlightReqDTO>> body=new RequestBody<List<WaterFlightReqDTO>>();
        body.setBody(list);
        Request<List<WaterFlightReqDTO>> req=new Request<List<WaterFlightReqDTO>>();
        req.setBody(body);
        WaterFlightServiceImpl waterFlightServiceimpl=new WaterFlightServiceImpl();
        Response<List<WaterFlightResDTO>> res= null;
        //---------



        try {
            res = waterFlightServiceimpl.waterFlightRequest(req);
            WaterFlightResDTO resDto=res.getBody().getBody().get(0);
            if(!StringUtils.isEmpty(resDto.getSuccessMesg())){
                manifest.setRetMsg(resDto.getSuccessMesg());
                System.out.println(manifest.getRetMsg());

            }
            if(!StringUtils.isEmpty(resDto.getErrorMesg())){
                System.out.println(resDto.getErrorMesg());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("单证【"+manifest.getParamFormID()+"】出境水空舱单接口调用返回值："+res);
        if(StringUtils.isEmpty(res) ||  StringUtils.isEmpty(res.getBody()) || StringUtils.isEmpty(res.getBody().getBody())){
            System.out.println("水空舱单:接口调用失败");
        }
    }
}
