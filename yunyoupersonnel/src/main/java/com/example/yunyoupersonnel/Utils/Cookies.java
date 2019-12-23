package com.example.yunyoupersonnel.Utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies {

    public static void setCookies (HttpServletRequest httpServlet , String user , HttpServletResponse httpResponse) {
        Cookie[] cookies = httpServlet.getCookies() ;
        if ( cookies != null ) {
            for (int i = 0; i < cookies.length; i++) {
                String name = cookies[i].getName();
                //  提取名字
                if (name.equals("admin")) {
                    //  看名字是否相等 ， 相等则不用操作Cookies
                    return;
                }
            }
        }
        Cookie cookie = new Cookie( "admin" , user ) ;
        //  设置cookie时间
        cookie.setMaxAge( 60 * 60 * 24 ) ;
        //  必须设置路径，否则其他项目路径访问不了
        cookie.setPath("/");
        //  增加cookie
        httpResponse.addCookie( cookie ) ;

        // 设置作用域
        // cookie.setDomain( "" );
        return;
    }

    public static String getCookies (HttpServletRequest httpServlet ) {
        try {
            Cookie[] cookies = httpServlet.getCookies() ;
            for ( int i = 0 ; i < cookies.length ; i++ ) {
                String name = cookies[i].getName() ;
                if ( name.equals( "admin" ) ) {
                    String value = cookies[i].getValue() ;
                    return value ;
                }
            }
        } catch ( Exception e ) {
            System.out.println( "没有该cookie" );
        }
        return null ;
    }

    public static void  deleteCookies (HttpServletResponse httpServletResponse) {
        Cookie cookie = new Cookie("admin" , null ) ;
        //  设置cookie时间
        cookie.setMaxAge( 0 ) ;
        //  必须设置路径，否则其他项目路径访问不了
        cookie.setPath("/");
        //  增加cookie
        httpServletResponse.addCookie(cookie) ;
    }
}
