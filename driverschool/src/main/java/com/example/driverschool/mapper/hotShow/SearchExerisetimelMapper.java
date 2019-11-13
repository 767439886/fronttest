package com.example.driverschool.mapper.hotShow;


import com.example.driverschool.entity.Exerciselist;
import java.util.List;
import java.util.Map;

public interface SearchExerisetimelMapper {
    public List<Exerciselist> searchExerciselist(Map<String,String> exerciseTime ) ;
    public void addExerciselist( Exerciselist exerciselist ) ;
}
