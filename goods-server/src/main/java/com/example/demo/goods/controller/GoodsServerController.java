package com.example.demo.goods.controller;


import com.example.demo.entity.GoodsDto;
import com.example.demo.goods.service.GoodsService;
import com.example.demo.util.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController //创建一个Rest风格的Controller层
@RequestMapping("/goods") //请求路径
public class GoodsServerController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/findAllgoods")
    @ResponseBody
    public HttpResult findAllgoods(@RequestParam( value = "" , required = false ) final String goodsName){
        System.out.println("findAllgoods: " +goodsName);
        List<GoodsDto> allgoods = goodsService.findAllgoods();
        return HttpResult.ok(allgoods);
    }



    @PostMapping("/findGoodsById")
    @ResponseBody
    public HttpResult findGoodsById(@RequestBody String  id){
        GoodsDto goodsById = goodsService.findGoodsById(id);
        return HttpResult.ok(goodsById);
    }



    @GetMapping("/removeGoodsById")
    @ResponseBody
    public HttpResult removeGoodsById(@RequestParam ( value = "id" , required = false ) final String id){
        goodsService.removeGoodsById(id);
        return HttpResult.ok("操作成功！");
    }





}
