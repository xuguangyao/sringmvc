package com.bj58.myspringmvc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentDao {
    @Select({"select sname from student where sid = #{sid}"})
    public String getStudentName(@Param("sid") String studentId);
}
