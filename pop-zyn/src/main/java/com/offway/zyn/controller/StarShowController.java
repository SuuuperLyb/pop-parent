package com.offway.zyn.controller;

import com.offway.common.entity.R;
import com.offway.common.three.JedisCore;
import com.offway.common.util.Rutil;
import com.offway.zyn.service.TStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    @Autowired
    JedisCore jedisCore;//redis 核心类，主要用来访问缓存

    /**
     * @Author starzyn
     * @Description 查询明星风格穿搭的轮播图
     * @Date 10:06 2020/6/25
     * @Param []
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/index")
    public R showMainStar(){
        boolean isExit = jedisCore.isExist("mainStarInfo");//判断缓存是否有明星穿搭的轮播图信息
        if(isExit){//如果缓存中存在
            return Rutil.Ok(jedisCore.getVal("mainStarInfo"));
        }else {//缓存中不存在，去数据库中查询并添加到缓存中
            tStarService.getMainStarInfo();
            return Rutil.Ok();
        }
    }

    /**
     * @Author starzyn
     * @Description 列出明星的所有信息，按照分页来展示
     * @Date 10:11 2020/6/25
     * @Param []
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/listAll")
    public R showAll(){
        return null;
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
