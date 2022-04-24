package com.ptr17.greenmarket.Product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ptr17.common.utils.PageUtils;
import com.ptr17.greenmarket.Product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-22 07:49:19
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

