package com.example.driverschool.controller.hotShow;

import com.example.driverschool.common.Result;
import com.example.driverschool.controller.login.LoginUser;
import com.example.driverschool.entity.Exerciselist;
import com.example.driverschool.entity.Teacher;
import com.example.driverschool.entity.User;
import com.example.driverschool.service.hotShow.TeacherService;
import com.example.driverschool.service.login.LoginUserService;
import com.example.driverschool.utils.Cookies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping( "/hotShow" )
public class TeacherController {

    @Autowired
    private LoginUserService loginUserService ;
    @Autowired
    private TeacherService teacherService ;
    @Autowired
    private HttpServletRequest httpServletRequest ;

    @GetMapping( "/searchTeacher")
    public Result searchTeacher () {
        try {
            List<Teacher> teachers = teacherService.searchTeacher() ;
            return new Result ( teachers,  "搜索成功" , true ) ;
        } catch (Exception e ) {
            return new Result ( "搜索失败" , false ) ;
        }
    }

    @GetMapping ( "/thisTeacher")
    public Result searchTeacher ( String id ) {
        try {
            Teacher teachers = teacherService.searchTeacherId( id ) ;
            return new Result ( teachers,  "搜索成功" , true ) ;
        } catch (Exception e ) {
            return new Result ( "搜索失败" , false ) ;
        }
    }

    @PostMapping( "/exeriselist" )
    public Result searchExerciselist ( @RequestBody HashMap<String,String> hashMap) {
        try {
            //  转换时间
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(hashMap.get("date"));
            String now = new SimpleDateFormat("yyyy-MM-dd").format(date) ;
            //  增加时间
            hashMap.put("date" , now ) ;
            List<Exerciselist> exerciselists = teacherService.searchExerciseList( hashMap );
            return new Result ( exerciselists ,  "搜索成功" , true ) ;
        } catch (Exception e ) {
            e.printStackTrace();
            return new Result ( "搜索失败" , false ) ;
        }
    }

    @PostMapping( "addTeacher" )
    public Result addTeacher( @RequestBody Exerciselist exerciselist ) {
        try {
            String date = exerciselist.getDate() ;
            //  转换时间
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            date = new SimpleDateFormat("yyyy-MM-dd").format(date1) ;

            exerciselist.setDate( date ) ;
            String cookies = Cookies.getCookies(httpServletRequest) ;
            User user = new User() ;
            user.setUsername( cookies );
            User user1 = loginUserService.SearchUser(user) ;
            exerciselist.setUid( user1.getId() ) ;
            teacherService.addExerciseList( exerciselist ) ;
            return new Result ( "增加成功" , true ) ;
        } catch (Exception e ){
            e.printStackTrace();
            return new Result ( "增加失败" , false ) ;
        }
    }

    @GetMapping ( "/searchAllTeacher" )
    public Result searchAllTeacher() {
        try {
            List<Teacher> teachers = teacherService.searchAllTeacher() ;
            return new Result ( teachers ,  "增加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result ( "增加失败" , false ) ;
        }
    }
}
