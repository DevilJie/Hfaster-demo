package com.daniuwl.hsj.entity;

import hsj.czy.mybatisframe.annotation.PrimaryKey;
import hsj.czy.mybatisframe.entity.ChBatisEntity;

import java.util.Date;

/**
 * 实体类基类 类BaseEntity.java的实现描述：TODO 类实现描述
 * 
 * @author Administrator 2017年2月7日 下午3:44:01
 */
public class BaseEntity extends ChBatisEntity {

    private static final long serialVersionUID = -8761609117486485206L;

    private Date              createDate;                              // 创建日期

    private Date              modifyDate;                              // 修改日期

    private String            id;

    @PrimaryKey(key = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void onSave() {
        this.createDate = new Date();
        this.modifyDate = new Date();
    }

    @Override
    public void onUpdate() {
        this.modifyDate = new Date();
    }

    @Override
    public void onDelete() {
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
