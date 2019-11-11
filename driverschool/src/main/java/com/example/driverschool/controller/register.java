package com.example.driverschool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.driverschool.common.Result ;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/register" )
public class register{

    //  增加用户
    @GetMapping( "/addUser" )
    public Result addUser () {
        try {
            System.out.println( "收到" );
            return new Result( "注册成功" , true   ) ;
        } catch ( Exception e ) {
            return new Result( "注册失败" , false ) ;
        }
    }

    //  发送验证码
    @GetMapping( "/sendVerifyCode" )
    public Result sendVerityCode () {
        try {

            return new Result( "注册成功" , true   ) ;
        } catch ( Exception e ) {
            return new Result( "发送验证码失败" , false ) ;
        }
    }
}
