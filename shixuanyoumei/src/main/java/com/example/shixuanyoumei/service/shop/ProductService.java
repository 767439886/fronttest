package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Shopping;
import com.example.shixuanyoumei.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired( required =  false )
    private ProductMapper productMapper ;

    public List<Shopping> SearchtypePeoduct ( String type ) {
        List<Shopping> shoppings = productMapper.SearchTypeShop(type) ;
        return shoppings ;
    }
}
