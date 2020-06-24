package com.offway.hqs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
//  状态码
    private Integer code;
//    消息
    private String msg;
//    数据
    private Object data;
}
