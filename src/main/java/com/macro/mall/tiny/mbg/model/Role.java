package com.macro.mall.tiny.mbg.model;

import java.io.Serializable;

public class Role implements Serializable {
    private int role_id;
    private  String role_name;
    private String remark;
    private static final long serialVersionUID = 1L;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
