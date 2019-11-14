package com.example.driverschool.controller.school;


import com.example.driverschool.common.Result;
import com.example.driverschool.entity.User;
import com.example.driverschool.entity.Userdriverschool;
import com.example.driverschool.mapper.hotShow.SearchExerisetimelMapper;
import com.example.driverschool.service.login.LoginUserService;
import com.example.driverschool.service.school.SchoolExcericeService;
import com.example.driverschool.utils.Cookies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping( "/SchoolExcerice")
public class SchoolExcerice {

    @Autowired
    private LoginUserService loginUserService ;
    @Autowired
    private HttpServletRequest httpServletRequest ;
    @Autowired( required = false )
    private HttpServletResponse httpServletResponse ;
    @Autowired
    private SchoolExcericeService schoolExcericeService ;

    @PostMapping( "/addSchoolExcerice" )
    public Result addSchoolExcerice(@RequestBody Userdriverschool userdriverschool ) {
        try {
            String cookies = Cookies.getCookies(httpServletRequest) ;
            User user = new User() ;
            user.setUsername( cookies );
            User user1 = loginUserService.SearchUser(user) ;
            userdriverschool.setUsername( user1.getUsername() );
            schoolExcericeService.insertSchoolExcerice( userdriverschool );
            return new Result( "增加成功" , true ) ;
        } catch (Exception e ){
            e.printStackTrace();
            return new Result( "增加失败" , true ) ;
        }
    }
}
