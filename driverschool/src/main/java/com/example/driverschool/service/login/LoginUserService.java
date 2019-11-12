package com.example.driverschool.service.login;

import com.example.driverschool.entity.User;
import com.example.driverschool.mapper.login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class LoginUserService {

    @Autowired( required =  false )
    private LoginMapper loginMapper ;

    public User SearchUser( User user ) {
        User user1 = loginMapper.searchUser(user) ;
        return user1 ;
    }
}
