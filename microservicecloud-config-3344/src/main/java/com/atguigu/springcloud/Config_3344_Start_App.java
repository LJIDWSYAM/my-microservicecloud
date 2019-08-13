package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/13
 * \* Time: 10:00
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_Start_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_Start_App.class,args);
    }
}