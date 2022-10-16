package com.tian.service.Impl;

import com.tian.entity.Record;
import com.tian.mapper.RecordMapper;
import com.tian.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper rd;
    @Override
    public List<Record> selrecord(Record record) {
        return rd.selrecord(record);
    }

    @Override
    public int addjilu(Record record) {
        return rd.addjilu(record);
    }
}
