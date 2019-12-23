package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ShopService {

    @Autowired( required =  false )
    private ShopMapper shopMapper ;

    public List<Shopping> searchHotShopping() {
        List<Shopping> shoppings = shopMapper.SearchHotShop() ;
        return shoppings ;
    }
    public List<Shopping> searchRecommendShop () {
        List<Shopping> shoppings = shopMapper.SearchRecommendShop() ;
        return shoppings ;
    }
    public List<Shopping> searchNewShop () {
        List<Shopping> shoppings = shopMapper.SearchNewShop() ;
        return shoppings ;
    }
    public List<Shopping> searchAllShopping () {
        List<Shopping> shoppings = shopMapper.SearchAllShop() ;
        return shoppings ;
    }
    public List<Shopping> searchIdDetail( String id ) {
        Map<String, Object> hashMap = new HashMap<>() ;
        hashMap.put( "id" , id ) ;
        List<Shopping> shoppings = shopMapper.SearchConditionShop(hashMap) ;
        return shoppings ;
    }
}
