package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.Project;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wms
 * @since 2023-02-26
 */

public interface ProjectService extends IService<Project> {
    IPage pageC(IPage<Project> page);

    IPage pageCC(IPage<Project> page, Wrapper wrapper);

}
