package com.zyp.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String name;
    //ѧ������һ����ʦ
    private Teacher teacher;
}
