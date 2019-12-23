package com.example.shixuanyoumei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan( "com.example.shixuanyoumei.mapper")
public class ShixuanyoumeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShixuanyoumeiApplication.class, args);
    }

}
