package com.tian.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Register {
    Integer registerid;
    String userName;
    Integer age;
    String sex;
    String diagnose;
    String address;
    String phone;
    String idcard;
    @JsonFormat(pattern = "yyyy年MM月dd日",timezone = "GMT+8" )
    Date registerDate;
    String operator;
    Double money;
    Integer state;
    Integer departmentId;
    Integer doctorId;
    Integer bedId;
    String department;
    String doctorName;
    String bedName;
    @JsonFormat(pattern = "yyyy年MM月dd日",timezone = "GMT+8" )
    Date endDate;
    Double price;
    Double prices;
    String discount;
    Date zhuan;
    Integer reportid;
    Integer day;

    @Override
    public String toString() {
        return "Register{" +
                "registerid=" + registerid +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", registerDate=" + registerDate +
                ", operator='" + operator + '\'' +
                ", money=" + money +
                ", state=" + state +
                ", departmentId=" + departmentId +
                ", doctorId=" + doctorId +
                ", bedId=" + bedId +
                ", department='" + department + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", bedName='" + bedName + '\'' +
                ", endDate=" + endDate +
                ", price=" + price +
                ", prices=" + prices +
                ", discount='" + discount + '\'' +
                ", zhuan=" + zhuan +
                ", reportid=" + reportid +
                ", day=" + day +
                '}';
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Date getZhuan() {
        return zhuan;
    }

    public void setZhuan(Date zhuan) {
        this.zhuan = zhuan;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
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

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

}
