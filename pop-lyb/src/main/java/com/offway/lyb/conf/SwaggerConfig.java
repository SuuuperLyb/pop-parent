package com.offway.lyb.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration //配置文件
@EnableSwagger2 //启用Swagger
public class SwaggerConfig {
    //创建文档说明
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("标题")
                .description("描述")
                .termsOfServiceUrl("http://localhost:8989/")
                .contact("lxm@qq.com")
                .version("1.0")
                .build();
    }

    //创建Swagger扫描信息
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.offway.lyb.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}