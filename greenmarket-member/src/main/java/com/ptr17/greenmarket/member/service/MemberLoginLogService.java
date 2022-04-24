package com.ptr17.greenmarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ptr17.common.utils.PageUtils;
import com.ptr17.greenmarket.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author ptr17
 * @email ikaros11990@gmail.com
 * @date 2022-04-24 04:10:58
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

