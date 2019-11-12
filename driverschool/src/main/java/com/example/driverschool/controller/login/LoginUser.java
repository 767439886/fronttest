package com.example.driverschool.controller.login;

import com.example.driverschool.common.Result;
import com.example.driverschool.entity.User;
import com.example.driverschool.service.login.LoginUserService;
import com.example.driverschool.utils.Cookies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping( "/loginUser" )
public class LoginUser {

    @Autowired
    private LoginUserService loginUserService ;
    @Autowired
    private HttpServletRequest httpServletRequest ;
    @Autowired( required =  false )
    private HttpServletResponse httpServletResponse ;

    @PostMapping( "/user" )
    public Result verifyUser (@RequestBody User user ) {
        try {
            User user1 = loginUserService.SearchUser(user) ;
            if ( user1 != null ) {
                Cookies.setCookies( httpServletRequest, user1.getUsername() , httpServletResponse);
                return new Result( "登录成功" , true ) ;
            }
            return new Result( "登录失败，用户名或密码错误" , false ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "登录失败" , false ) ;
        }
    }

    @GetMapping( "/loginUser" )
    public Result loginUser () {
        try {
            String cookies = Cookies.getCookies(httpServletRequest) ;
//            User user = new User() ;
//            user.setUsername(cookies) ;
//            User user1 = loginUserService.SearchUser(user) ;
            return new Result(  cookies , "返回成功，用户名或密码错误" , false ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "返回失败" , false ) ;
        }
    }
}
