package com.example.order.server.impl;


import com.example.order.entity.OrderTempDto;
import com.example.order.mapper.OrderMapper;
import com.example.order.server.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void insertOrderData(OrderTempDto orderTempDto) {
        orderMapper.insertOrderData(orderTempDto);
    }

}
