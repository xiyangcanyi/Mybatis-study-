package com.zyp.dao;

import com.zyp.dao.UserDao;
import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
public class UserTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper（）
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();

    }
    @Test
    public void testgetUserByID(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserListById(1);
        System.out.println(user);

        sqlSession.close();

    }
    @Test
    public void testaddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int rs=userDao.addUser(new User(9, "zhaoyun", "123456"));
        if(rs>0){
            System.out.println("成功插入数据");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int rs=userDao.updateByID(new User(9,"zhaoyaopeng","123456789"));
        if(rs>0){
            System.out.println("成功修改数据");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdeleteeUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int rs=userDao.deleteById(9);
        if(rs>0){
            System.out.println("成功删除数据");
        }else {
            System.out.println("删除失败");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
