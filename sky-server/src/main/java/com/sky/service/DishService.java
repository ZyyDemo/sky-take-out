package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {
    public void saveWithFavor(DishDTO dto);//新增菜品和对应的口味数据

    PageResult pageQuery(DishPageQueryDTO dto);

    void deleteBatch(List<Long> ids);
}
