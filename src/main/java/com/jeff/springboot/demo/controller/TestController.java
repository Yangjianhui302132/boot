package com.jeff.springboot.demo.controller;

import com.jeff.springboot.demo.entity.User;
import com.jeff.springboot.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> listUser(){
        return userService.listAll();
    }

    @RequestMapping("/save")
    public User save(User user){
        return userService.save(user);
    }
}

