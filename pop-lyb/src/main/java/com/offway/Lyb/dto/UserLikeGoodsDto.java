package com.offway.Lyb.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLikeGoodsDto {

    private Integer goodsId;

    private Integer goodsCount;

}
