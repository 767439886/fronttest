package com.example.shixuanyoumei.controller.shop;

import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.service.shop.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/shop")
public class ShopController {

    @Autowired
    private ShopService shopService ;

    @GetMapping( "/hotShopping" )
    public Result searchHotShopping () {
        try {
            List<Shopping> shoppings = shopService.searchHotShopping() ;
            return new Result( shoppings , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
    @GetMapping( "/newShopping" )
    public Result searchNewShopping () {
        try {
            List<Shopping> shoppings = shopService.searchNewShop();
            return new Result( shoppings , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
    @GetMapping( "/searchhotRecommend")
    public Result searchhotRecommend() {
        try {
            List<Shopping> shoppings = shopService.searchRecommendShop();
            return new Result( shoppings , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
    @GetMapping( "/searchAllShopping" )
    public Result searchAllShopping() {
        try {
            List<Shopping> shoppings = shopService.searchAllShopping();
            return new Result( shoppings , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
    @GetMapping( "/searchIdShopping" )
    public Result searchIdShopping( String id ) {
        try {
            List<Shopping> shoppings = shopService.searchIdDetail(id);
            return new Result( shoppings.get(0) , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
}
