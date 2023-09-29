package com.snow.xxjy.product.dao;

import com.snow.xxjy.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 12:06:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
