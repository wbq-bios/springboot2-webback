package com.wbq.acgback.dao;

import com.wbq.acgback.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:35
 **/
    public interface UserInfoMapper {

        UserInfo selectById(@Param("id") Integer id);
    }

