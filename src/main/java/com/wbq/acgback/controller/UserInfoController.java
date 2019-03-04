package com.wbq.acgback.controller;

import com.wbq.acgback.Util.ret.RetResponse;
import com.wbq.acgback.Util.ret.RetResult;
import com.wbq.acgback.domain.UserInfo;
import com.wbq.acgback.service.UserInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:49
 **/
@RestController
@RequestMapping("2")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @PostMapping("/11")
    public RetResult<UserInfo> selectById(Integer id){
        UserInfo res=userInfoService.selectById(id);
        return RetResponse.makeOKRsp(res);
    }
}