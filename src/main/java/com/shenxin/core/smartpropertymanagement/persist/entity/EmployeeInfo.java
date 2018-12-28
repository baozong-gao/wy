package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class EmployeeInfo {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal departmentId;

    private String employeeType;

    private String employeeRole;

    private String name;

    private String mobile;

    private String sex;

    private BigDecimal age;

    private String education;

    private String departmentChairman;

    private String appUser;

    private String loginId;

    private String loginPasswd;

    private String passswdSalt;

    private String employeeStatus;

    private String wxOpenId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigDecimal departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType == null ? null : employeeType.trim();
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole == null ? null : employeeRole.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDepartmentChairman() {
        return departmentChairman;
    }

    public void setDepartmentChairman(String departmentChairman) {
        this.departmentChairman = departmentChairman == null ? null : departmentChairman.trim();
    }

    public String getAppUser() {
        return appUser;
    }

    public void setAppUser(String appUser) {
        this.appUser = appUser == null ? null : appUser.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd == null ? null : loginPasswd.trim();
    }

    public String getPassswdSalt() {
        return passswdSalt;
    }

    public void setPassswdSalt(String passswdSalt) {
        this.passswdSalt = passswdSalt == null ? null : passswdSalt.trim();
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus == null ? null : employeeStatus.trim();
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }
}