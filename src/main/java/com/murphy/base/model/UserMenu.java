package com.murphy.base.model;

public class UserMenu {
    private String id;

    private String userId;

    private String authorityId;

    public UserMenu(String id, String userId, String authorityId) {
        this.id = id;
        this.userId = userId;
        this.authorityId = authorityId;
    }

    public UserMenu() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }
}