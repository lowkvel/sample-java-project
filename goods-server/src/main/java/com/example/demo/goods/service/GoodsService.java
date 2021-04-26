package com.example.demo.goods.service;

import com.example.demo.entity.GoodsDto;

import java.util.List;


public interface GoodsService {

    /**
     * 查所有商品
     * @return
     */
    List<GoodsDto> findAllgoods();

    /**
     * 查单个商品
     * @param id
     * @return
     */
    GoodsDto findGoodsById(String id);

    /**
     * 根据Id删商品
     * @param id
     */
    void removeGoodsById(String id);



}
