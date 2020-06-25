package com.offway.zyn.controller;

import com.alibaba.fastjson.JSONArray;
import com.offway.common.entity.R;
import com.offway.common.entity.TStarStyle;
import com.offway.common.three.JedisCore;
import com.offway.common.util.Rutil;
import com.offway.zyn.service.TStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author starzyn
 * @className:StarShowController
 * @date : 2020/6/25
 * @description: 明星展示的主页面
 */
@RestController
public class StarShowController {
    @Autowired
    TStarService tStarService;//明星类的业务层


    /**
     * @Author starzyn
     * @Description 查询明星风格穿搭的轮播图
     * @Date 10:06 2020/6/25
     * @Param []
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/index")
    public R showHotStar(){
        return tStarService.getHotStyle();
    }

    /**
     * @Author starzyn
     * @Description 列出明星的所有信息，按照分页来展示
     * @Date 10:11 2020/6/25
     * @Param []
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/listAll")
    public R showAll(@RequestParam(name = "startPage",defaultValue = "1") int startPage,@RequestParam(name = "pageSize",defaultValue = "6")int pageSize){
        return tStarService.listAll(startPage,pageSize);
    }

    /**
     * @Author starzyn
     * @Description 根据发送请求到后台的明星姓名来查询该明星的所有会穿搭
     * @Date 10:17 2020/6/25
     * @Param [starName]
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/listByname")
    public R listByname(@RequestParam(name = "starName",required = false) String starName){
        return null;
    }

   /**
    * @Author starzyn
    * @Description 点击我喜欢根据明星风格id来给该明星风格添加热度
    * @Date 11:36 2020/6/25
    * @Param [id]
    * @return com.offway.common.entity.R
    **/
    @GetMapping("/star/addlike")
    public R addLike(@RequestParam(name = "starStyleId") String id){
        return null;
    }
}
