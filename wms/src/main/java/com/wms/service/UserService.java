package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wms
 * @since 2023-02-25
 */

public interface UserService extends IService<User> {

    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);
}
