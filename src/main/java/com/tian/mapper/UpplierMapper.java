package com.tian.mapper;

import com.tian.entity.Upplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UpplierMapper {
    //供货商的增删查改
    List<Upplier> findAllUpplier(Upplier upplier);
    int deleteUpplier(Integer supplierId);
    int addUpplier(Upplier upplier);
    int count(Upplier upplier);
}
