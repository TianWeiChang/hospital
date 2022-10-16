package com.tian.mapper;

import com.tian.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    //查询库房药品
  List<Drugstore> selStore(Drugstore drugstore);
  //查询药品类型
    List <Type> seltype(Type type);
    //查询药品类型
    List <Area> selarea(Area area);
    //查询药品类型
    List <Unit> selunit(Unit unit);
    //经办人
    List <Skull> selskull(Skull skull);
    //供货商
    List <Upplier> selupplier(Upplier upplier);
    //修改药品信息
    int updrugstore(Drugstore drugstore);
    //仓库
    List <Warehuose> selwarehuose(Warehuose warehuose);
     //数量过少的药品查询
    List<Drugstore> selectlackdrug(Drugstore drugstore);
    //库存不足的药品有多少条
    int selcountless();
  //添加采购单
  int addcaigou(Caigou caigou);
  //添加采购单时判断采购单是否已经有同名药品
  int selcaigouname(Caigou caigou);
  //添加采购单时如果已存在此药品 则直接加数量
  int upcaigounumber(Caigou caigou);

  //查询采购表单
  List<Caigou> selcaigou(Caigou caigou);
  //删除采购单
  int delcaigou(Integer caigouid);
    //查询过期的药品
    List<Drugstore> seldrugDate(Drugstore drugstore);
    //查询过期的药品有几条
    int selcountlessnum();
    //删除过期药品
    int delguoqidurg(Integer rugstoreId);

}
