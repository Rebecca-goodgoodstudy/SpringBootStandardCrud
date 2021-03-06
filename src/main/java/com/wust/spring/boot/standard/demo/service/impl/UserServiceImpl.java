package com.wust.spring.boot.standard.demo.service.impl;

import com.wust.spring.boot.standard.demo.entity.UserEntity;
import com.wust.spring.boot.standard.demo.mapper.UserMapper;
import com.wust.spring.boot.standard.demo.model.User;
import com.wust.spring.boot.standard.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public Integer createUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setBirthday(user.getBirthday());
        userEntity.setGender(user.getGender());

        return userMapper.insert(userEntity);
    }
}
