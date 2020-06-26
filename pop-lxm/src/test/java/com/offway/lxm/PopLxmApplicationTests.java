package com.offway.lxm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.offway.common.mapper")
@MapperScan("com.offway.lxm.mapper")
@ComponentScan("com.offway.common.conf")
@ComponentScan("com.offway.lxm.conf")
public class PopLxmApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLxmApplicationTests.class, args);
    }


}
