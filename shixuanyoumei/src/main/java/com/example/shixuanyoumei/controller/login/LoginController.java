package com.example.shixuanyoumei.controller.login;

import com.example.shixuanyoumei.Utils.Cookies;
import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.User;
import com.example.shixuanyoumei.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping( "/login" )
public class LoginController {

    @Autowired
    private LoginService loginService ;
    @Autowired
    private HttpServletRequest httpServletRequest ;
    @Autowired( required =  false )
    private HttpServletResponse httpServletResponse ;

    @RequestMapping( "/user" )
    public Result UserLogin (@RequestBody User user ) {
        try {
            List<User> users = loginService.searchUser(user) ;
            if ( users.size() == 1 ) {
                Cookies.setCookies(httpServletRequest , users.get(0).getUsername() , httpServletResponse ); ;
                return new Result(users, "用户登录成功", true) ;
            } else {
                return new Result( "用户登录失败" , false ) ;
            }
        } catch ( Exception e) {
            e.printStackTrace();
            return new Result( "用户登录失败" , false ) ;
        }
    }

    @GetMapping( "/getUser" )
    public Result getUser() {
        try {
            String cookies = Cookies.getCookies(httpServletRequest) ;
            return new Result( cookies , "用户登录失败" , true ) ;
        } catch ( Exception e) {
            e.printStackTrace();
            return new Result( "用户登录失败" , false ) ;
        }
    }

    @GetMapping( "/getUserMessage" )
    public Result getUserMessage() {
        try {
            String cookies = Cookies.getCookies(httpServletRequest) ;
            User user = new User() ;
            user.setUsername( cookies ) ;
            List<User> users = loginService.searchUser(user);
            return new Result( users.get(0) , "用户登录失败" , true ) ;
        } catch ( Exception e) {
            e.printStackTrace();
            return new Result( "用户登录失败" , false ) ;
        }
    }

    @PostMapping( "/updateUserMessage" )
    public Result updateUserMessage (@RequestBody User user ) {
        try {
            loginService.updateUser( user) ;
            return new Result("用户登录失败" , true ) ;
        } catch ( Exception e) {
            e.printStackTrace();
            return new Result( "用户登录失败" , false ) ;
        }
    }
}
