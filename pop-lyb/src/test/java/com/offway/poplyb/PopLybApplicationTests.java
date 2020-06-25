package com.offway.poplyb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.offway.common.mapper")
@ComponentScan("com.offway.Lyb.conf")
@ComponentScan("com.offway.common.conf")
public class PopLybApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLybApplicationTests.class, args);
    }

}
