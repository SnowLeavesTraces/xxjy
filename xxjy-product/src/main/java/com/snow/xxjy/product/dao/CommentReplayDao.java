package com.snow.xxjy.product.dao;

import com.snow.xxjy.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 12:06:34
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
