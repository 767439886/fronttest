package com.example.yunyoupersonnel.controller.login;

import com.example.yunyoupersonnel.Utils.Cookies;
import com.example.yunyoupersonnel.Utils.JWTUtils;
import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.User;
import com.example.yunyoupersonnel.service.AdminService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping( "/login")
public class Login {

    @Autowired
    private HttpServletRequest httpServletRequest ;
    @Autowired( required =  false )
    private HttpServletResponse httpServletResponse ;
    @Autowired
    private AdminService adminService ;

    @PostMapping(value = "/login")
    public Result login( @RequestBody User user ) throws Exception {
        //  检查是否表中是否正确
        Map<String, Object> resultMap = adminService.checkUsernameAndPwd(user);
        if ((boolean)resultMap.get("bool")) {
            //获取新token，过期时间为12h
            String token = adminService.getToken( (User)resultMap.get("user") );
            // 在线用户数
            //OnlineCount.getInstance().insertToken(token);
            //加入cookie
            Cookies.setCookies( httpServletRequest , token , httpServletResponse );
            return new Result( "登录成功" , true );
        }
        return new Result( "登录失败" , false );
    }

    @PostMapping(value = "/getUsername" )
    public Result getUsername() {
        try {
            String jwt = Cookies.getCookies(httpServletRequest) ;
            Claims claims = JWTUtils.parseJWT(jwt) ;

      //  把admin使用LinkedHashMap存储起来
            Object admin = claims.get("admin_username") ;
            LinkedHashMap use = (LinkedHashMap)admin ;
            return new Result( admin , "登录成功" , true );
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "登录失败" , false );
        }
    }
}
