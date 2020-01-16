package multipledatasources.xiancheng;

import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.controller.BtrnbPrsnPutrecBscController;
import multipledatasources.service.BtrnbPrsnPutrecBscService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangmingyu on 2019/1/16.
 * 创建一个固定长度的线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
@RestController
public class NewFixedThreadPool {
    @Autowired
    private BtrnbPrsnPutrecBscController bt;
    public static  volatile int sum=10000;
   @Transactional
   @RequestMapping(value = "/allinsert1",method = RequestMethod.POST)
    public void test(@RequestBody String a){
        if(sum>0) {
            ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

            for (int i = 0; i < 1000; i++) {
                final int index = i;
                Long start=System.currentTimeMillis();
                //zai 未来某个时间执行给定的命令
                //该命令可能在新的线程、已入池的线程或者正在调用的 线程中执行，这有Executor实现决定
                fixedThreadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        List<BtrnbPrsnPutrecBscWithBLOBs> list=new ArrayList<>();

                        for (int j = 0; j <= 100; j++) {

                            String uuid= UUID.randomUUID().toString();
                            uuid=uuid.replace("-","");
                            BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs = new BtrnbPrsnPutrecBscWithBLOBs();
                            btrnbPrsnPutrecBscWithBLOBs.setBtrnbPrsnPutrecBscNo(uuid);
                            btrnbPrsnPutrecBscWithBLOBs.setGencd("3");
                            list.add(btrnbPrsnPutrecBscWithBLOBs);
                        }
                        bt.allinsert(list);


                    }
                });
                //提交一个runnable任务用于执行，并返回一个表示该任务的Future
                //该future的get方法在成功完成时将会返回给定的结果
                fixedThreadPool.submit(new Runnable() {
                    @Override
                    public void run() {
                        threadRunMethod(start);
                    }
                });
            }
            sum = sum - 100;
            fixedThreadPool.shutdown();
        }

    }


    public static void threadRunMethod(Long start){

   Long end=System.currentTimeMillis();
        System.out.println("插入数据库执行时间 ="+(end-start)/1000+"秒");
        System.out.println("已经插入"+(1000000-sum));
    }
}
