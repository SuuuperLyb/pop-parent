package com.offway.poplyb;

import com.offway.common.three.JedisCore;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.offway.common.mapper")
public class PopLybApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(PopLybApplicationTests.class, args);
    }

}
