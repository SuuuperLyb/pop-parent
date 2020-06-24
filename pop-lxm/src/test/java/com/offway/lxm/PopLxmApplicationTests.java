package com.offway.lxm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offway.common.mapper")
class PopLxmApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLxmApplicationTests.class, args);
    }


}
