package com.example.yunyoupersonnel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan( "com.example.yunyoupersonnel.mapper" )
@SpringBootApplication
public class YunyoupersonnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunyoupersonnelApplication.class, args);
    }

}
