package com.offway.hqs.util;


import com.offway.hqs.type.RCodeType;
import com.offway.hqs.vo.R;


/**
 * @program: HungryApi
 * @description: 封装对统一结果的操作
 * @author: Feri(邢朋辉)
 * @create: 2020-06-18 10:28
 */
public class RUtil {
    //
    public static R ok(String msg, Object data) {
        return new R(RCodeType.成功.getVal(), msg, data);
    }

    public static R ok(Object data) {
        return new R(RCodeType.成功.getVal(), "OK", data);
    }

    public static R ok() {
        return new R(RCodeType.成功.getVal(), "OK", null);
    }

    public static R error(String msg) {
        return new R(RCodeType.失败.getVal(), msg, null);
    }

    public static R error() {
        return new R(RCodeType.失败.getVal(), "失败", null);
    }
}
