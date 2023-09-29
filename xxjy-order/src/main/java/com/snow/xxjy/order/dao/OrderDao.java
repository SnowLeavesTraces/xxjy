package com.snow.xxjy.order.dao;

import com.snow.xxjy.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 14:22:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
