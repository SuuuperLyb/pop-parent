package com.offway.hqs.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.offway.common.entity.R;
import com.offway.common.entity.TUser;
import com.offway.common.mapper.TUserMapper;
import com.offway.common.three.JedisCore;
import com.offway.common.util.Rutil;
import com.offway.hqs.config.OssConfig;
import com.offway.hqs.config.RedisKeyConfig;
import com.offway.hqs.dao.TUserDetails2Mapper;
import com.offway.hqs.dao.TUserdetailhendurlMapper;
import com.offway.hqs.dto.LoginTokenDto;
import com.offway.hqs.service.ITResourceossService;
import com.offway.hqs.three.OssCore;
import com.offway.hqs.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * <p>
 * 对象存储类oss 上传头像
 * </p>
 */
@Service
public class TResourceossServiceImpl  implements ITResourceossService {
    @Autowired
    TUserDetails2Mapper tUserDetails2Mapper;
    @Autowired
    private JedisCore jedisCore;
    @Autowired
    private TUserMapper tUserMapper;
    @Autowired
    private TUserdetailhendurlMapper tUserdetailhendurlMapper;


    @Override
    public R sendFile(MultipartFile file,String token) {
        //令牌模板
        LoginTokenDto loginTokenDto = JSON.parseObject(jedisCore.getVal(RedisKeyConfig.LOGIN_USER + token), LoginTokenDto.class);
        //查询用户
        TUser tUser = tUserMapper.selectOne(new QueryWrapper<TUser>().eq("u_phone", loginTokenDto.getPhone()));

        // 1、校验
        if (!file.isEmpty()) {
            // 2.重命名
            String fn = FileUtil.renameFile(file.getOriginalFilename());

                // 3.上传到OSS
            String url = null;
            try {
                url = OssCore.sendResouce(OssConfig.bucketName, fn, file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 4.记录到数据库
                int i = tUserdetailhendurlMapper.updateHeadUrl(tUser.getuId(), url);
                // 5.返回
            if(i>0){
                return Rutil.Ok();
            }else {
                return Rutil.err();
            }
        }else {
            return Rutil.err();
        }

    }
}
