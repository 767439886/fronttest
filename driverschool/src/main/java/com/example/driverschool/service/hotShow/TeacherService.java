package com.example.driverschool.service.hotShow;

import com.example.driverschool.entity.Exerciselist;
import com.example.driverschool.entity.Teacher;
import com.example.driverschool.mapper.hotShow.SearchExerisetimelMapper;
import com.example.driverschool.mapper.hotShow.SearcherTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TeacherService {

    @Autowired( required = false )
    private SearcherTeacherMapper searcherTeacherMapper ;
    @Autowired( required =  false )
    private SearchExerisetimelMapper searchExerisetimelMapper ;

    public List<Teacher> searchTeacher () {
        List<Teacher> teachers = searcherTeacherMapper.searcherTeacher() ;
        return teachers ;
    }

    public Teacher searchTeacherId ( String id ) {
        List<Teacher> teachers = searcherTeacherMapper.searcherTeacherId(id) ;
        return teachers.get(0) ;
    }

    public List<Exerciselist> searchExerciseList ( String id ) {
        List<Exerciselist> exerciselists = searchExerisetimelMapper.searchExerciselist(id) ;
        return exerciselists ;
    }
}
