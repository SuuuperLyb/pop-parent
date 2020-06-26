package com.offway.lxm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDate;

/**
 * @Author LXM
 * @Date 2020/6/26 0026
 */
public class Order {
    /**
     * 主键id
     */
    private Integer oId;


    /**
     * 商品id
     */
    private Integer gId;
    /**
     *商品图片
     */
    private String iImgurl;
    /**
     * 商品标题
     */
    private String tGoodsName;
    /**
     * 商品现价
     */
    private Double tGoodsCurPrice;

    /**
     * 收货人id
     */
    private Integer udId;

    /**
     * 优惠券id
     */
    private Integer cId;

    /**
     * 订单编号(系统随机生成)
     */
    private String oNum;

    /**
     * 订单类型(待付款1,待发货2,待收货3,待评价4)
     */
    private Integer oType;

    /**
     * 购买商品数量
     */
    private Integer oGoodsNum;

    /**
     * 订单创建时间
     */
    private LocalDate oCreateTime;

    /**
     * 订单结算时间
     */
    private LocalDate oFinalTime;

    /**
     * 优惠前订单总金额
     */
    private Double oTotalMoney;

    /**
     * 实际付款金额
     */
    private Double oActualMoney;

    /**
     * 订单状态(存在1,删除0)
     */
    private Integer oStatus;
}
