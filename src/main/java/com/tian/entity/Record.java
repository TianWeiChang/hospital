package com.tian.entity;

import java.util.Date;

public class Record {
    private Integer jiluid;
    private  Date jilutime;
    private String jiluname;
    private String jilutype;

    private String jilupeople;
    private String jilupihao;
    private Integer  jilunumber;

    public Integer getJilunumber() {
        return jilunumber;
    }

    public void setJilunumber(Integer jilunumber) {
        this.jilunumber = jilunumber;
    }

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public Date getJilutime() {
        return jilutime;
    }

    public void setJilutime(Date jilutime) {
        this.jilutime = jilutime;
    }

    public String getJiluname() {
        return jiluname;
    }

    public void setJiluname(String jiluname) {
        this.jiluname = jiluname;
    }

    public String getJilutype() {
        return jilutype;
    }

    public void setJilutype(String jilutype) {
        this.jilutype = jilutype;
    }

    public String getJilupeople() {
        return jilupeople;
    }

    public void setJilupeople(String jilupeople) {
        this.jilupeople = jilupeople;
    }

    public String getJilupihao() {
        return jilupihao;
    }

    public void setJilupihao(String jilupihao) {
        this.jilupihao = jilupihao;
    }
}
