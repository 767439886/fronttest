package com.example.shixuanyoumei.service.login;


import com.example.shixuanyoumei.entity.User;
import com.example.shixuanyoumei.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginService {

    @Autowired( required =  false )
    private LoginMapper loginMapper ;

    public List<User> searchUser (User user ) {
        List<User> users = loginMapper.searchMapper(user) ;
        return users ;
    }

    public void updateUser (User user ) {
        loginMapper.updateMapper(user) ;
    }
}
