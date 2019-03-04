package com.wbq.acgback.service.impl;

import com.wbq.acgback.dao.UserInfoMapper;
import com.wbq.acgback.domain.UserInfo;
import com.wbq.acgback.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:44
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}