package com.example.shixuanyoumei.mapper;

import com.example.shixuanyoumei.entity.Brand;

import java.util.List;

public interface BrandMapper {

    public List<Brand>  SearchTypeBrand( String type ) ;
    public List<Brand>  SearchBrand ( ) ;
}
