package com.tian.entity;

import java.sql.Date;

public class ReportVo {
    private int reportId;//挂号id
    private String reportName;//患者姓名
    private String sex;//性别
    private int age;//年龄
    private double price;//价钱
    private Date time;//时间
    private String users;//操作员
    private Integer state;//状态
    private  Integer ddepartmentid;//科室id
    private Integer ddoctorid;//医生id
    private Integer dredisteredid;//挂号类型id
    private String department;//科室
    private String doctorName;//医生姓名
    private String type;//挂号类型
    private String carid;//身份证号
    private String phone;//电话
    private  Integer carido;//身份证前
    private Integer caridt;//身份证后
    private Integer cc;//判断日期
    private String datime;
    private  String zhuan;

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

    public String getDatime() {
        return datime;
    }

    public void setDatime(String datime) {
        this.datime = datime;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getCarido() {
        return carido;
    }

    public void setCarido(Integer carido) {
        this.carido = carido;
    }

    public Integer getCaridt() {
        return caridt;
    }

    public void setCaridt(Integer caridt) {
        this.caridt = caridt;
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

    public Integer getDdepartmentid() {
        return ddepartmentid;
    }

    public void setDdepartmentid(Integer ddepartmentid) {
        this.ddepartmentid = ddepartmentid;
    }

    public Integer getDdoctorid() {
        return ddoctorid;
    }

    public void setDdoctorid(Integer ddoctorid) {
        this.ddoctorid = ddoctorid;
    }

    public Integer getDredisteredid() {
        return dredisteredid;
    }

    public void setDredisteredid(Integer dredisteredid) {
        this.dredisteredid = dredisteredid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
