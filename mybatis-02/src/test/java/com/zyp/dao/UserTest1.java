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
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        //�ر�sqlSession
        sqlSession.close();

    }
}
