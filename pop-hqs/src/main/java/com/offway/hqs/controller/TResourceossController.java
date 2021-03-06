package com.offway.hqs.controller;

import com.offway.common.entity.R;
import com.offway.hqs.service.ITResourceossService;
import com.offway.hqs.service.impl.TResourceossServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(value = "头像接口", tags = "头像接口")
@RestController
@CrossOrigin // 解决跨域的问题
public class TResourceossController {
    @Autowired
    private ITResourceossService itResourceossService;

    @GetMapping("api/sms/sendFile.do")
    public R sendFile(MultipartFile file, String token){
        return itResourceossService.sendFile(file,token);
    }

}
