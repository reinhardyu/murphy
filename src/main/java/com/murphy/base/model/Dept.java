package com.murphy.base.model;

import java.util.Date;

public class Dept {
    private String id;

    private String name;

    private String parentId;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private String code;

    private String description;

    private Short evaluateflag;

    private String deptleader;

    private String phone;

    private String fax;

    private Short isdelete;

    private String team;

    private Short ordernum;

    private String handphone;

    private String issendmsg;

    public Dept(String id, String name, String parentId, String createUser, Date createDate, String updateUser, Date updateDate, String code, String description, Short evaluateflag, String deptleader, String phone, String fax, Short isdelete, String team, Short ordernum, String handphone, String issendmsg) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.createUser = createUser;
        this.createDate = createDate;
        this.updateUser = updateUser;
        this.updateDate = updateDate;
        this.code = code;
        this.description = description;
        this.evaluateflag = evaluateflag;
        this.deptleader = deptleader;
        this.phone = phone;
        this.fax = fax;
        this.isdelete = isdelete;
        this.team = team;
        this.ordernum = ordernum;
        this.handphone = handphone;
        this.issendmsg = issendmsg;
    }

    public Dept() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getEvaluateflag() {
        return evaluateflag;
    }

    public void setEvaluateflag(Short evaluateflag) {
        this.evaluateflag = evaluateflag;
    }

    public String getDeptleader() {
        return deptleader;
    }

    public void setDeptleader(String deptleader) {
        this.deptleader = deptleader == null ? null : deptleader.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone == null ? null : handphone.trim();
    }

    public String getIssendmsg() {
        return issendmsg;
    }

    public void setIssendmsg(String issendmsg) {
        this.issendmsg = issendmsg == null ? null : issendmsg.trim();
    }
}