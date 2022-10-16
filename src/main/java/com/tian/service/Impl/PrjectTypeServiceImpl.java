package com.tian.service.Impl;

import com.tian.entity.*;
import com.tian.mapper.PrjectTypeMapper;
import com.tian.service.PrjectTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class PrjectTypeServiceImpl implements PrjectTypeService {

    @Resource
    private PrjectTypeMapper prjectTypeMapper;
    /*
     * 项目大类增删改查
     * */
    @Override
    public List<Projecttype> findAllProjecttype(Projecttype projecttype) {
        return prjectTypeMapper.findAllProjecttype(projecttype);
    }

    @Override
    public int addProjecttype(Projecttype projecttype) {
        return prjectTypeMapper.addProjecttype(projecttype);
    }



    @Override
    public int deleteProjecttype(Integer projectId) {
        return prjectTypeMapper.deleteProjecttype(projectId);
    }

    @Override
    public int count1(Projecttype projecttype) {
        return prjectTypeMapper.count1(projecttype);
    }

    /*
     * 门诊项目增删改查
     * */
    @Override
    public List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype) {
        return prjectTypeMapper.findAllOutpatienttype(outpatienttype);
    }

    @Override
    public int addOutpatienttype(Outpatienttype outpatienttype) {
        return prjectTypeMapper.addOutpatienttype(outpatienttype);
    }

    @Override
    public int editOutpatienttype(Outpatienttype outpatienttype) {
        return prjectTypeMapper.editOutpatienttype(outpatienttype);
    }

    @Override
    public int deleteOutpatienttype(Integer outpatientId) {
        return prjectTypeMapper.deleteOutpatienttype(outpatientId);
    }

    @Override
    public int count2(Outpatienttype outpatienttype) {
        return prjectTypeMapper.count2(outpatienttype);
    }

    /*
     * 住院项目增删改查
     * */
    @Override
    public List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return prjectTypeMapper.findAllInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int addInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return prjectTypeMapper.addInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int editInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return prjectTypeMapper.editInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int deleteInoutpatienttype(Integer inoutpatientId) {
        return prjectTypeMapper.deleteInoutpatienttype(inoutpatientId);
    }

    @Override
    public int count3(Inoutpatienttype inoutpatienttype) {
        return prjectTypeMapper.count3(inoutpatienttype);
    }


    /*
     * 收费项目增删改查
     * */
    @Override
    public List<Moneytype> findAllMoneytype(Moneytype moneytype) {
        return prjectTypeMapper.findAllMoneytype(moneytype);
    }

    @Override
    public int addMoneytype(Moneytype moneytype) {
        return prjectTypeMapper.addMoneytype(moneytype);
    }

    @Override
    public int editMoneytype(Moneytype moneytype) {
        return prjectTypeMapper.editMoneytype(moneytype);
    }

    @Override
    public int deleteMoneytype(Integer moneyId) {
        return prjectTypeMapper.deleteMoneytype(moneyId);
    }

    @Override
    public int count4(Moneytype moneytype) {
        return prjectTypeMapper.count4(moneytype);
    }

    /*
     * 床位项目增删改查
     * */
    @Override
    public List<Bed> findAllBed(Bed bed) {
        return prjectTypeMapper.findAllBed(bed);
    }

    @Override
    public int addBed(Bed bed) {
        return prjectTypeMapper.addBed(bed);
    }

    @Override
    public int editBed(Bed bed) {
        return prjectTypeMapper.editBed(bed);
    }

    @Override
    public int deleteBed(Integer bedId) {
        return prjectTypeMapper.deleteBed(bedId);
    }

    @Override
    public int count5(Bed bed) {
        return prjectTypeMapper.count5(bed);
    }

    @Override
    public int checkCount(Integer bedId) {
        return prjectTypeMapper.checkCount(bedId);
    }
}
