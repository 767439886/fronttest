package com.example.yunyoupersonnel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//  先加载的配置类
@Configuration
public class JWTConfig implements WebMvcConfigurer {

    @Bean
    JWTInterceptor jwtInterceptor(){
        return new JWTInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("JWT拦截器启动");

        //  设置拦截器要拦截的url路径
        registry.addInterceptor(jwtInterceptor())
                .addPathPatterns("/pages/*.html" );

    }
}
