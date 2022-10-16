package com.tian.service;

import com.tian.entity.*;

import java.util.List;

public interface StoreService {
    //查询库房药品信息
   List<Drugstore> selStore(Drugstore drugstore);
   //查询药品类型
    List <Type> seltype(Type type);
    //查询产地
    List <Area> selarea(Area area);
    //查询药品类型
    List <Unit> selunit(Unit unit);
    //经办人
    List <Skull> selskull(Skull skull);
    //供货商
    List <Upplier> selupplier(Upplier upplier);
    int updrugstore(Drugstore drugstore);
    //查询库房
    List <Warehuose> selwarehuose(Warehuose warehuose);
    //数量过少的药品查询
    List<Drugstore> selectlackdrug(Drugstore drugstore);
    int selcountless();
 //添加采购单
 int addcaigou(Caigou caigou);
    int selcaigouname(Caigou caigou);
    //添加采购单时如果已存在此药品 则直接加数量
    int upcaigounumber(Caigou caigou);
 //查询采购表单
 List<Caigou> selcaigou(Caigou caigou);
    //删除采购单
    int delcaigou(Integer caigouid);
    List<Drugstore> seldrugDate(Drugstore drugstore);
    int selcountlessnum();
    //删除过期药品
    int delguoqidurg(Integer rugstoreId);

}

