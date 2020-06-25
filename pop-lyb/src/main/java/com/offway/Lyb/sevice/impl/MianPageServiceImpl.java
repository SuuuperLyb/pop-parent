package com.offway.Lyb.sevice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.offway.Lyb.dto.UserLikeGoodsDto;
import com.offway.Lyb.sevice.MainPageService;
import com.offway.common.entity.*;
import com.offway.common.mapper.*;
import com.offway.common.util.Rutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.offway.Lyb.mapper.TUserlikeMapper;

import javax.annotation.Resource;
import java.util.List;



@Service
public class MianPageServiceImpl implements MainPageService {


    @Resource
    private TCouponMapper tCouponMapper;

    @Resource
    private TGoodsDetailMapper tGoodsDetailMapper;

    @Resource
    private TUserlikeMapper tUserlikeMapper;

    @Resource
    private TSectypeMapper tSectypeMapper;


    @Override
    public R findAdPic() {
        List<TCoupon> tCouponList = tCouponMapper.selectList(new QueryWrapper<TCoupon>().orderByDesc("c_sort").last("limit 5"));
        return Rutil.Ok(tCouponList);
    }

    @Override
    public R findTodayMoreSale() {
        List<TGoodsDetail> tGoodsDetailList = tGoodsDetailMapper.selectList(new QueryWrapper<TGoodsDetail>().orderByDesc("t_goods_sales").last("limit 4"));
        return Rutil.Ok(tGoodsDetailList);
    }

    @Override
    public R findUserLikesGoods() {
        List<UserLikeGoodsDto> tUserlikeList = tUserlikeMapper.secletUserGoods();
        return null;
    }


    @Override
    public R findSecGoodsType() {
        List<TSectype> tSectypeList = tSectypeMapper.selectList(new QueryWrapper<TSectype>());
        return Rutil.Ok(tSectypeList);
    }

    @Override
    public R findGoodsBySecTypeId(Integer sectypeId) {
        List<TGoodsDetail> tGoodsDetailLsit = tGoodsDetailMapper.selectList(new QueryWrapper<TGoodsDetail>().eq("t_sectype_id",sectypeId));
        return Rutil.Ok(tGoodsDetailLsit);
    }
}
