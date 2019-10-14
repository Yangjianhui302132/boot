package com.jeff.springboot.demo.dao.user;

import com.jeff.springboot.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    List<User> listAll();

    void insertSelective(User user);
}
