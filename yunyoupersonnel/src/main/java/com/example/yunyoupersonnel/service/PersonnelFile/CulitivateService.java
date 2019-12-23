package com.example.yunyoupersonnel.service.PersonnelFile;

import com.example.yunyoupersonnel.entity.Culitivate;
import com.example.yunyoupersonnel.mapper.PersonnelFile.CulitivateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CulitivateService {

    @Autowired( required =  false )
    private CulitivateMapper culitivateMapper ;

    //  添加管理培训
    public void addCulitivate (  String[] ids , Culitivate culitivate ) {
        String[] ts = culitivate.getEndDate().split("T") ;
        culitivate.setEndDate( ts[0] ) ;
        ts = culitivate.getStartDate().split("T") ;
        culitivate.setStartDate( ts[0] ) ;
        for ( int i = 0 ; i < ids.length ; i++ ) {
            culitivate.setUid( Integer.parseInt(ids[i] ) ) ;
            culitivateMapper.addCulitivate(culitivate);
        }
    }

    //  查询管理培训
    public List<Culitivate> searchCulitivate ( ) {
        List<Culitivate> culitivate = culitivateMapper.searchCulitivate() ;
        return culitivate;
    }

    //  删除培训
    public void deleteCulitivate ( String id ) {
        culitivateMapper.deleteCulitivate( id );
    }

    //  修改管理
    public void updateCulitivate ( String uid , Culitivate culitivate ) {
        String[] ts = culitivate.getEndDate().split("T") ;
        culitivate.setEndDate( ts[0] ) ;
        ts = culitivate.getStartDate().split("T") ;
        culitivate.setStartDate( ts[0] ) ;
        culitivateMapper.updateCulitivate( culitivate  );
    }
}
