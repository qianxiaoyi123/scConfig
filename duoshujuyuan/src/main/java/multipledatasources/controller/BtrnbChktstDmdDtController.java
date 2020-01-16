package multipledatasources.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.github.pagehelper.PageInfo;
import multipledatasources.bean.BtrnbChktstDmdDt;
import multipledatasources.common.JsonResult;
import multipledatasources.common.ReturnResultJson;
import multipledatasources.service.BtrnbChktstDmdDtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangmingyu on 2019/3/25.
 */
@RestController
public class BtrnbChktstDmdDtController {//extends Quer{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BtrnbChktstDmdDtService bt;
    @Resource
     BtrnbChktstDmdDt b;

    @RequestMapping("/BtrnbChktstDmdDt.do")
    public BtrnbChktstDmdDt BtrnbChktstDmdDt() {
        BtrnbChktstDmdDt btrnbChktstDmdDt = bt.test01_select("263d968499db4d37ad6894df7638bb2d");
        System.out.println(btrnbChktstDmdDt.toString() + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return btrnbChktstDmdDt;
    }
    @RequestMapping("/selectAll.do")
    public String selectAll() {
        List<BtrnbChktstDmdDt> btrnbChktstDmdDt = bt.test01_selectAll();
        System.out.println(btrnbChktstDmdDt + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return "success";
    }
    @RequestMapping("/selectAllpage.do")
    public PageInfo selectAllpage() {
        return bt.test01_selectAllpage();
    }

    //分页
    @RequestMapping("/Result.do")
    public ReturnResultJson Result() {
        return new ReturnResultJson(true, bt.test01_selectAllpage());
    }
    @RequestMapping(value="/testexception2")
    public String testexception2() {
        System.out.println("zmy");
       BtrnbChktstDmdDt btrnbChktstDmdDt = bt.test01_select("263d968499db4d37ad6894df7638bb2d");

        Map<String, Object> data=new HashMap<>();
        data.put("btrnbChktstDmdDt",btrnbChktstDmdDt);
        return JsonResult.success(data);
    }
    @RequestMapping(value="/testexception3")
    public String testexception3() {
       // BtrnbChktstDmdDt b=new BtrnbChktstDmdDt();
        b.setBtrnbChktstDmdDtNo("520");
        System.out.println(b.getBtrnbChktstDmdDtNo());

        Map<String, Object> data=new HashMap<>();
        data.put("BtrnbChktstDmdDtNo",b.getBtrnbChktstDmdDtNo());
        return JsonResult.success(data);
    }
    @RequestMapping(value="/testexception4")
    public String testexception4() {
      //  BtrnbChktstDmdDt b=new BtrnbChktstDmdDt();
        System.out.println(b.getBtrnbChktstDmdDtNo());

        Map<String, Object> data=new HashMap<>();
        data.put("BtrnbChktstDmdDtNo",b.getBtrnbChktstDmdDtNo());
        return JsonResult.success(data);
    }
    //测试解析json
//    @RequestMapping(value="zhangmingyu6",method = RequestMethod.POST)
    private JSONObject serializeHttpServletRequest(HttpServletRequest request) throws IOException {
        // 获取输入流
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));

        // 写入数据到Stringbuilder
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = streamReader.readLine()) != null) {
            sb.append(line);
        }
        JSONObject jsonParam = JSONObject.parseObject(sb.toString(), Feature.OrderedField);
       // String a = (String)jsonParam.get("a");
        //String b = (String)jsonParam.get("b");
        logger.info(jsonParam.toJSONString());

        return jsonParam;
    }

        @PostMapping("/igdsdclBsc/applySubmit")
    public ReturnResultJson outInfoSysIgdsdclBsc(HttpServletRequest request) {
            JSONObject jsonParam = null;
            try {
                jsonParam = serializeHttpServletRequest(request);
            } catch (IOException e) {
                logger.info("关闭流异常" + e);
                return new ReturnResultJson(false, "", "99", e.getMessage());
            }
            if (jsonParam == null || jsonParam.isEmpty()) {
                return new ReturnResultJson(false, "", "99", "传入参数不能为空");
            }
            JSONObject bizDataJsonObj = (JSONObject) jsonParam.get("bizData");
            String bizSignature = (String) jsonParam.get("bizSignature");
            return new ReturnResultJson(false, "", "99", "传入参数不能为空");
        }

//    public ReturnResultJson resulttest(@RequestBody Dis request){
//
//    }

}
