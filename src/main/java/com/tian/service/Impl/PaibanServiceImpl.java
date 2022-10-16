package com.tian.service.Impl;

import com.tian.entity.Ban;
import com.tian.entity.Paiban;
import com.tian.mapper.PaibanMapper;
import com.tian.service.PaibanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class PaibanServiceImpl implements PaibanService {
    @Resource
    private PaibanMapper paibanMapper;
    @Override
    public List<Paiban> findAllPaiban(Paiban paiban) {
        return paibanMapper.findAllPaiban(paiban);
    }

    @Override
    public int editPaiban(Paiban paiban) {
        return paibanMapper.editPaiban(paiban);
    }

    @Override
    public List<Ban> findAllBan() {
        return paibanMapper.findAllBan();
    }
    @Override
    public int insertPaiban(Paiban paiban) {
        return paibanMapper.insertPaiban(paiban);
    }

    @Override
    public int count(Integer Id) {
        return paibanMapper.count(Id);
    }
}
