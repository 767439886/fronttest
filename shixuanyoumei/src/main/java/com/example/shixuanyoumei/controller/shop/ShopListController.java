package com.example.shixuanyoumei.controller.shop;


import com.example.shixuanyoumei.Utils.Cookies;
import com.example.shixuanyoumei.common.Result;
import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.entity.Shoppinglist;
import com.example.shixuanyoumei.entity.User;
import com.example.shixuanyoumei.mapper.ShopCardMapper;
import com.example.shixuanyoumei.service.login.LoginService;
import com.example.shixuanyoumei.service.shop.ShopCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping( "/shopList")
public class ShopListController {

    @Autowired( required = false )
    private ShopCardService shopCardService ;
    @Autowired( required = false )
    private HttpServletResponse httpServletResponse ;
    @Autowired
    private HttpServletRequest httpServletRequest ;
    @Autowired
    private LoginService loginService ;

    @RequestMapping( "/searchShopList" )
    public Result searchShopList(  ) {
        try {
            String cookies = Cookies.getCookies(httpServletRequest) ;
            User user = new User() ;
            user.setUsername( cookies ) ;
            List<User> users = loginService.searchUser(user) ;
            List<Shopping> shoppings = shopCardService.SearchUserShopping(users.get(0).getId() + "" );
            return new Result( shoppings , "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }

    @RequestMapping( "/insertShopList" )
    public Result insertShopList( String shopId ) {
        try {
            //  封装cookies
            String cookies = Cookies.getCookies(httpServletRequest) ;
            User user = new User() ;
            user.setUsername( cookies ) ;

            List<User> users = loginService.searchUser(user) ;
            User userName = users.get(0) ;
            shopCardService.insertShopCard( userName.getId() + "" , shopId );
            return new Result( "查询购物成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "查询购物失败" , false ) ;
        }
    }
}
