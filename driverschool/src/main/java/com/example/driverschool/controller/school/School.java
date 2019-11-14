package com.example.driverschool.controller.school;

import com.example.driverschool.common.Result;
import com.example.driverschool.entity.ClassMessage;
import com.example.driverschool.entity.DriverSchool;
import com.example.driverschool.service.school.ClassMessageService;
import com.example.driverschool.service.school.SearchAllSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/School")
public class School {

    @Autowired
    private SearchAllSchoolService searchAllSchoolService ;
    @Autowired
    private ClassMessageService classMessageService ;

    @GetMapping( "/searchAllSchool")
    public Result SearchAllSchool( String id ) {
        try {
            List<DriverSchool> driverSchools = searchAllSchoolService.searchAllSchool(id) ;
            return new Result ( driverSchools , "增加成功" , true ) ;
        }catch (Exception e ) {
            return new Result ( "增加失败" , false ) ;
        }
    }

    @GetMapping( "/searchIdSchool")
    public Result SearchIdAllSchool( String id ) {
        try {
            List<DriverSchool> driverSchools = searchAllSchoolService.searchAllSchool(id) ;
            return new Result ( driverSchools.get(0) , "增加成功" , true ) ;
        }catch (Exception e ) {
            return new Result ( "增加失败" , false ) ;
        }
    }

    @GetMapping( "/searchAllClass" )
    public Result SearchAllClass() {
        try {
            List<ClassMessage> classMessages = classMessageService.SearchClassMessage() ;
            return new Result ( classMessages , "增加成功" , true ) ;
        }catch (Exception e ) {
            return new Result ( "增加失败" , false ) ;
        }
    }
}
