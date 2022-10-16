package com.tian.service.Impl;

import com.tian.entity.*;
import com.tian.mapper.CreportMapper;
import com.tian.service.CreportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CreportServiceImpl implements CreportService {

    @Resource
    private CreportMapper creportMapper;
    //查询挂号的所有信息
    @Override
    public List<ReportVo> sel(ReportVo reportVo) {
        return creportMapper.sel(reportVo);
    }
    //查询某个患者的详细信息
    @Override
    public List<ReportVo> selById(Integer reportId) {
        return creportMapper.selById(reportId);
    }
    //查询科室
    @Override
    public List<CDepartments> seldep() {
        return creportMapper.seldep();
    }
    //查询挂号类型
    @Override
    public List<CRegisteredtype> selreg() {
        return creportMapper.selreg();
    }
    //查询排班医生
    @Override
    public List<ReportVo> one(CDoctor cDoctor) {
        return creportMapper.one(cDoctor);
    }

    @Override
    public List<ReportVo> two(CDoctor cDoctor) {
        return creportMapper.two(cDoctor);
    }

    @Override
    public List<ReportVo> three(CDoctor cDoctor) {
        return creportMapper.three(cDoctor);
    }

    @Override
    public List<ReportVo> four(CDoctor cDoctor) {
        return creportMapper.four(cDoctor);
    }

    @Override
    public List<ReportVo> five(CDoctor cDoctor) {
        return creportMapper.five(cDoctor);
    }

    @Override
    public List<ReportVo> six(CDoctor cDoctor) {
        return creportMapper.six(cDoctor);
    }

    @Override
    public List<ReportVo> seven(CDoctor cDoctor) {
        return creportMapper.seven(cDoctor);
    }


    @Override
    public Integer seltymo(CRegisteredtype cRegisteredtype) {
        return creportMapper.seltymo(cRegisteredtype);
    }
    //添加患者
    @Override
    public Integer addre(CReport cReport) {
        return creportMapper.addre(cReport);
    }
    //删除患者
    @Override
    public Integer delre(Integer id) {
        return creportMapper.delre(id);
    }
    //判断正在就诊的患者电话唯一
    @Override
    public Integer phone(CReport cReport) {
        return creportMapper.phone(cReport);
    }
    //判断正在就诊的患者身份证号唯一
    @Override
    public Integer carid(CReport cReport) {
        return creportMapper.carid(cReport);
    }

    @Override
    public int upddang() {
        return creportMapper.upddang();
    }
    //从门诊转入住院
    @Override
    public Integer zhuanyuan(CReport cReport) {
        return creportMapper.zhuanyuan(cReport);
    }
}
