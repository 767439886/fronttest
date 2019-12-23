package com.example.shixuanyoumei.mapper;

import com.example.shixuanyoumei.entity.Beauty;

import java.util.List;

public interface BeautyMapper {
    public List<Beauty> SearchCityBeauty ( String cityId ) ;
    public List<Beauty> SearchBeautyList() ;
}
