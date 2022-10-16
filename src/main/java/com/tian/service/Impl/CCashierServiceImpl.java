package com.tian.service.Impl;

import com.tian.entity.*;
import com.tian.mapper.CCashierMapper;
import com.tian.service.CCashierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CCashierServiceImpl implements CCashierService {
    @Resource
    private CCashierMapper cCashierMapper;
    //查询患者的所有信息用于也面表格展示
    @Override
    public List<ReportVo> sel() {
        return cCashierMapper.sel();
    }
    //查询所有药房放在药品下拉框中
    @Override
    public List<CWarehuose> selware() {
        return cCashierMapper.selware();
    }
    //根据药房id查询所有的药品信息
    @Override
    public List<CPharmacy> selpharm(CPharmacy cPharmacy) {
        return cCashierMapper.selpharm(cPharmacy);
    }
    //查询这个用户的处方表上有没有这个药
    @Override
    public Integer selcadr(CCashier cCashier) {
        return cCashierMapper.selcadr(cCashier);
    }
    //添加处方药品
    @Override
    public Integer addchu(CCashier cCashier) {
        return cCashierMapper.addchu(cCashier);
    }
    //如果处方中含有该药品则修改数量和价钱
    @Override
    public Integer updchu(CCashier cCashier) {
        return cCashierMapper.updchu(cCashier);
    }

    //根据用户查询这个人的处方
    @Override
    public List<CCashier> selpepi(Integer perid) {
        return cCashierMapper.selpepi(perid);
    }
    //删除处方中的药品
    @Override
    public Integer del(CCashier cCashier) {
        return cCashierMapper.del(cCashier);
    }
    //减少药品中的数量
    @Override
    public Integer deldrunum(CPharmacy cPharmacy) {
        return  cCashierMapper.deldrunum(cPharmacy);
    }
    //添加仓库中的数量
    @Override
    public Integer adddrunum(CPharmacy cPharmacy) {
        return cCashierMapper.adddrunum(cPharmacy);
    }
    //模糊查询
    @Override
    public List<ReportVo> mohu(ReportVo reportVo) {
        return cCashierMapper.mohu(reportVo);
    }
    //修改用户的病例
    @Override
    public Integer addbing(CReport cReport) {
        return cCashierMapper.addbing(cReport);
    }
    //查询用户有没有病例
    @Override
    public String selbing(Integer rid) {
        return cCashierMapper.selbing(rid);
    }
    //查询用户做项目的结果
    @Override
    public String lookbing(Integer reid) {
        return cCashierMapper.lookbing(reid);
    }
    //查询该用户是否还有未交钱的项目
    @Override
    public int seljiao(Integer reid) {
        return cCashierMapper.seljiao(reid);
    }
    //查看该用户有几个已经做过的项目
    @Override
    public Integer selyi(Integer reid) {
        return cCashierMapper.selyi(reid);
    };
    //查询该用户有几个已经交过钱的项目
    @Override
    public Integer selgong(Integer reid) {
        return cCashierMapper.selgong(reid);
    }
    //查询用户所有的处方
    @Override
    public List<CCashier> selall(Integer perid) {
        return cCashierMapper.selall(perid);
    }
    //查询用户项目的处方
    @Override
    public List<CCashier> selximu(Integer perid) {
        return cCashierMapper.selximu(perid);
    }
}
