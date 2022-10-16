package com.tian.entity;



public class CRegisteredtype {
    private int registeredId;//类型id
    private String type;//类型名称
    private double price;//价格

    public int getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
