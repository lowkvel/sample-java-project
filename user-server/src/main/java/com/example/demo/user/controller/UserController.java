package com.example.demo.user.controller;


import com.example.demo.user.entity.UserDto;
import com.example.demo.user.server.UserService;
import com.example.demo.util.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController //创建一个Rest风格的Controller层
@RequestMapping("/user") //请求路径
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/findAllUser")
    @ResponseBody
    public HttpResult findAllUser(){
        List<UserDto> allUser = userService.findAllUser();
        return HttpResult.ok(allUser);
    }


    /**
     * 查询用户Id
     * @param id
     * @return
     */
    @GetMapping("/findUserByUserId")
    @ResponseBody
    public HttpResult findUserByUserId(@RequestParam ( value = "id" , required = false ) final String id){
        UserDto userByUserId = userService.findUserByUserId(id);
        return HttpResult.ok(userByUserId);
    }
}
