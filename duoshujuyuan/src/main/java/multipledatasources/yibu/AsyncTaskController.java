package multipledatasources.yibu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@RestController
@RequestMapping("")
public class AsyncTaskController {
    @Autowired


    private AsyncTask asyncTask;
    @Autowired
    private AsyncDemo asyncDemo;
    @Autowired
    private AsyncService asyncService;

    @RequestMapping("asynctime")
    public String doTask() throws InterruptedException{
        long currenTimeMillis = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        long currenTimeMillis1=System.currentTimeMillis();
        return "task任务总耗时："+(currenTimeMillis1-currenTimeMillis)+"ms";

    }

    @RequestMapping("asyncDemo")
    public String asyncDemo() throws InterruptedException{
    asyncDemo.sayncInvokeWithParameter("test");
        Future<String> future=asyncDemo.asyncInvokeReturnFuture(100);
        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "ok";
    }
    @RequestMapping("asyncDemo2")
    public void contextLoads() throws InterruptedException, ExecutionException {
     //   asyncDemo.asyncInvokeSimplest();
        asyncDemo.sayncInvokeWithParameter("test");
        Future<String> future = asyncDemo.asyncInvokeReturnFuture(100);
        System.out.println(future.get());

    }
    @RequestMapping("/async2")
    public void async2(){
        asyncService.executeAsync();
    }
}
