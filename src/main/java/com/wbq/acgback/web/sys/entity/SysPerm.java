package com.wbq.acgback.web.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 系统权限表
 * </p>
 *
 * @author wbq
 * @since 2019-03-07
 */
public class SysPerm extends Model<SysPerm> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限名称
     */
    private String permName;

    /**
     * 权限描述
     */
    private String permDesc;

    /**
     * 权限值
     */
    private String permValue;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 是否禁用
     */
    private Integer isDisable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermDesc() {
        return permDesc;
    }

    public void setPermDesc(String permDesc) {
        this.permDesc = permDesc;
    }

    public String getPermValue() {
        return permValue;
    }

    public void setPermValue(String permValue) {
        this.permValue = permValue;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysPerm{" +
        "id=" + id +
        ", permName=" + permName +
        ", permDesc=" + permDesc +
        ", permValue=" + permValue +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDisable=" + isDisable +
        "}";
    }
}
