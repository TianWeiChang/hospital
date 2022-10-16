package com.tian.entity;


public class Outpatienttype {
    private Integer outpatientId;
    private String projectName;
    private String pprojectName;
    private double price;
    private Integer bigprojectId;
    private Integer projectId;
    private Integer unit;
    private Integer unitId;
    private String unitName;
    private Integer ostate;

    public String getPprojectName() {
        return pprojectName;
    }

    public void setPprojectName(String pprojectName) {
        this.pprojectName = pprojectName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(Integer outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getBigprojectId() {
        return bigprojectId;
    }

    public void setBigprojectId(Integer bigprojectId) {
        this.bigprojectId = bigprojectId;
    }


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }
}
