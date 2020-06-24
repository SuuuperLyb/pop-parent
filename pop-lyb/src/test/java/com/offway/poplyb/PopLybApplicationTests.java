package com.offway.poplyb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.offway.common.mapper")
public class PopLybApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLybApplicationTests.class, args);
    }

}
