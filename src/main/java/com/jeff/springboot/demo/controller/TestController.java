package com.jeff.springboot.demo.controller;

import com.jeff.springboot.demo.entity.User;
import com.jeff.springboot.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> listUser(){
        return userService.listAll();
    }

    @PostMapping("/save")
    public User save(User user){
        return userService.save(user);
    }
}

