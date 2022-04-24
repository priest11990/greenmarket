package com.ptr17.greenmarket.Product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ptr17.common.utils.PageUtils;
import com.ptr17.greenmarket.Product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-22 07:49:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

