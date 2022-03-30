package com.zyp.dao;

import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest1 {
    @Test
    public void test(){
        //��һ�������SqlSession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //��ʽһ��getMapper����
        UserMapper1 userMapper1 = sqlSession.getMapper(UserMapper1.class);
        List<User> userList = userMapper1.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        //�ر�sqlSession
        sqlSession.close();

    }
    @Test
    public void getUserListtest(){
        //��һ�������SqlSession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //��ʽһ��getMapper����
        UserMapper1 userMapper1 = sqlSession.getMapper(UserMapper1.class);
        User userList = userMapper1.getUserListById(2);
            System.out.println(userList);

        //�ر�sqlSession
        sqlSession.close();

    }
}
