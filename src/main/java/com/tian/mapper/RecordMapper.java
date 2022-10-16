package com.tian.mapper;

import com.tian.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordMapper {
    //查询所有记录
    List<Record> selrecord(Record record);
    //添加记录
int addjilu(Record record);


}
