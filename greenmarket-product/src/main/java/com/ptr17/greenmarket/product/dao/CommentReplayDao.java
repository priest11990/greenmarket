package com.ptr17.greenmarket.Product.dao;

import com.ptr17.greenmarket.Product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-22 07:49:19
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
