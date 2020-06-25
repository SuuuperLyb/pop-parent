package com.offway.lyb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.offway.common.entity.TUserlike;
import com.offway.lyb.dto.UserLikeGoodsDto;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LYB
 * @since 2020-06-23
 */

public interface TUserlike2Mapper {

    List<UserLikeGoodsDto> secletUserGoods();

}
