package com.example.yunyoupersonnel.service.PersonnelFile;

import com.example.yunyoupersonnel.entity.Management;
import com.example.yunyoupersonnel.mapper.PersonnelFile.ManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {

    @Autowired( required = false )
    private ManagementMapper managementMapper ;

    public void addManagerment(Management management ) {
        managementMapper.addManagement( management  );
    }

    public List<Management> searchManagerment () {
        List<Management> managements = managementMapper.searchManagement( ) ;
        return managements ;
    }

    public void deleteManagerment ( String id ) {
        managementMapper.deleteManagement( id );
    }
}
