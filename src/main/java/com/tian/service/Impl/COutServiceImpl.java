package com.tian.service.Impl;

import com.tian.entity.CCashier;
import com.tian.entity.CPharmacy;
import com.tian.entity.Coutpatienttype;
import com.tian.entity.ReportVo;
import com.tian.mapper.COutMapper;
import com.tian.service.COutService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class COutServiceImpl implements COutService {
    @Resource
    private COutMapper cOutMapper;
    //查询门诊收费项目
    @Override
    public List<CPharmacy> selout(Coutpatienttype coutpatienttype) {
        return cOutMapper.selout(coutpatienttype);
    }
    //查询该用户的处方中是否有该项目
    @Override
    public Integer selchuo(CCashier cCashier) {
        return cOutMapper.selchuo(cCashier);
    }
    //给该项目添加到处方表
    @Override
    public Integer addchuo(CCashier cCashier) {
        return cOutMapper.addchuo(cCashier);
    }
    //修改该项目的数量
    @Override
    public Integer updchuo(CCashier cCashier) {
        return cOutMapper.updchuo(cCashier);
    }
    //删除处方中的项目
    @Override
    public Integer delo(CCashier cCashier) {
        return cOutMapper.delo(cCashier);
    }
    //查询该用户的处方价格
    @Override
    public Double selch(CCashier cCashier) {
        return cOutMapper.selch(cCashier);
    }

    @Override
    public Integer shoufei(ReportVo reportVo) {
        return cOutMapper.shoufei(reportVo);
    }

    @Override
    public Integer guafei(ReportVo reportVo) {
        return cOutMapper.guafei(reportVo);
    }
}
