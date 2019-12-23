package com.example.yunyoupersonnel.service.PersonnelFile;

import com.example.yunyoupersonnel.entity.Punishment;
import com.example.yunyoupersonnel.mapper.PersonnelFile.PunishAndAwardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PunishAndwardService {

    @Autowired( required =  false )
    private PunishAndAwardMapper punishAndAwardMapper ;

    //    添加惩罚管理
    public void addPunishAndward( Punishment punishment) {
        punishAndAwardMapper.addPunishAndward( punishment );
    }

    //    查询惩罚管理
    public List<Punishment> searchPunishment( ) {
        List<Punishment> punishments = punishAndAwardMapper.searchList() ;
        return punishments ;
    }

    //    删除惩罚管理
    public void deletePunishment( String id ) {
        punishAndAwardMapper.deletePunishAndward( id );
    }
}
