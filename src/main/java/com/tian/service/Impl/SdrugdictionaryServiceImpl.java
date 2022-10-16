package com.tian.service.Impl;

import com.tian.entity.Area;
import com.tian.entity.Sdrugdictionary;
import com.tian.entity.Type;
import com.tian.entity.Unit;
import com.tian.mapper.SdrugdictionaryMapper;
import com.tian.service.SdrugdictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class SdrugdictionaryServiceImpl implements SdrugdictionaryService {
    @Resource
    private SdrugdictionaryMapper sdrugdictionaryMapper;
    @Override
    public List<SdrugdictionaryMapper> findAllSdrugdictionary(Sdrugdictionary sdrugdictionary) {
        return sdrugdictionaryMapper.findAllSdrugdictionary(sdrugdictionary);
    }

    @Override
    public int addSdrugdictionary(Sdrugdictionary sdrugdictionary) {
        return sdrugdictionaryMapper.addSdrugdictionary(sdrugdictionary);
    }

    @Override
    public int editSdrugdictionary(Sdrugdictionary sdrugdictionary) {
        return sdrugdictionaryMapper.editSdrugdictionary(sdrugdictionary);
    }

    @Override
    public int deleteSdrugdictionary(Integer drugId) {
        return sdrugdictionaryMapper.deleteSdrugdictionary(drugId);
    }

    @Override
    public List<Unit> findAllUnit() {
        return sdrugdictionaryMapper.findAllUnit();
    }

    @Override
    public List<Area> findAllArea() {
        return sdrugdictionaryMapper.findAllArea();
    }

    @Override
    public List<Type> findAllType() {
        return sdrugdictionaryMapper.findAllType();
    }

    @Override
    public int count(Sdrugdictionary sdrugdictionary) {
        return sdrugdictionaryMapper.count(sdrugdictionary);
    }
}
