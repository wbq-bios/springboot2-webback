package com.wbq.acgback.web.sys.service.impl;

import com.wbq.acgback.web.sys.entity.UserInfo;
import com.wbq.acgback.web.sys.mapper.UserInfoMapper;
import com.wbq.acgback.web.sys.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wbq
 * @since 2019-03-07
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
