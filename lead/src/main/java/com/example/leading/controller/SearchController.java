package com.example.leading.controller;

import com.example.leading.common.PageResult;
import com.example.leading.common.Result;
import com.example.leading.entity.Areas;
import com.example.leading.entity.City;
import com.example.leading.entity.Peoplemessage;
import com.example.leading.entity.Province;
import com.example.leading.service.SearchLeadService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/personnel")
@RestController
public class SearchController {

    @Autowired
    private SearchLeadService searchLeadService ;

    @RequestMapping( "/searchAllPeople" )
    public PageResult searchLeading (String nowPage , String pageSize , @RequestBody Map<String,Object> condition ) {
        try {
            Page<Peoplemessage> peoplemessages = searchLeadService.searchAll(condition, nowPage, pageSize) ;
            return new PageResult( nowPage , peoplemessages.getTotal() , peoplemessages , true) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new PageResult( false) ;
        }
    }

    @RequestMapping( "/searchProProvince")
    public Result searchProProvinceController () {
        try {
            List<Province> provinces = searchLeadService.searchProProvince(null) ;
            return new Result( provinces ,"搜索成功" ,  true) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索异常" , false) ;
        }
    }

    @RequestMapping( "/searchCity" )
    public Result searchCity ( String parentId ) {
        try {
            List<City> cities = searchLeadService.searchCityParent(parentId);
            return new Result( cities ,"搜索成功" ,  true) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索异常" , false) ;
        }
    }

    @RequestMapping( "/searchArea" )
    public Result searchArea ( String parentId ) {
        try {
            List<Areas> cities = searchLeadService.searchAreaParent(parentId);
            return new Result( cities ,"搜索成功" ,  true) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索异常" , false) ;
        }
    }
}
