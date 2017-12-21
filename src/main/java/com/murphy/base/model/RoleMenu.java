package com.murphy.base.model;

public class RoleMenu {
    private String id;

    private String roleId;

    private String authorityId;

    public RoleMenu(String id, String roleId, String authorityId) {
        this.id = id;
        this.roleId = roleId;
        this.authorityId = authorityId;
    }

    public RoleMenu() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }
}