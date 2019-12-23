package com.example.yunyoupersonnel.mapper.PersonnelFile;

import com.example.yunyoupersonnel.entity.Management;

import java.util.List;

public interface ManagementMapper {

    public void addManagement(Management management ) ;
    public List<Management> searchManagement() ;
    public void deleteManagement( String id ) ;
}
