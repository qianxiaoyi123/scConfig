package multipledatasources.controller;

import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.common.Cache;
import multipledatasources.common.JsonResult;
import multipledatasources.service.AsyncServiceImpl;
import multipledatasources.service.BtrnbPrsnPutrecBscService;
import org.apache.commons.lang3.RandomUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Transient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangmingyu on 2019/3/25.
 */
@RestController
public class BtrnbPrsnPutrecBscController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BtrnbPrsnPutrecBscService bt;
    @Autowired
    private AsyncServiceImpl at;
    @Autowired
    private Cache cache;


    @RequestMapping("/BtrnbPrsnPutrecBsc")
    public String BtrnbPrsnPutrecBsc() {
        int a = bt.test01_delete("72229baa-0489-44d7-ad4c-e7ec4eb39e88");
        System.out.println(a);
        return "success";
    }

    @RequestMapping("/BtrnbPrsnPutrecBscUpdate")
    public String BtrnbPrsnPutrecBscUpdate() {
        BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
        btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecBscNo("884b9baa-0489-44d7-ad4c-e7ec4eb39ef7");
        btrnbPrsnPutrecBscWithBLOBs.setGencd("1");
        int a = bt.test01_update(btrnbPrsnPutrecBscWithBLOBs);
        System.out.println(a);
        return "success";
    }
    @RequestMapping(value = "/DuoXianCheng1009",method = RequestMethod.POST)
    public String BtrnbPrsnPutrecBscInsert(@RequestBody BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs ) {
      //  BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
       // btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecBscNo(BtrnbPrsnPutrecBscNo);
      //  btrnbPrsnPutrecBscWithBLOBs.setGencd("1");
      //  System.out.println(btrnbPrsnPutrecBscWithBLOBs.toString());
        int a = bt.test01_BtrnbPrsnPutrecBscInsert(btrnbPrsnPutrecBscWithBLOBs);
        System.out.println(a);
        return "success";
    }
    @RequestMapping(value = "/DuoXianCheng100901",method = RequestMethod.POST)
    public String BtrnbPrsnPutrecBscInsert01(String BtrnbPrsnPutrecBscNo ,String Gencd ) {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
         btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecBscNo(BtrnbPrsnPutrecBscNo);
          btrnbPrsnPutrecBscWithBLOBs.setGencd(Gencd);
        //  System.out.println(btrnbPrsnPutrecBscWithBLOBs.toString());
        int a = bt.test01_BtrnbPrsnPutrecBscInsert(btrnbPrsnPutrecBscWithBLOBs);
        System.out.println(a);
        return "success";
    }
    @RequestMapping(value = "/allinsert",method = RequestMethod.POST)
    public String allinsert(@RequestBody List<BtrnbPrsnPutrecBscWithBLOBs> list){
     //   System.out.println(list.get(1).getBtrnbPrsnPutrecBscNo());
       int a=bt.test01_BtrnbPrsnPutrecBscALLInsert(list);
      //  System.out.println(a);
       // int a= 3/0;
        return "返回"+a;
    }
    @RequestMapping(value = "/allinsert1106",method = RequestMethod.POST)
    public String allinsert1106(@RequestBody List<BtrnbPrsnPutrecBscWithBLOBs> list1){
        Long start=System.currentTimeMillis();
        for (int j = 0; j <20000 ; j++) {


        List<BtrnbPrsnPutrecBscWithBLOBs> list=new LinkedList<>();
        Date date=new Date(new Date().getTime());
        for (int i = 0; i <100 ; i++) {
            String uuid= UUID.randomUUID().toString();
            uuid=uuid.replace("-","");
            BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
            btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecBscNo(uuid);
            btrnbPrsnPutrecBscWithBLOBs.setGencd("3");
            btrnbPrsnPutrecBscWithBLOBs.setFstFgprtInfo("11");
            btrnbPrsnPutrecBscWithBLOBs.setPhotoInfo("11");
            btrnbPrsnPutrecBscWithBLOBs.setSecdFgprtInfo("11");
            btrnbPrsnPutrecBscWithBLOBs.setCreateErName(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setBirplNm(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setEmvryOpinDesc(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecNo(uuid);
            btrnbPrsnPutrecBscWithBLOBs.setDclTime(date);
            btrnbPrsnPutrecBscWithBLOBs.setGencd(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setIdno(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setIdnoHashNo(String.valueOf(RandomUtils.nextInt(1,10)));
            btrnbPrsnPutrecBscWithBLOBs.setIdcdValidBeginDate(date);
            btrnbPrsnPutrecBscWithBLOBs.setBirplNm(String.valueOf(RandomUtils.nextInt(1,10)));

            list.add(btrnbPrsnPutrecBscWithBLOBs);
        }
        at.test01_executeAsync(list);
            Long end=System.currentTimeMillis();
        }
        Long end=System.currentTimeMillis();


        return "返回";
    }

    @RequestMapping(value = "/testexception", method = RequestMethod.POST)
    public String testexception() {
        String info = "你好";
        int a = 1 / 0;
        return "info";
    }

    @RequestMapping("/SelectCache")
    public String SelectCache() {

        BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
        btrnbPrsnPutrecBscWithBLOBs = cache.SelectCache("4d4f9587-df7f-4637-8e81-90f418e16cab");
        System.out.println("输出测试" + btrnbPrsnPutrecBscWithBLOBs.getBtrnbPrsnPutrecBscNo());
        return JsonResult.success();
    }

    @RequestMapping("/upCache")
    public String upCache() {

        BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
        btrnbPrsnPutrecBscWithBLOBs = cache.upCache("4d4f9587-df7f-4637-8e81-90f418e16cab");
        System.out.println("输出测试" + btrnbPrsnPutrecBscWithBLOBs.getBtrnbPrsnPutrecBscNo());
        return JsonResult.success();
    }


}
