package com.offway.zyn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.offway.common.entity.TAdmin;
import com.offway.common.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface TestService extends IService<TAdmin> {
    List<TAdmin> queryAll();
}
