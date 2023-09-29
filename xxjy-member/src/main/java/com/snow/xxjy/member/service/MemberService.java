package com.snow.xxjy.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.xxjy.common.utils.PageUtils;
import com.snow.xxjy.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 14:20:14
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

