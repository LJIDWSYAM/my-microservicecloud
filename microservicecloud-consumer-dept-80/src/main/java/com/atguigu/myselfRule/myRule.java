package com.atguigu.myselfRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/11
 * \* Time: 16:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Configuration

public class myRule
{
    @Bean
    public IRule mySelfRule(){
        return new RandomRule();
    }
}