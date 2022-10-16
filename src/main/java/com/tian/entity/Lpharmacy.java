package com.tian.entity;

import java.util.Date;

public class Lpharmacy {

    Integer pharmacyId;
    String pharmacyName;
    Integer rugstoreId;
    Integer skullId;
    Integer warehouseId;
    Integer unitId;
    Double sellingPrice;
    Integer areaId;
    Integer typeId;
    Date produceDate;
    Date validDate;
    Integer drugstorenum;
    String skullbatch;
    String unitName;
    String areaName;
    String typeName;

    @Override
    public String toString() {
        return "Lpharmacy{" +
                "pharmacyId=" + pharmacyId +
                ", pharmacyName='" + pharmacyName + '\'' +
                ", rugstoreId=" + rugstoreId +
                ", skullId=" + skullId +
                ", warehouseId=" + warehouseId +
                ", unitId=" + unitId +
                ", sellingPrice=" + sellingPrice +
                ", areaId=" + areaId +
                ", typeId=" + typeId +
                ", produceDate=" + produceDate +
                ", validDate=" + validDate +
                ", drugstorenum=" + drugstorenum +
                ", skullbatch='" + skullbatch + '\'' +
                ", unitName='" + unitName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public Integer getRugstoreId() {
        return rugstoreId;
    }

    public void setRugstoreId(Integer rugstoreId) {
        this.rugstoreId = rugstoreId;
    }

    public Integer getSkullId() {
        return skullId;
    }

    public void setSkullId(Integer skullId) {
        this.skullId = skullId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getSkullbatch() {
        return skullbatch;
    }

    public void setSkullbatch(String skullbatch) {
        this.skullbatch = skullbatch;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
