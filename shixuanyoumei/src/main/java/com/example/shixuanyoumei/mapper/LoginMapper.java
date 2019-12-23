package com.example.shixuanyoumei.mapper;

import com.example.shixuanyoumei.entity.User;
import java.util.List;

public interface LoginMapper {

    public List<User> searchMapper(User user ) ;
    public void updateMapper( User user ) ;
}
