package com.wbq.acgback.service;

import com.wbq.acgback.domain.UserInfo;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:38
 **/
public interface UserInfoService {

    UserInfo selectById(Integer id);

}
