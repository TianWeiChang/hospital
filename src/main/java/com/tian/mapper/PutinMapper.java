package com.tian.mapper;

import com.tian.entity.Drugdictionary;
import com.tian.entity.Drugstore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PutinMapper {
    //查询药品清单
    List<Drugdictionary> seldcy(Drugdictionary drugdictionary);
    //添加入库
    int adddrugstore(Drugstore drugstoreName);
    //查询药库是否已经存在药品名
    int seldrugname(Drugstore drugstore);
    int updrugnumber(Drugstore drugstore);
    //查询药品库存数量
    int selnumber(Drugstore drugstore);
}
