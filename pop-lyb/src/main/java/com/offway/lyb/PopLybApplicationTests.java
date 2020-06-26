package com.offway.lyb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableSwagger2
@MapperScan("com.offway.common.mapper")
@MapperScan("com.offway.lyb.mapper")
@ComponentScan("com.offway.lyb.conf")
public class PopLybApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLybApplicationTests.class, args);
    }

}
