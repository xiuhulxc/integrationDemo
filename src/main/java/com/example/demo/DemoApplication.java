package com.example.demo;


import com.xxl.job.core.executor.XxlJobExecutor;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

// 开启定时任务注解
// @EnableScheduling
// 开启定时任务锁，默认设置锁最大占用时间为30s
// @EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
@ServletComponentScan
@SpringBootApplication
@MapperScan({"com.example.demo.service"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
