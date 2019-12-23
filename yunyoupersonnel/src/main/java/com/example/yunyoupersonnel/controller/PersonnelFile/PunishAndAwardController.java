package com.example.yunyoupersonnel.controller.PersonnelFile;


import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.Culitivate;
import com.example.yunyoupersonnel.entity.Punishment;
import com.example.yunyoupersonnel.service.PersonnelFile.CulitivateService;
import com.example.yunyoupersonnel.service.PersonnelFile.PersonnelService;
import com.example.yunyoupersonnel.service.PersonnelFile.PunishAndwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/punishAndAward")
public class PunishAndAwardController {

    @Autowired
    private PunishAndwardService punishAndwardService ;

    @RequestMapping( "/add" )
    public Result addPunishAndward (@RequestBody Punishment punishment ) {
        try {
            punishAndwardService.addPunishAndward( punishment ) ;
            return new Result( "添加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "添加失败,请把信息添齐全" , false ) ;
        }
    }

    @GetMapping( "/search" )
    public Result searchPunishAndward ( ) {
        try {
            List<Punishment> punishments = punishAndwardService.searchPunishment() ;
            return new Result( punishments ,  "添加成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索失败" , false ) ;
        }
    }

    @GetMapping( "/delete" )
    public Result deletePunishAndward ( String id ) {
        try {
            punishAndwardService.deletePunishment( id );
            return new Result("删除成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "删除失败" , false ) ;
        }
    }
}
