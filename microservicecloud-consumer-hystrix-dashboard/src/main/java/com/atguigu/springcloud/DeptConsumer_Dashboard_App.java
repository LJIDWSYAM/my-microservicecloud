package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/12
 * \* Time: 15:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class,args);
    }
}