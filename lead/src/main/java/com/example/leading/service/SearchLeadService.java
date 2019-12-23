package com.example.leading.service;

import com.example.leading.entity.Areas;
import com.example.leading.entity.City;
import com.example.leading.entity.Peoplemessage;
import com.example.leading.entity.Province;
import com.example.leading.mapper.SearchLeading;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SearchLeadService {

    @Autowired( required =  false )
    private SearchLeading searchLeading ;

    public Page<Peoplemessage> searchAll (Map<String,Object> map , String nowPage , String size  ) {
        PageHelper.startPage( Integer.parseInt(nowPage) , Integer.parseInt(size) ) ;
        Page<Peoplemessage> peoplemessages = searchLeading.SearchPeopleMessage(map) ;
        for ( int i = 0 ; i < peoplemessages.size() ; i++ ) {
            StringBuilder stringBuilder = new StringBuilder() ;
            Map<String,Object> citymap = new HashMap<>() ;

            //  搜索出省
            citymap.put( "id" , peoplemessages.get(i).getProvince() ) ;
            List<Province> provinces = searchLeading.SearchAllProvince(citymap);
            stringBuilder.append( provinces.get(0).getName() ) ;
            //  搜索出市
            citymap.put( "id" , peoplemessages.get(i).getCity() ) ;
            List<City> city = searchLeading.SearchAllCity(citymap);
            stringBuilder.append( city.get(0).getName() ) ;
            //  搜索出区
            citymap.put( "id" , peoplemessages.get(i).getArea() ) ;
            List<Areas> area = searchLeading.SearchAllAreas(citymap);
            stringBuilder.append( area.get(0).getName() ) ;
            peoplemessages.get(i).setNativePlace(stringBuilder.toString()) ;


            stringBuilder = new StringBuilder();
            //  搜索出省
            citymap.put( "id" , peoplemessages.get(i).getSprovince() ) ;
            provinces = searchLeading.SearchAllProvince(citymap);
            stringBuilder.append( provinces.get(0).getName() ) ;
            //  搜索出市
            citymap.put( "id" , peoplemessages.get(i).getScity() ) ;
            city = searchLeading.SearchAllCity(citymap);
            stringBuilder.append( city.get(0).getName() ) ;
            //  搜索出区
            citymap.put( "id" , peoplemessages.get(i).getSareas() ) ;
            area = searchLeading.SearchAllAreas(citymap);
            stringBuilder.append( area.get(0).getName() ) ;
            peoplemessages.get(i).setBrandAread(stringBuilder.toString()); ;
        }
        return peoplemessages ;
    }
    public List<Province> searchProProvince(String id ) {
        Map<String, Object> map = new HashMap<>() ;
        map.put( "id" , id ) ;
        List<Province> provinces = searchLeading.SearchAllProvince(map) ;
        return provinces ;
    }

    public List<City> searchCityParent (String id ) {
        Map<String, Object> map = new HashMap<>() ;
        map.put( "parentId" , id ) ;
        List<City> provinces = searchLeading.SearchAllCity(map) ;
        return provinces ;
    }

    public List<Areas> searchAreaParent (String id ) {
        Map<String, Object> map = new HashMap<>() ;
        map.put( "parentId" , id ) ;
        List<Areas> provinces = searchLeading.SearchAllAreas(map) ;
        return provinces ;
    }
}
