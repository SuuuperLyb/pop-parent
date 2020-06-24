package com.offway.zyn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.offway.common.entity.TAdmin;
import com.offway.common.mapper.TAdminMapper;
import com.offway.zyn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author starzyn
 * @className:TestServiceImpl
 * @date : 2020/6/23
 * @description:
 */
@Service
public class TestServiceImpl extends ServiceImpl<TAdminMapper,TAdmin> implements TestService {
    @Resource
    TAdminMapper tam;

    @Override
    public List<TAdmin> queryAll() {
        return tam.selectList(null);
    }
}
