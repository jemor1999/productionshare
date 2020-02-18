package com.study.productionsare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.study")
@SpringBootApplication
public class ProductionsareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductionsareApplication.class, args);

    }
}
