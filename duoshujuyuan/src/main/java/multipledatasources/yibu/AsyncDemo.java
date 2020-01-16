package multipledatasources.yibu;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Created by zhangmingyu on 2019/1/9.
 * 异步调用 有返回值
 */
@Component
public class AsyncDemo {
   // private static final Logger log= LoggerFactory.getLogger(AsyncDemo.class);

    //带参数的异步调用
    @Async
    public void sayncInvokeWithParameter(String s){
        System.out.println("传入参数是："+s);
    }
    //异常调用返回future
    @Async
    public Future<String>asyncInvokeReturnFuture(int i){
        System.out.println("传入int参数i"+i);
        Future<String>future;
        try {
            Thread.sleep(1000*1);
            future=new AsyncResult<String>("success:"+i);
        }catch (InterruptedException e){
            future=new AsyncResult<String>("error");
        }
        return future;
    }



}
