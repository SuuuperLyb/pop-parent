package com.offway.lyb.sevice;


import com.offway.common.entity.R;

public interface MainPageService  {
    //首页轮播图
    R findAdPic();

    //今日爆款
    R findTodayMoreSale();

    //猜你喜欢商品
    R findUserLikesGoods();



    //查询商品二级分类
    R findSecGoodsType();


    //根据二级商品分类id查询商品
    R findGoodsBySecTypeId(Integer sectypeId);






}
