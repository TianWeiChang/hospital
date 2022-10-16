package com.tian.entity;

import java.util.Date;

public class Pay {

    int payid;
    int registerid;
    Double money;
    Date payDate;
    String userName;

    @Override
    public String toString() {
        return "Pay{" +
                "payid=" + payid +
                ", registerid=" + registerid +
                ", money=" + money +
                ", payDate=" + payDate +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    public int getRegisterid() {
        return registerid;
    }

    public void setRegisterid(int registerid) {
        this.registerid = registerid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
