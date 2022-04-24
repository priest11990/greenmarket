package com.ptr17.greenmarket.order.dao;

import com.ptr17.greenmarket.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-24 04:22:12
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
