package com.example.demo.user.userMapper;


import com.example.demo.user.entity.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

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
