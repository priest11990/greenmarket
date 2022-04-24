package com.ptr17.greenmarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ptr17.common.utils.PageUtils;
import com.ptr17.greenmarket.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-24 04:29:52
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

