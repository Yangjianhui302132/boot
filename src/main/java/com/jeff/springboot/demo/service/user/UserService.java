package com.jeff.springboot.demo.service.user;

import com.jeff.springboot.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> listAll();

    User save(User user);
}
