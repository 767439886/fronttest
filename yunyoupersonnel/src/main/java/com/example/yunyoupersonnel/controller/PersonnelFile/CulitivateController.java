package com.example.yunyoupersonnel.controller.PersonnelFile;

import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.Culitivate;
import com.example.yunyoupersonnel.service.PersonnelFile.CulitivateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/culitivate")
public class CulitivateController {

    @Autowired
    private CulitivateService culitivateService ;

    //  添加培训人
    @PostMapping( "/addCulitivate")
    public Result addCulitivate ( String[]ids , @RequestBody Culitivate culitivate ) {
        try {
            culitivateService.addCulitivate( ids ,  culitivate );
            return new Result( "添加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "添加失败" , false ) ;
        }
    }

    //  查询所有的培训人
    @GetMapping( "/searchCulitivate" )
    public Result searchCulitivate () {
        try {
            List<Culitivate> culitivates = culitivateService.searchCulitivate();
            return new Result( culitivates ,  "添加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "添加失败" , false ) ;
        }
    }

    //  删除培训人员
    @GetMapping( "/deleteCulitivate")
    public Result deleteCulitivate( String id ) {
        try {
            culitivateService.deleteCulitivate( id );
            return new Result( "删除成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "删除失败" , false ) ;
        }
    }

    //  更改培训人员
    @PostMapping( "/updateCulitivate" )
    public Result updateCulitivate( String id , @RequestBody Culitivate culitivate ) {
        try {
            culitivateService.updateCulitivate( id , culitivate);
            return new Result( "修改成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "修改失败" , false ) ;
        }
    }
}
