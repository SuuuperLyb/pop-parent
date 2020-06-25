package com.offway.zyn.controller;

import com.offway.common.entity.R;
import com.offway.zyn.service.StarDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author starzyn
 * @className:StarDetailController
 * @date : 2020/6/25
 * @description: 明星穿搭详情的控制器
 */
@RestController
public class StarDetailController {
    @Autowired
    StarDetailService starDetailService;

    /**
     * @Author starzyn
     * @Description 展示明星风格详情页的所有数据，根据传送的明星风格穿搭id
     * @Date 11:06 2020/6/25
     * @Param [starStyleId]
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/detail")
    public R showDetail(@RequestParam(name = "starStyleId") String starStyleId){
        return null;
    }

    /**
     * @Author starzyn
     * @Description 根据明星风格id进行取消喜欢
     * @Date 11:20 2020/6/25
     * @Param [starStyleId]
     * @return com.offway.common.entity.R
     **/
    @GetMapping("/star/dislike")
    public R disLike(@RequestParam(name = "starStyleId") String starStyleId){
        return null;
    }


}
