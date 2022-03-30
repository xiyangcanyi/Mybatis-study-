package com.zyp.dao;

import com.zyp.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from mybatis.teacher where id=#{tid}")
    Teacher getTeacherList(@Param("tid") int id);
}
