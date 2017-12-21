package com.murphy.base.model;

import java.util.Date;

public class User {
    private String id;

    private String loginname;

    private String dept;

    private String password;

    private String name;

    private String grade;

    private String serialnumber;

    private String phone;

    private String email;

    private String mobilephone;

    private String lead;

    private String position;

    private String otherdept;

    private String activation;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private String jobposition;

    private String photo;

    private String isstation;

    private String receicestate;

    private String areaId;

    private String headImage;

    public User(String id, String loginname, String dept, String password, String name, String grade, String serialnumber, String phone, String email, String mobilephone, String lead, String position, String otherdept, String activation, String createUser, Date createDate, String updateUser, Date updateDate, String jobposition, String photo, String isstation, String receicestate, String areaId) {
        this.id = id;
        this.loginname = loginname;
        this.dept = dept;
        this.password = password;
        this.name = name;
        this.grade = grade;
        this.serialnumber = serialnumber;
        this.phone = phone;
        this.email = email;
        this.mobilephone = mobilephone;
        this.lead = lead;
        this.position = position;
        this.otherdept = otherdept;
        this.activation = activation;
        this.createUser = createUser;
        this.createDate = createDate;
        this.updateUser = updateUser;
        this.updateDate = updateDate;
        this.jobposition = jobposition;
        this.photo = photo;
        this.isstation = isstation;
        this.receicestate = receicestate;
        this.areaId = areaId;
    }

    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String logonname) {
        this.loginname = logonname == null ? null : logonname.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead == null ? null : lead.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getOtherdept() {
        return otherdept;
    }

    public void setOtherdept(String otherdept) {
        this.otherdept = otherdept == null ? null : otherdept.trim();
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation == null ? null : activation.trim();
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

    public String getJobposition() {
        return jobposition;
    }

    public void setJobposition(String jobposition) {
        this.jobposition = jobposition == null ? null : jobposition.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getIsstation() {
        return isstation;
    }

    public void setIsstation(String isstation) {
        this.isstation = isstation == null ? null : isstation.trim();
    }

    public String getReceicestate() {
        return receicestate;
    }

    public void setReceicestate(String receicestate) {
        this.receicestate = receicestate == null ? null : receicestate.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }
}