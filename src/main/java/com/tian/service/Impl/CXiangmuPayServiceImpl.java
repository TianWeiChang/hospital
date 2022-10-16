package com.tian.service.Impl;

import com.tian.entity.CCashier;
import com.tian.mapper.CXiangmuPayMapper;
import com.tian.service.CXiangmuPayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CXiangmuPayServiceImpl implements CXiangmuPayService {
    @Resource
    private CXiangmuPayMapper cXiangmuPayMapper;
    //查询用户所有的项目然后
    @Override
    public List<CCashier> selxiang(Integer perid) {
        return cXiangmuPayMapper.selxiang(perid);
    }
    //查询该用户有没有收费项目
    @Override
    public Integer selshoux(Integer perid) {
        return cXiangmuPayMapper.selshoux(perid);
    }
    //项目收费修改项目的收费状态
    @Override
    public Integer updxiang(Integer perid) {
        return cXiangmuPayMapper.updxiang(perid);
    }
    //项目检查页面查询用户所有要检查的项目
    @Override
    public List<CCashier> selcha(Integer perid) {
        return cXiangmuPayMapper.selcha(perid);
    }
    //添加项目的检查结果
    @Override
    public Integer addjie(CCashier cCashier) {
        return cXiangmuPayMapper.addjie(cCashier);
    }
}
