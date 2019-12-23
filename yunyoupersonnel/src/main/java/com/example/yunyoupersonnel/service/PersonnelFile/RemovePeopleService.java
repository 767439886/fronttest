package com.example.yunyoupersonnel.service.PersonnelFile;

import com.example.yunyoupersonnel.entity.Peoplemove;
import com.example.yunyoupersonnel.mapper.PersonnelFile.RemovePeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemovePeopleService {

    @Autowired( required = false )
    public RemovePeopleMapper removePeopleMapper ;

    public void addRemovePeople(Peoplemove peoplemove ){
        removePeopleMapper.addRemovePeople( peoplemove );
    }

    public List<Peoplemove> searchRemovePeople () {
        List<Peoplemove> peoplemoves = removePeopleMapper.searchRemovePeople() ;
        return peoplemoves ;
    }
}
