package com.tian.service.Impl;

import com.tian.entity.ReportVo;
import com.tian.mapper.CTakeMapper;
import com.tian.service.CTakeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class CTakeServiceImpl implements CTakeService {
    @Resource
    private CTakeMapper cTakeMapper;
    //查看交过费没取药的患者
    @Override
    public List<ReportVo> sel() {
        return cTakeMapper.sel();
    }
    //修改用户状态
    @Override
    public Integer chuku(ReportVo reportVo) {
        return cTakeMapper.chuku(reportVo);
    }
    //查看交过费取过要的患者
    @Override
    public List<ReportVo> selhuan(ReportVo reportVo) {
        return cTakeMapper.selhuan(reportVo);
    }
    //查询该用户的总价钱
    @Override
    public int zong(Integer reid) {
        return cTakeMapper.zong(reid);
    }
}
