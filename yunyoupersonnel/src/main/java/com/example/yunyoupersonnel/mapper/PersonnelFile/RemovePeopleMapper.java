package com.example.yunyoupersonnel.mapper.PersonnelFile;

import com.example.yunyoupersonnel.entity.Peoplemove;

import java.util.List;

public interface RemovePeopleMapper {

    public void addRemovePeople(Peoplemove peoplemove ) ;
    public List<Peoplemove> searchRemovePeople () ;
}
