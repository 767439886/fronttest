package com.example.yunyoupersonnel.mapper.Login;

import com.example.yunyoupersonnel.entity.User;

import java.util.HashMap;
import java.util.Map;

public interface LoginMapper {
    public User SearchUser ( User user ) ;
    public void updatePassword (Map<String,Object> hashMap ) ;
    public User verifyPassword ( Map<String,Object> password ) ;
}
