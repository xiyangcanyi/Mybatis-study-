package com.zyp.dao;

import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest1 {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper（）
        UserMapper1 userMapper1 = sqlSession.getMapper(UserMapper1.class);
        List<User> userList = userMapper1.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();

    }
    @Test
    public void getUserListtest(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper（）
        UserMapper1 userMapper1 = sqlSession.getMapper(UserMapper1.class);
        User userList = userMapper1.getUserListById(2);
            System.out.println(userList);

        //关闭sqlSession
        sqlSession.close();

    }
}
