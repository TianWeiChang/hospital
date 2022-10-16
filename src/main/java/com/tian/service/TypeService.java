package com.tian.service;

import com.tian.entity.Type;

import java.util.List;

public interface TypeService {
    //类型的增删查改
    List<Type> findAllType(Type type);
    int deleteType(Integer typeId);
    int addType(Type type);
    int count(Type type);
}
