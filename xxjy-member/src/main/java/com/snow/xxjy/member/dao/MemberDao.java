package com.snow.xxjy.member.dao;

import com.snow.xxjy.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 14:20:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
