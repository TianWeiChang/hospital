package com.tian.service.Impl;
import com.tian.entity.*;
import com.tian.mapper.StoreMapper;
import com.tian.service.StoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {
    @Resource
    private StoreMapper sm;

    @Override
    //查询库房药品信息
    public List<Drugstore> selStore(Drugstore drugstore) {
        return sm.selStore(drugstore);
    }

    @Override
    public List<Type> seltype(Type type) {
        return sm.seltype(type);
    }

    @Override
    public List<Area> selarea(Area area) {
        return sm.selarea(area);
    }

    @Override
    public List<Unit> selunit(Unit unit) {
        return sm.selunit(unit);
    }

    @Override
    public List<Skull> selskull(Skull skull) {
        return sm.selskull(skull);
    }

    @Override
    public List<Upplier> selupplier(Upplier upplier) {
        return sm.selupplier(upplier);
    }

    @Override
    public int updrugstore(Drugstore drugstore) {
        return sm.updrugstore(drugstore);
    }

    @Override
    public List<Warehuose> selwarehuose(Warehuose warehuose) {
        return sm.selwarehuose(warehuose);
    }


    @Override
    public List<Drugstore> selectlackdrug(Drugstore drugstore) {
        return sm.selectlackdrug(drugstore);
    }

    @Override
    public int selcountless() {
        return sm.selcountless();
    }

    @Override
    public int addcaigou(Caigou caigou) {
        return sm.addcaigou(caigou);
    }

    @Override
    public int selcaigouname(Caigou caigou) {
        return sm.selcaigouname(caigou);
    }

    @Override
    public int upcaigounumber(Caigou caigou) {
        return sm.upcaigounumber(caigou);
    }

    @Override
    public List<Caigou> selcaigou(Caigou caigou) {
        return sm.selcaigou(caigou);
    }

    @Override
    public int delcaigou(Integer caigouid) {
        return sm.delcaigou(caigouid);
    }

    @Override
    public List<Drugstore> seldrugDate(Drugstore drugstore) {
        return sm.seldrugDate(drugstore);
    }

    @Override
    public int selcountlessnum() {
        return sm.selcountlessnum();
    }

    @Override
    public int delguoqidurg(Integer rugstoreId) {
        return sm.delguoqidurg(rugstoreId);
    }


}
