package multipledatasources.service;

import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.dao.BtrnbPrsnPutrecBscDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmingyu on 2019/11/6.
 */
@Service
public class AsyncServiceImpl {
    @Autowired
    private BtrnbPrsnPutrecBscDao bt;
    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);
    public static  volatile int sum=0;
    public static  volatile long time=0;


    @Async("asyncServiceExecutor")
    public void test01_executeAsync(List<BtrnbPrsnPutrecBscWithBLOBs> btrnbPrsnPutrecBscWithBLOBs) {
        logger.info("start executeAsync");

        int a=bt.allinsert(btrnbPrsnPutrecBscWithBLOBs);

        sum=sum+100;



        logger.info("end executeAsync");
    }
}
