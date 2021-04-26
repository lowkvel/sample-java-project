package com.example.demo.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    
    private String id;

    
    private String userId;

    
    private String userName;

    
    private String userCode;

    
    private String passWord;

    
    private String phoneNo;

    
    private String validFlag;

    
    private String idNo;

    
    private String times;

    
    private String lastLogin;

    
    private String statusFlag;

    
    private String statusReason;

    
    private String firstFlag;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDate;

    private String createUser;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;

    
    private String updateUser;

    
    private String sex;

    
    private String workTime;

    
    private String userType;
}
