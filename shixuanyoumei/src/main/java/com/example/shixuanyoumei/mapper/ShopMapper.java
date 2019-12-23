package com.example.shixuanyoumei.mapper;

import com.example.shixuanyoumei.entity.Shopping;

import java.util.List;
import java.util.Map;

public interface ShopMapper {
    public List<Shopping> SearchHotShop() ;
    public List<Shopping> SearchRecommendShop () ;
    public List<Shopping> SearchNewShop () ;
    public List<Shopping> SearchAllShop () ;
    public List<Shopping> SearchConditionShop (Map<String,Object> map ) ;
}
