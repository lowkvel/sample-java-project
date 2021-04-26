package com.example.order.server;

import com.example.order.entity.OrderTempDto;

public interface OrderService {


    /**
     * 新增订单
     * @param orderTempDto
     */
    void insertOrderData(OrderTempDto orderTempDto);
}
