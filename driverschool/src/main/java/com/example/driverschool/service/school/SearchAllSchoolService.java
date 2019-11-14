package com.example.driverschool.service.school;

import com.example.driverschool.entity.DriverSchool;
import com.example.driverschool.mapper.school.SearchAllSchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class SearchAllSchoolService {

    @Autowired( required =  false )
    private SearchAllSchoolMapper searchAllSchoolMapper ;

    public List<DriverSchool> searchAllSchool( String id ){
        List<DriverSchool> schools = searchAllSchoolMapper.searchAllSchool( id ) ;
        return schools ;
    }
}
