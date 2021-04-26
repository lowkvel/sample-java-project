package com.example.order.mapper;

import com.example.order.entity.OrderTempDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    /**
     * 新增订单
     * @param orderTempDto
     */
    void insertOrderData(OrderTempDto orderTempDto);
}
