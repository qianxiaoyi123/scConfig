package multipledatasources.yibu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by zhangmingyu on 2019/1/16.
 */
@Service
public class AsyncServiceimpl implements AsyncService {
    private static final Logger logger= LoggerFactory.getLogger(AsyncServiceimpl.class);
    @Override
    @Async("asyncServuceExecutor")
    public void executeAsync() {
        logger.info("start  executeAsync");
        System.out.println("异步线程要做的事");
        System.out.println("可以在这里执行批量插入等耗时的事情");
        logger.info("end executeAsync ");

    }
}
