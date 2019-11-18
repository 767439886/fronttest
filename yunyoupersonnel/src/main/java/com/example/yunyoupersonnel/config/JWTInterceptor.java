package com.example.yunyoupersonnel.config;

import com.example.yunyoupersonnel.Utils.Cookies;
import com.example.yunyoupersonnel.Utils.JWTUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Function;

@Component
public class JWTInterceptor implements HandlerInterceptor{

    //  重写preHandel
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //  允许跨域访问，第二个参数为url(可以跨域访问的url)
        response.setHeader("Access-Control-Allow-Origin", "*" );
        //  后台管理页面产生的token
        try {
            String authorization = Cookies.getCookies( request ) ;
            Optional.ofNullable(authorization).map(new Function<String,Object>() {
                @Override
                public Object apply(String s) {
                    try {
                        return JWTUtils.parseJWT(s);
                    } catch (Exception e) {
                        System.out.println( "token不存在") ;
                        //  重定向页面
                        try {
                            response.sendRedirect("/login.html" );
                        } catch (IOException ex) {
                            System.out.println( "重定向错误" );
                        }
                    }
                    return null ;
                }
            }) ;
        } catch ( Exception e ) {
            try {
                //  重定向
                response.sendRedirect( "/login.html" );
            } catch ( Exception ex) {
                System.out.println( "重定向错误" );
            }
        }

        //  token是否存在
        return true ;
    }
}
