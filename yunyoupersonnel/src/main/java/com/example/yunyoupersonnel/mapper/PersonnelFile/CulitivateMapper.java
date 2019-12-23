package com.example.yunyoupersonnel.mapper.PersonnelFile;

import com.example.yunyoupersonnel.entity.Culitivate;

import java.util.List;

public interface CulitivateMapper {
    public void deleteCulitivate( String id ) ;
    public List<Culitivate> searchCulitivate () ;
    public void addCulitivate(Culitivate cultivate ) ;
    public void updateCulitivate ( Culitivate culitivate ) ;
}
