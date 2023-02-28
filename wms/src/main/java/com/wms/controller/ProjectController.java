package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Project;
import com.wms.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wms
 * @since 2023-02-26
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //新增
    @PostMapping("/save")
    public Result save(@RequestBody Project project){
        return projectService.save(project)?Result.suc():Result.fail();
    }

    //删除
    @GetMapping("/del")
    public Result del(@RequestParam String Pid){
        return projectService.removeById(Pid)?Result.suc():Result.fail();
    }

    //修改
    @PostMapping("/update")
    public Result update(@RequestBody Project project){
        int Pid = project.getPid();
        LambdaQueryWrapper<Project> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.eq(Project::getPid,Pid);
        return projectService.update(project,lambdaQueryWrapper)?Result.suc():Result.fail();
    }

    //查询所有
    @GetMapping("/list")
    public List<Project> list(){
        return projectService.list();
    }

    //查询
    @PostMapping("/listPageC1")
    public Result listPageC1(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
        String Pid = (String) param.get("pid");

        Page<Project> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<Project> lambdaQueryWrapper = new LambdaQueryWrapper();

        if(StringUtils.isNotBlank(Pid)){
            lambdaQueryWrapper.eq(Project::getPid,Pid);
        }
        System.out.println("param=="+param);
        System.out.println("pid=="+Pid);

        IPage result = projectService.pageCC(page,lambdaQueryWrapper);
        System.out.println("total=="+result.getTotal());
        return Result.suc(result.getRecords(),result.getTotal());
    }
}
