package com.tian.service;

import com.tian.entity.Upplier;

import java.util.List;

public interface UpplierService {
    //供货商的增删查改
    List<Upplier> findAllUpplier(Upplier upplier);
    int deleteUpplier(Integer supplierId);
    int addUpplier(Upplier upplier);
    int count(Upplier upplier);
}
