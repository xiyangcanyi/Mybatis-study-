package com.zyp.dao;

import com.zyp.pojo.Student;

import java.util.List;

public interface StudentMapper  {
    //查询所有学生信息以及老师信息
    public List<Student> getStudentList();
    public List<Student> getStudentList2();

}
