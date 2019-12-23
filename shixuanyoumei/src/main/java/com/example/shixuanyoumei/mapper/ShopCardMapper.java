package com.example.shixuanyoumei.mapper;

import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.entity.Shoppinglist;
import java.util.List;
import java.util.Map;

public interface ShopCardMapper {
    public List<Shopping> SearchTypeShop( String uid ) ;
    public List<Shoppinglist> SearchShoppingList( Map map ) ;
    public void insertShop( Shoppinglist shoppinglist ) ;
    public void updateShop( Shoppinglist shoppinglist ) ;
}
