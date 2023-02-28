package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.Project;
import com.wms.entity.User;
import com.wms.mapper.ProjectMapper;
import com.wms.mapper.UserMapper;
import com.wms.service.ProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wms
 * @since 2023-02-26
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public IPage pageC(IPage<Project> page) {
        return projectMapper.pageC(page);
    }

    @Override
    public IPage pageCC(IPage<Project> page, Wrapper wrapper) {
        return projectMapper.pageCC(page,wrapper);
    }

}
