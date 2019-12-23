package com.example.shixuanyoumei.service.shop;

import com.example.shixuanyoumei.entity.Advisory;
import com.example.shixuanyoumei.mapper.AdvisoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdvisoryService {

    @Autowired( required = false )
    private AdvisoryMapper advisoryMapper ;

    public List<Advisory> searchAdvisoryList () {
        List<Advisory> advisories = advisoryMapper.SearchAdvisory() ;
        return advisories ;
    }
}
