package com.example.shixuanyoumei.controller.shop;

import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.Advisory;
import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.service.shop.AdvisoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/advisory")
public class AdvisoryController {

    @Autowired
    private AdvisoryService advisoryService ;

    @RequestMapping( "/search" )
    public Result searchAdvisory() {
        try {
            List<Advisory> advisories = advisoryService.searchAdvisoryList();
            return new Result( advisories , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
}
