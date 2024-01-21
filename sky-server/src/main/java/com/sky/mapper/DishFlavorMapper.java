package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param list
     */
    void insertBatch(List<DishFlavor> list);

    @Delete("delete from dish_flavor where dish_id =#{dishId}")
    void deleteByDishId(Long DishId);
}