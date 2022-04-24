package com.ptr17.greenmarket.member.dao;

import com.ptr17.greenmarket.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-24 04:10:58
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
