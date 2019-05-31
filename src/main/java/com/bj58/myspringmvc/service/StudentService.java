package com.bj58.myspringmvc.service;

import com.bj58.myspringmvc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xgy
 * @create 2019-05-31 18:33
 **/
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public String getStudentNameById(String id){
        System.out.println("StudentService getStudentNameById id= "+id);
        String name = studentDao.getStudentName(id);
        return name;
    }
}
