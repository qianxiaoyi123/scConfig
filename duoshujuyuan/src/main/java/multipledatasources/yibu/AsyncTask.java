package multipledatasources.yibu;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by zhangmingyu on 2019/1/9.
 * 最好将异步调用的方法写在@Component类中，或者所不要写在controller中，否则无法调用
 */
@Component
public class AsyncTask {

    @Async
    public void task1() throws  InterruptedException{
        long currentTimeMillis=System.currentTimeMillis();
        Thread.sleep(3000);
        long currentTimeMillis1=System.currentTimeMillis();
        System.out.println("task1任务耗时："+(currentTimeMillis1-currentTimeMillis)+"ms");
    }
    @Async
    public void task2() throws  InterruptedException{
        long currentTimeMillis=System.currentTimeMillis();
        Thread.sleep(6000);
        long currentTimeMillis1=System.currentTimeMillis();
        System.out.println("task2任务耗时："+(currentTimeMillis1-currentTimeMillis)+"ms");

    }
    @Async
    public void task3() throws  InterruptedException{
        long currentTimeMillis=System.currentTimeMillis();
        Thread.sleep(9000);
        long currentTimeMillis1=System.currentTimeMillis();
        System.out.println("task3任务耗时："+(currentTimeMillis1-currentTimeMillis)+"ms");

    }

}
