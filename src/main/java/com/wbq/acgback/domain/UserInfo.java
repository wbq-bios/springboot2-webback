package com.wbq.acgback.domain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 11:24
 **/
@Data
public class UserInfo {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    private String password;
}