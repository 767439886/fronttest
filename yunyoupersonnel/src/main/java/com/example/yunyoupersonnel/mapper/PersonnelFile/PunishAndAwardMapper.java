package com.example.yunyoupersonnel.mapper.PersonnelFile;

import com.example.yunyoupersonnel.entity.Punishment;

import java.util.List;

public interface PunishAndAwardMapper {

    public void addPunishAndward( Punishment punishment ) ;
    public List<Punishment> searchList() ;
    public void deletePunishAndward ( String id) ;
}
