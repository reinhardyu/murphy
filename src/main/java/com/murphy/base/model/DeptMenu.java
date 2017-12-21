package com.murphy.base.model;

public class DeptMenu {
    private String deptId;

    private String authorityId;

    public DeptMenu(String deptId, String authorityId) {
        this.deptId = deptId;
        this.authorityId = authorityId;
    }

    public DeptMenu() {
        super();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }
}