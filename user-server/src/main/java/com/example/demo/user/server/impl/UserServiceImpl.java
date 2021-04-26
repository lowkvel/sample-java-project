package com.example.demo.user.server.impl;

import com.example.demo.user.entity.UserDto;
import com.example.demo.user.server.UserService;
import com.example.demo.user.userMapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public UserDto findUserByUserId(String id) {
        return userMapper.findUserByUserId(id);
    }

    @Override
    public List<UserDto> findAllUser() {
        return userMapper.findAllUser();
    }
}
