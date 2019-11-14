package com.example.driverschool.service.school;

import com.example.driverschool.entity.Userdriverschool;
import com.example.driverschool.mapper.school.SearchAllClassMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SchoolExcericeService {

    @Autowired
    private SearchAllClassMessageMapper searchAllClassMessageMapper ;

    public void insertSchoolExcerice(Userdriverschool userdriverschool ){
        searchAllClassMessageMapper.insertSchoolExcerice( userdriverschool ) ;
    }
}
