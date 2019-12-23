package com.example.leading.mapper;

import com.example.leading.entity.Areas;
import com.example.leading.entity.City;
import com.example.leading.entity.Peoplemessage;
import com.example.leading.entity.Province;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface SearchLeading {
    public Page<Peoplemessage> SearchPeopleMessage(Map<String,Object> conditon ) ;
    public List<Areas> SearchAllAreas ( Map<String,Object> map ) ;
    public List<City> SearchAllCity ( Map<String,Object> map ) ;
    public List<Province> SearchAllProvince ( Map<String,Object> map ) ;
}
