package com.wbq.acgback.web.sys.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wbq.acgback.Util.ret.RetResponse;
import com.wbq.acgback.Util.ret.RetResult;
import com.wbq.acgback.web.sys.entity.UserInfo;
import com.wbq.acgback.web.sys.service.IUserInfoService;
import com.wbq.acgback.web.sys.service.impl.UserInfoServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;


/**
* @author wbq
* @since 2019-03-07
*/
@Api(tags = {"用户信息表"})
@RestController
@RequestMapping("/sys/userInfo")
    public class UserInfoController {
    @Resource
    private IUserInfoService iUserInfoService;

    @GetMapping("/1")
    @ApiOperation("获取所有用户")
    public RetResult<List<UserInfo>>selectAll (){
        List<UserInfo> res=iUserInfoService.list();
        return RetResponse.makeOKRsp(res);
    }

    @PostMapping("/2")
    @ApiOperation("分页获取")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current",value = "当前页",dataType = "int"),
            @ApiImplicitParam(name = "size",value = "每页个数",dataType = "int")
    })
    public RetResult<IPage<UserInfo>> selectAllList( @ApiIgnore Page page){
        IPage<UserInfo>res =iUserInfoService.page(page);
        return RetResponse.makeOKRsp(res);
    }

}

