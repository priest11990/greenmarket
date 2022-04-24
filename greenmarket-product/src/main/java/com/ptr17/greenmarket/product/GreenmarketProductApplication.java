package com.ptr17.greenmarket.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan("com.ptr17.greenmarket.product.dao")
@SpringBootApplication
public class GreenmarketProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreenmarketProductApplication.class, args);
    }

}
