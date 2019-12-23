package com.example.yunyoupersonnel.controller.PersonnelFile;

import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.Management;
import com.example.yunyoupersonnel.service.PersonnelFile.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/management" )
public class ManagementController {

    @Autowired
    private ManagementService managementService ;

    @RequestMapping( "/search" )
    public Result searchManagement ( ){
        try {
            List<Management> managements = managementService.searchManagerment() ;
            return new Result( managements ,  "搜索成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索失败" , true ) ;
        }
    }

    @RequestMapping( "/add" )
    public Result addManagement ( @RequestBody Management management ){
        try {
            managementService.addManagerment( management );
            return new Result("增加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "增加失败" , true ) ;
        }
    }

    @RequestMapping( "/delete" )
    public Result addManagement ( String id  ){
        try {
            managementService.deleteManagerment( id );
            return new Result("增加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "增加失败" , false ) ;
        }
    }
}
