package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Brand;
import com.example.shixuanyoumei.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandService {

    @Autowired( required = false )
    private BrandMapper brandMapper ;

    public List<Brand> SearchBrand () {
        List<Brand> brands = brandMapper.SearchBrand() ;
        return brands ;
    }

    public List<Brand> SearchTypeBrand ( String type ) {
        List<Brand> brands = brandMapper.SearchTypeBrand( type );
        return brands ;
    }
}
