package com.tian.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Lcheckup {

    Integer cid;
    Integer registerid;
    String content;
    @JsonFormat(pattern = "yyyy年MM月dd日",timezone = "GMT+8" )
    Date citme;
    String userName;

    @Override
    public String toString() {
        return "Lcheckup{" +
                "cid=" + cid +
                ", registerid=" + registerid +
                ", content='" + content + '\'' +
                ", citme=" + citme +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCitme() {
        return citme;
    }

    public void setCitme(Date citme) {
        this.citme = citme;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
