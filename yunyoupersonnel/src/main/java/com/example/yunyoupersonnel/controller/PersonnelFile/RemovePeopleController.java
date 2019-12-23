package com.example.yunyoupersonnel.controller.PersonnelFile;

import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.Peoplemove;
import com.example.yunyoupersonnel.service.PersonnelFile.RemovePeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/remove")
public class RemovePeopleController {

    @Autowired
    private RemovePeopleService removePeopleService ;

    @RequestMapping( "/add" )
    public Result addRemovePeople (@RequestBody Peoplemove peoplemove ) {
        try {
            removePeopleService.addRemovePeople( peoplemove );
            return new Result("增加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result("增加失败" , false ) ;
        }
    }

    @RequestMapping( "/search" )
    public Result searchRemovePeople ( ) {
        try {
            List<Peoplemove> peoplemoves = removePeopleService.searchRemovePeople() ;
            return new Result( peoplemoves , "增加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result("增加失败" , false ) ;
        }
    }

}
