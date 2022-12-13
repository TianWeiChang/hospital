package com.tian.entity;

import java.sql.Date;


public class CReport {
    private int reportId;
    /**
     * 姓名
     */
    private String reportName;
    /**
     * 行不
     */
    private String sex;
    /**
     * 年龄
     */
    private int age;
    /**
     * 挂号费用价格
     */
    private double price;
    /**
     * 部门
     */
    private Integer department;
    /**
     * 医生
     */
    private Integer doctor;
    /**
     * 挂号类型（专家、普通）
     */
    private Integer reporttype;
    private Date time;
    /**
     * 当前录入用户
     */
    private String users;
    private Integer state;
    /**
     * 身份证号
     */
    private String carid;
    /**
     * 手机号
     */
    private String phone;

    private String zhuan;

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
