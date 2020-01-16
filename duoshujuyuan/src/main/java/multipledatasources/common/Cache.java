package multipledatasources.common;

import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.dao.BtrnbPrsnPutrecBscDao;
import multipledatasources.service.BtrnbPrsnPutrecBscService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by zhangmingyu on 2019/3/28.
 */
@Component
public class Cache {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BtrnbPrsnPutrecBscService bt;

//    @Cacheable(cacheNames = "btrnbPrsnPutrecBscWithBLOBs",key = "targetClass + methodName +#p0")
//    public BtrnbPrsnPutrecBscWithBLOBs SelectCache(String id){
//        logger.info("缓存中没有 从数据库里取");
//        return bt.test01_SelectCache(id);
//    }
    @Cacheable(cacheNames = "btrnbPrsnPutrecBscWithBLOBs",key = "targetClass + methodName +#p0")
    public BtrnbPrsnPutrecBscWithBLOBs SelectCache(String id){
        logger.info("缓存中没有 从数据库里取");
        return bt.test01_SelectCache(id);
    }
    @CachePut(cacheNames = "btrnbPrsnPutrecBscWithBLOBs",key = "targetClass + methodName +#p0")
    public BtrnbPrsnPutrecBscWithBLOBs upCache(String id){
        logger.info("缓每次都执行 从数据库里取，且更新缓存");
        return bt.test01_SelectCache(id);
    }

}
