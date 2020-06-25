package com.offway.Lyb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.offway.Lyb.dto.UserLikeGoodsDto;
import com.offway.common.entity.TUserlike;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LYB
 * @since 2020-06-23
 */
public interface TUserlikeMapper extends BaseMapper<TUserlike> {

    List<UserLikeGoodsDto> secletUserGoods();

}
