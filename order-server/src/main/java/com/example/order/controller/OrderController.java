package com.example.order.controller;

import com.example.order.entity.OrderTempDto;
import com.example.order.entity.OrderTempVo;
import com.example.order.server.OrderService;
import com.example.order.util.HttpResult;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController //创建一个Rest风格的Controller层
@RequestMapping("/order") //请求路径
public class OrderController {


    @Resource//自动装配
    private OrderService orderService;

    /**
     * 新增订单
     * @param orderTempVo
     * @return
     */
    @PostMapping("/insertOrderData")//发送一个post请求
    @ResponseBody
    public HttpResult insertOrderData(@RequestBody OrderTempVo orderTempVo){
        if(orderTempVo!=null){
            OrderTempDto  orderTempDto = new  OrderTempDto();
            for (int i = 0; i < orderTempVo.getGoodsIds().size(); i++) {
                BeanUtils.copyProperties(orderTempVo,orderTempDto);
                orderTempDto.setGoodsId(orderTempVo.getGoodsIds().get(i));
                orderService.insertOrderData(orderTempDto);
            }
        }
        return HttpResult.ok("操作成功！");
    }

}
