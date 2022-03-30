package com.zyp.dao;

import com.zyp.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper1 {

    public List<User> getUserList();
    User getUserListById(int id);
    int addUser(User user);
    int updateByID(User user);
    int deleteById(int id);
    //·ÖÒ³
    List<User> getUserByLimit(Map<String,Integer> map);
}
