package com.zyp.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String name;
    //学生关联一个老师
    private Teacher teacher;
}
