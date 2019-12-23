package com.example.shixuanyoumei.controller.shop;

import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.Beauty;
import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.service.shop.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping( "/beauty" )
@RestController
public class BeautyController {

    @Autowired
    private BeautyService beautyService ;

    @RequestMapping( "/search" )
    public Result SearchBeauty() {
        try {
            List<Beauty> beauties = beautyService.SearchBeautyList() ;
            return new Result( beauties , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }

    @RequestMapping( "/searchCityBeauty" )
    public Result SearchCityBeauty( String cityId ) {
        try {
            List<Beauty> beauties = beautyService.SearchBeautyCity(cityId) ;
            return new Result( beauties , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
}
