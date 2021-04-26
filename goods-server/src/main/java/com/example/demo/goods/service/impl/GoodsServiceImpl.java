package com.example.demo.goods.service.impl;

import com.example.demo.entity.GoodsDto;
import com.example.demo.goods.GoodsMapper.GoodsMapper;
import com.example.demo.goods.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<GoodsDto> findAllgoods(){
        List<GoodsDto> allgoods = goodsMapper.findAllgoods();
        return allgoods;
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    /**
     * 根据Id查商品
     * @return
     */
    public GoodsDto findGoodsById(String id){
        return goodsMapper.findGoodsById(id);
    }

    @Override
    public void removeGoodsById(String id) {
        goodsMapper.removeGoodsById(id);
    }


}
