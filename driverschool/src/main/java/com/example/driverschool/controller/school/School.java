package com.example.driverschool.controller.school;

import com.example.driverschool.common.Result;
import com.example.driverschool.entity.DriverSchool;
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

    @GetMapping( "/searchAllSchool")
    public Result SearchAllSchool() {
        try {
            List<DriverSchool> driverSchools = searchAllSchoolService.searchAllSchool() ;
            return new Result ( driverSchools , "增加成功" , true ) ;
        }catch (Exception e ) {
            return new Result ( "增加失败" , false ) ;
        }
    }
}
