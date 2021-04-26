package com.example.demo.user.server;

import com.example.demo.user.entity.UserDto;

import java.util.List;

public interface UserService {
    /**
     * 根据Id查询用户信息
     * @param id
     * @return
     */
    UserDto findUserByUserId(String id);


    /**
     * 查询所有用户
     * @return
     */
    List<UserDto> findAllUser();
}
