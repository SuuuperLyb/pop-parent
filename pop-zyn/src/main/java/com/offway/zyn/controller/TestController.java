package com.offway.zyn.controller;

import com.offway.common.entity.TAdmin;
import com.offway.zyn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/test")
    public List<TAdmin> test(){
        return ts.queryAll();
    }
}
