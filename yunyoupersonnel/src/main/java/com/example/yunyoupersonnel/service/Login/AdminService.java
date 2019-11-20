package com.example.yunyoupersonnel.service.Login;

import com.example.yunyoupersonnel.Utils.JWTUtils;
import com.example.yunyoupersonnel.entity.User;
import com.example.yunyoupersonnel.mapper.Login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class AdminService {

    @Autowired( required = false )
    private LoginMapper loginMapper ;

    //   检查用户名和密码是否正确
    public Map<String,Object> checkUsernameAndPwd(User user ){
        Map<String, Object> rusultMap = new HashMap<>() ;
        User user1 = loginMapper.SearchUser(user) ;
        rusultMap.put( "user" , user1 ) ;
        if ( user1 != null ) {
            rusultMap.put( "bool" , true ) ;
            return rusultMap ;
        }
        rusultMap.put( "bool" , false ) ;
        return rusultMap ;
    }

    //   建造新的token，然后把token给存储起来
    public String getToken(User admin) {

        //存入JWT的payload中生成token
        Map claims = new HashMap<String,Integer>();
        claims.put("admin_username", admin );
        String subject = "admin";
        String token = null;
        try {
            //该token过期时间为12h
            token = JWTUtils.createJWT(claims, subject, 1000*60*60*12 );
        } catch (Exception e) {
            throw new RuntimeException("创建Token失败");
        }
        System.out.println("token:"+token);
        return token;
    }

}
