package com.example.leading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan( "com.example.leading.mapper" )
public class LeadingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeadingApplication.class, args);
    }

}
