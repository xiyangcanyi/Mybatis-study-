package com.zyp.dao;

import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserTest1 {
    //��Ϊ��ǰ��Ķ���
    static Logger logger = Logger.getLogger(UserTest1.class);
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
    @Test
    public void testLog4j(){
       // Logger logger = Logger.getLogger(UserTest1.class);
    logger.info("info:������testlog4j");
    logger.debug("debug:������testlog4j");
    logger.error("error:������testlog4j");

    }
    @Test
    public void testgetUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for(User user:userList){
            System.out.println(user);
        }

        sqlSession.close();

    }

}
