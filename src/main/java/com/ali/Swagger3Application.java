package com.ali;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author mozartc。
 * @date 2020/7/18 10:07
 * http://localhost:81/swagger-ui/      swagger-ui
 * http://localhost:81/doc.html#/home   knife4j
 * https://doc.xiaominfo.com/knife4j/
 */
@EnableOpenApi
@SpringBootApplication
@MapperScan(basePackages = {"com.ali.dao"})
public class Swagger3Application {
    public static void main(String[] args) {
        SpringApplication.run(Swagger3Application.class, args);
    }
}
