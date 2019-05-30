package com.bj58.myspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xgy
 * @create 2019-05-30 11:09
 **/
@Controller
public class MyRequestHander {

    @RequestMapping("/testRequestParam/")
    public String testRequestParam(@RequestParam(value = "id",required = false) String id){
        System.out.println("id:"+id);

        return "success";
    }
}
