package com.offway.zyn.dto;

/**
 * @author starzyn
 * @className:R
 * @date : 2020/6/24
 * @description: 返回给前端的结果集
 */
public class R {
    private int status;//状态码：200 发送成功；500 错我
    private String msg;//响应信息
    private Object data;//发送给前端的数据

    public R(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @Author starzyn
     * @Description 设置请求成功的方法，只需要传入数据就好了
     * @Date 16:45 2020/6/24
     * @Param [data]
     * @return com.offway.zyn.dto.R
     **/
    public static R setOK(Object data){
        return new R(200,"OK",data);
    }

    /**
     * @Author starzyn
     * @Description 设置错误的静态方法，错误的方法中不需要有数据，而错误信息多种多样，因此，错误信息需要传入
     * @Date 16:47 2020/6/24
     * @Param [msg]
     * @return com.offway.zyn.dto.R
     **/
    public static R setERROR(String msg){
        return new R(500,msg,null);
    }

    /**
     * @Author starzyn
     * @Description 在不知道请求成功与否的时候能够根据查询结果来进行判断
     * @Date 17:01 2020/6/24
     * @Param [ok, msg, data]
     * @return com.offway.zyn.dto.R
     **/
    public static R set(boolean ok,String msg,Object data){
        if(ok) return new R(200,"ok",data);
        else return new R(500,msg,null);
    }

}
