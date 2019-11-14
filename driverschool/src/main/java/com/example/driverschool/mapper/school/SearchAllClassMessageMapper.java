package com.example.driverschool.mapper.school;

import com.example.driverschool.controller.school.SchoolExcerice;
import com.example.driverschool.entity.ClassMessage;
import com.example.driverschool.entity.Userdriverschool;

import java.util.List;

public interface SearchAllClassMessageMapper {
    public List<ClassMessage> SearchAllClass( String id ) ;
    public void insertSchoolExcerice (Userdriverschool userdriverschool ) ;
}
