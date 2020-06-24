package com.offway.zyn.controller;

import com.offway.zyn.dto.R;
import com.offway.zyn.service.TStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author starzyn
 * @className:StarShowController
 * @date : 2020/6/24
 * @description: 明星的穿搭风格展示页面控制器
 */
public class StarShowController {

    @Autowired
    TStarService tStarService;
    /**
     * @Author starzyn
     * @Description 展示首页上面的所有数据
     * @Date 16:12 2020/6/24
     * @Param []
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("/index")
    public R showAll(){
        return null;
    }

    @RequestMapping("/starShow")
    public R starShow(){
        return null;
    }

    
}
