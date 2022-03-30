package com.zyp.dao;

import com.zyp.pojo.User;

import java.util.List;

public interface UserMapper1 {
    public List<User> getUserList();
    User getUserListById(int id);
    int addUser(User user);
    int updateByID(User user);
    int deleteById(int id);
}
