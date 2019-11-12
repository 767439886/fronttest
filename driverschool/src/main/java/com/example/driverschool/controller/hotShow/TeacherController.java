package com.example.driverschool.controller.hotShow;

import com.example.driverschool.common.Result;
import com.example.driverschool.entity.Exerciselist;
import com.example.driverschool.entity.Teacher;
import com.example.driverschool.service.hotShow.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/hotShow" )
public class TeacherController {

    @Autowired
    private TeacherService teacherService ;

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

    @GetMapping ( "/exeriselist" )
    public Result searchExerciselist ( String id ) {
        try {
            List<Exerciselist> exerciselists = teacherService.searchExerciseList(id);
            return new Result ( exerciselists ,  "搜索成功" , true ) ;
        } catch (Exception e ) {
            e.printStackTrace();
            return new Result ( "搜索失败" , false ) ;
        }
    }
}
