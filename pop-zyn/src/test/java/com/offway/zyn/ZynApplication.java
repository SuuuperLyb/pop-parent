package com.offway.zyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offway.common.mapper")
public class ZynApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZynApplication.class, args);
    }

}
