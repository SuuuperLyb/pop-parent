package com.offway.zyn.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.offway.common.conf.RedisKeyConfig;
import com.offway.common.entity.R;
import com.offway.common.entity.TUser;
import com.offway.common.three.JedisCore;
import com.offway.zyn.service.StarDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author starzyn
 * @className:StarDetailServiceImpl
 * @date : 2020/6/25
 * @description: 明星穿搭详情类的业务层实现类
 */
@Service
public class StarDetailServiceImpl implements StarDetailService {
    @Resource
    JedisCore jedisCore;
    /**
     * @Author starzyn
     * @Description 点击按钮添加喜欢
     * @Date 18:04 2020/6/26
     * @Param [id, token]
     * @return com.offway.common.entity.R
     **/
    @Override
    public R addLike(int id, String token) {//id 是明星风格id
        boolean isLogin = jedisCore.isExist(RedisKeyConfig.LOGIN_USER+token);
        if(isLogin){
            //利用token来获取当前用户
            TUser user = JSONObject.parseObject(jedisCore.getVal(RedisKeyConfig.LOGIN_USER+token),TUser.class);
            int userId = user.getuId();//获取用户id

        }
    }
}
