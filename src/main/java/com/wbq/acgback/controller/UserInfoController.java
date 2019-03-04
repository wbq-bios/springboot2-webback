package com.wbq.acgback.controller;

import com.wbq.acgback.Util.ret.RetResponse;
import com.wbq.acgback.Util.ret.RetResult;
import com.wbq.acgback.domain.UserInfo;
import com.wbq.acgback.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:49
 **/
@RestController
@RequestMapping("2")
@Api(tags = {"用户操作接口"}, description = "userInfoControler")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }


    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "Integer", paramType = "query")
    })
    @PostMapping("/11")
    public RetResult<UserInfo> selectById(@RequestParam Integer id){
        UserInfo res=userInfoService.selectById(id);
        return RetResponse.makeOKRsp(res);
    }
}