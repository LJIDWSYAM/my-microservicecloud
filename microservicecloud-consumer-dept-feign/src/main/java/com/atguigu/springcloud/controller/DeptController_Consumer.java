package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/10
 * \* Time: 14:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.add(dept);
    }
}