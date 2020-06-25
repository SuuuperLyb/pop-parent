package com.offway.lyb.controller;


import com.offway.lyb.sevice.MainPageService;
import com.offway.common.entity.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainPageController {

    @Resource
    private MainPageService mainPageService;

    //首页轮播图
    @GetMapping("api/mainpage/findAdPic.action")
    public R findAdPic(){
        return mainPageService.findAdPic();
    }

    //猜你喜欢
    @GetMapping("api/mainpage/findUserLikesGoods.action")
    public R findUserLikesGoods(){
        return mainPageService.findUserLikesGoods();
    }

    //今日爆款
    @GetMapping("api/mainpage/findTodayMoreSale.action")
    public R findTodayMoreSale(){
        return mainPageService.findTodayMoreSale();
    }



    //商品二级分类
    @GetMapping("api/mainpage/findSecGoodsType.action")
    public R findSecGoodsType(){
        return mainPageService.findSecGoodsType();
    }

    @GetMapping("api/mainpage/findGoodsBySecTypeId.action")
    public R findGoodsBySecTypeId(Integer sectypeId){
        return mainPageService.findGoodsBySecTypeId(sectypeId);
    }









}
