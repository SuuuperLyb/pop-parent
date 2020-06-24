package com.offway.hqs.type;

/**
 * @description: 定义统一结果返回的状态码 枚举
 *
 */
public enum RCodeType {
    成功(200), 失败(400);

    private int val;

    private RCodeType(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }
}
