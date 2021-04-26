package com.example.order.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderTempVo {
    private String id;

  
    private String orderNo;

  
    private List<String> goodsIds;


    private String userId;

  
    private String dataState;

  
    private String dateFlag;

  
    private String modifyTime;

  
    private String makeTime;

}
