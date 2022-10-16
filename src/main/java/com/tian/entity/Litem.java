package com.tian.entity;

public class Litem {
    Integer inoutpatientId;
    String projectName;
    Integer unitId;
    Integer projectId;
    Double price;
    String unitName;
    String projectNames;

    @Override
    public String toString() {
        return "Litem{" +
                "inoutpatientId=" + inoutpatientId +
                ", projectName='" + projectName + '\'' +
                ", unitId=" + unitId +
                ", projectId=" + projectId +
                ", price=" + price +
                ", unitName='" + unitName + '\'' +
                ", projectNames='" + projectNames + '\'' +
                '}';
    }

    public Integer getInoutpatientId() {
        return inoutpatientId;
    }

    public void setInoutpatientId(Integer inoutpatientId) {
        this.inoutpatientId = inoutpatientId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getProjectNames() {
        return projectNames;
    }

    public void setProjectNames(String projectNames) {
        this.projectNames = projectNames;
    }
}
