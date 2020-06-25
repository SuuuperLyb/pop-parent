package com.offway.zyn.controller;

import com.offway.common.three.JedisCore;
import com.offway.zyn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author starzyn
 * @className:TestController
 * @date : 2020/6/23
 * @description:
 */
@RestController
public class TestController {

    @Autowired
    TestService ts;

    JedisCore js = new JedisCore("175.24.95.117",6379,"147258");

    @RequestMapping("/test")
    public String test(){
        String name = js.getVal("name");
        System.out.println(name);
        return name;
    }
}
