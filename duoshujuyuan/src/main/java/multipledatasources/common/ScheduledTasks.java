package multipledatasources.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangmingyu on 2019/4/2.
 */
@Component
public class ScheduledTasks {
    private static Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
   // @Scheduled(fixedRate = 2000)
    public void testTask(){
        //System.out.println("定时任务执行时间"+dateFormat.format(new Date()));
        log.info("定时任务执行时间"+dateFormat.format(new Date()));
    }
}
