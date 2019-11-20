package com.example.yunyoupersonnel.service.PersonnelFile;

import com.example.yunyoupersonnel.entity.User;
import com.example.yunyoupersonnel.mapper.PersonnelFile.PersonnelMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class PersonnelService {

    @Autowired( required =  false )
    private PersonnelMapper addPersonnelMapper ;


    public void addPersonnel(Map<String,Object> map ){
        String graduateDate = (String)map.get("graduateDate") ;
        String[] ts = graduateDate.split("T") ;
        map.put( "graduateDate" , ts[0] ) ;
        addPersonnelMapper.addUser( map ) ;
        addPersonnelMapper.addbasicsmessag( map ) ;
        addPersonnelMapper.addSchoolMessage( map ) ;
    }

    public Page<User> searchAllPeople (String pageSize , String nowPage , Map<String,Object>condition ) {
        int size = Integer.parseInt(pageSize) ;
        int nowpage = Integer.parseInt(nowPage) ;
        PageHelper.startPage(nowpage, size) ;
        Page<User> maps = addPersonnelMapper.SearchAllPage( condition ) ;
        return maps ;
    }

    public void update( Map<String,Object> user ){
        this.delete( user.get("id") +  "" ) ;
        user.put( "FLlevel" , user.get("fllevel") ) ;
        this.addPersonnel(user);
    }

    public void delete( String id ){
        addPersonnelMapper.deleteBasicmessage(id) ;
        addPersonnelMapper.deleteSchool(id) ;
        addPersonnelMapper.deleteUser(id);
    }

    public List<User> searchAllPeopleList () {
        HashMap<String, Object> map = new HashMap<>() ;
        Page<User> users = addPersonnelMapper.SearchAllPage(map) ;
        return users ;
    }
}
