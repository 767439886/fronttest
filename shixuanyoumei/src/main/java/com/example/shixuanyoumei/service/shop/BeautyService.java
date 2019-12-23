package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Beauty;
import com.example.shixuanyoumei.mapper.BeautyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BeautyService {

    @Autowired( required =  false )
    private BeautyMapper beautyMapper ;

    public List<Beauty> SearchBeautyList() {
        List<Beauty> beauties = beautyMapper.SearchBeautyList() ;
        return beauties ;
    }

    public List<Beauty> SearchBeautyCity ( String cityId ) {
        List<Beauty> beauties = beautyMapper.SearchCityBeauty(cityId) ;
        return beauties ;
    }
}
