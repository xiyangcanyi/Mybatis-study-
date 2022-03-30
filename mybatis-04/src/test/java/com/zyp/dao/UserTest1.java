package com.zyp.dao;

import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserTest1 {
    //类为当前类的对象
    static Logger logger = Logger.getLogger(UserTest1.class);
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
    @Test
    public void testLog4j(){
       // Logger logger = Logger.getLogger(UserTest1.class);
    logger.info("info:进入了testlog4j");
    logger.debug("debug:进入了testlog4j");
    logger.error("error:进入了testlog4j");

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
