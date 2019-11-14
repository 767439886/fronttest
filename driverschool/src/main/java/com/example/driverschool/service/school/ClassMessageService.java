package com.example.driverschool.service.school;

import com.example.driverschool.entity.ClassMessage;
import com.example.driverschool.mapper.school.SearchAllClassMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Service
public class ClassMessageService {

    @Autowired( required =  false )
    private SearchAllClassMessageMapper searchAllClassMessageMapper ;

    public List<ClassMessage> SearchClassMessage () {
        List<com.example.driverschool.entity.ClassMessage> classMessages = searchAllClassMessageMapper.SearchAllClass(null);
        return classMessages ;
    }
}
