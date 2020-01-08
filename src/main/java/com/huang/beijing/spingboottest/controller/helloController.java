package com.huang.beijing.spingboottest.controller;

import com.huang.beijing.spingboottest.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Retention;
import java.util.Date;

@RestController
public class helloController {
    @Autowired
    User user;
    @GetMapping("hello")
    public User hello(){
        user.setDate(new Date());
        user.setPrice(2f);
        return user;
    }
    @GetMapping("getUser")
    public ModelAndView getModel(){
        User user1=new User();
        user1.setUsername("zhangsan");
        user1.setSex("nan");
        user1.setTelephone("6666");
        user1.setDate(new Date());
        user1.setPrice(2.2f);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user",user1);
        modelAndView.setViewName("User");
        return modelAndView;
    }
}
