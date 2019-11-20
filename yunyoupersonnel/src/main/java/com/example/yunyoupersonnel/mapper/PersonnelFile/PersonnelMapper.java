package com.example.yunyoupersonnel.mapper.PersonnelFile;
import com.example.yunyoupersonnel.entity.User;
import com.github.pagehelper.Page;

import java.util.Map;

public interface PersonnelMapper {

    //  增加用户
    public void addUser(Map<String,Object> map ) ;
    public void addSchoolMessage( Map<String,Object> map ) ;
    public void addbasicsmessag( Map<String,Object> map ) ;

    //  搜索
    public Page<User> SearchAllPage(Map<String,Object> condition) ;

    //  删除
    public void deleteUser (String id ) ;
    public void deleteSchool (String id ) ;
    public void deleteBasicmessage (String id ) ;
}
