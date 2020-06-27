package com.offway.popgxb;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @PackgeName: com.offway.popgxb
 * @ClassName: PopGxbApplication
 * @Author: gxb
 * Date: 2020/6/26 12:18:28
 * project name: pop-parent
 * @Version:
 * @Description:
 */
@SpringBootApplication
//@ComponentScan("com.offway.common.conf")
@MapperScan(basePackages = "com.offway.common.mapper")
@MapperScan(basePackages = "com.offway.popgxb.dao")
public class PopGxbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopGxbApplication.class, args);
    }

}
