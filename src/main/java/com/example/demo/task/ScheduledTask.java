package com.example.demo.task;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/10/23 15:45
 * @version: 1.0
 */
@Component
public class ScheduledTask {


    @Scheduled(cron = "0/9 * * * * ? ")
    @SchedulerLock(name = "all") //name的值就是下面方法的名字,默认为锁名字
    public void all() throws Exception {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(12000);
        System.out.println("定时任务执行!!!!");
        System.out.println(System.currentTimeMillis());

    }
}
