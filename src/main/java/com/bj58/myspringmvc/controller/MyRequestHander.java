package com.bj58.myspringmvc.controller;

import com.bj58.myspringmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xgy
 * @create 2019-05-30 11:09
 **/
@Controller
public class MyRequestHander {

    @Autowired
    StudentService studentService;

    @RequestMapping("/testRequestParam/")
    public String testRequestParam(@RequestParam(value = "id",required = false) String id){
        System.out.println("testRequestParam id:"+id);

        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id){
        System.out.println("testPathVariable id:"+id);

        return "success";
    }

    @RequestMapping("/getStudentName/")
    public String getStudentName(@RequestParam(value = "id",required = false) String id){

        System.out.println("getStudentName id:"+id);
        String name = studentService.getStudentNameById(id);
        System.out.println("---------name="+name);
        return "success";
    }
}
