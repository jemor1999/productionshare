package com.study.productionsare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.study")//扫描指定文件夹中的数据
@MapperScan("com.study.dao")
@SpringBootApplication
public class ProductionsareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductionsareApplication.class, args);
        System.out.println("springboot 启动成功");
    }
}
