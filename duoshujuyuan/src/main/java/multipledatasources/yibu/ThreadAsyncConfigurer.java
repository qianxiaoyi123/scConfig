package multipledatasources.yibu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * Created by zhangmingyu on 2019/1/16.
 */
@Component
@EnableAsync
@Configuration
public class ThreadAsyncConfigurer {


        @Bean("asyncServuceExecutor")
        public Executor asyncServuceExecutor() {
         //   ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
            ThreadPoolTaskExecutor executor = new VisiableThreadPoolTaskExecutor();
            executor.setCorePoolSize(10);//核心线程数,初始创建线程数
            executor.setMaxPoolSize(20);//最大线程，缓冲队列满了才会申请超过核心线程数
            executor.setQueueCapacity(200);//用来缓冲执行任务的队列
            executor.setKeepAliveSeconds(60);//允许线程空闲时间，超出核心线程在空闲时间到达之后被销毁
            executor.setThreadNamePrefix("mingyu-xc-");//线程池名前缀
            // executor.setRejectedExecutionHandler(new ThreadPoolTaskExecutor.);
            executor.setWaitForTasksToCompleteOnShutdown(true);
            executor.setAwaitTerminationSeconds(60);
            executor.initialize();
            return executor;

        }
    }


