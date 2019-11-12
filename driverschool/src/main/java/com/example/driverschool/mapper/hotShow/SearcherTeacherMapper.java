package com.example.driverschool.mapper.hotShow;

import com.example.driverschool.entity.Teacher;

import java.util.List;

public interface SearcherTeacherMapper {

    public List<Teacher> searcherTeacher () ;
    public List<Teacher> searcherTeacherId ( String id ) ;
}
