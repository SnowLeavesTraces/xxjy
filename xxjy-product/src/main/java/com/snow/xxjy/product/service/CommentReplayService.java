package com.snow.xxjy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.xxjy.common.utils.PageUtils;
import com.snow.xxjy.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 12:06:34
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

