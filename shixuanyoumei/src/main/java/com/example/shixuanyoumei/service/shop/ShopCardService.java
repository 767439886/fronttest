package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.entity.Shoppinglist;
import com.example.shixuanyoumei.mapper.ShopCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ShopCardService {

    @Autowired( required = false )
    private ShopCardMapper shopCardMapper ;

    public List<Shopping> SearchUserShopping ( String uid ) {
        List<Shopping> shoppings = shopCardMapper.SearchTypeShop(uid) ;
        return shoppings ;
    }

    public void insertShopCard( String uid , String shoppingId ) {
        Map<String, Object> hashMap = new HashMap<>() ;
        hashMap.put( "uid" , uid ) ;
        hashMap.put( "shoppingId" , shoppingId ) ;
        List<Shoppinglist> shoppinglists = shopCardMapper.SearchShoppingList(hashMap) ;
        if ( shoppinglists.size() == 0 ) {
            Shoppinglist shoppinglist = new Shoppinglist() ;
            shoppinglist.setUid( Integer.parseInt(uid) ) ;
            shoppinglist.setShoppingId( Integer.parseInt(shoppingId ) ) ;
            shopCardMapper.insertShop(shoppinglist) ;
        } else {
            Shoppinglist shoppinglist = shoppinglists.get(0) ;
            shoppinglist.setNumber( shoppinglist.getNumber() + 1 ) ;
            shopCardMapper.updateShop(shoppinglist);
        }
    }
}
