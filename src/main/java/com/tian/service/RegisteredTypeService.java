package com.tian.service;

import com.tian.entity.Registeredtype;

import java.util.List;

public interface RegisteredTypeService {
    //挂号类型的增删查改
    List<Registeredtype> registeredTypeList(Registeredtype registeredType);
    int deleteType(Integer registeredId);
    int editRegisteredType(Registeredtype Registeredtype);
    int addRegisteredType(Registeredtype Registeredtype);
    int count(Registeredtype registeredType);
}
