package com.example.shixuanyoumei.controller.shop;

import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.Beauty;
import com.example.shixuanyoumei.entity.Brand;
import com.example.shixuanyoumei.service.shop.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping( "/brand" )
@RestController
public class BrandController {

    @Autowired
    private BrandService brandService ;

    @RequestMapping( "/search" )
    public Result SearchAllBrand () {
        try {
            List<Brand> brands = brandService.SearchBrand();
            return new Result( brands , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }

    @RequestMapping( "/type" )
    public Result SearchTypeBrand ( String type) {
        try {
            List<Brand> brands = brandService.SearchTypeBrand( type );
            return new Result( brands , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
}
