package com.example.demo.goods.GoodsMapper;

import com.example.demo.entity.GoodsDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface GoodsMapper {


    /**
     * 查所有商品
     * @return
     */
    List<GoodsDto> findAllgoods();

    /**
     * 根据Id查商品
     * @return
     */
    GoodsDto findGoodsById(String id);


    @Delete("delete from t_goods where id = #{id}")
    void removeGoodsById(String id);
}
