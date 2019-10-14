package com.jeff.springboot.demo.service.user.impl;

import com.jeff.springboot.demo.dao.user.UserMapper;
import com.jeff.springboot.demo.entity.User;
import com.jeff.springboot.demo.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public List<User> listAll() {
        return mapper.listAll();
    }

    @Override
    public User save(User user) {
        mapper.insertSelective(user);
        return user;
    }
}
