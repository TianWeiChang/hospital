package com.tian.service;

import com.tian.entity.*;

import java.util.List;

public interface CCashierService {
    //查询挂号的所有信息用于页面表格展示
    List<ReportVo> sel();
    //查询所有药房
    List<CWarehuose> selware();
    //根据药房查询所有药品信息在药品详情框中展示
    List<CPharmacy> selpharm(CPharmacy cPharmacy);
    //查询这个用户的处方表上有没有这个药
    Integer selcadr(CCashier cCashier);
    //添加处方药品
    Integer addchu(CCashier cCashier);
    //如果有该药品则改变该药品的数量
    Integer updchu(CCashier cCashier);
    //查询该用户的处方
    List<CCashier> selpepi(Integer perid);
    //删除处方中的药品
    Integer del(CCashier cCashier);
    //减少药房中的数量
    Integer deldrunum(CPharmacy cPharmacy);
    //添加药品数量
    Integer adddrunum(CPharmacy cPharmacy);
    //模糊查询
    List<ReportVo> mohu(ReportVo reportVo);
    //修改用户的病例
    Integer addbing(CReport cReport);
    //查询用户有没有病例
    String selbing(Integer rid);
    //查询用户做项目的结果
    String lookbing(Integer reid);
    //查询该用户是否还有未交钱的项目
    int seljiao(Integer reid);
    //查看该用户有几个已经做过的项目
    Integer selyi(Integer reid);
    //查询该用户有几个已经交过钱的项目
    Integer selgong(Integer reid);
    //查询用户所有的处方
    List<CCashier> selall(Integer perid);
    //查询用户项目的处方
    List<CCashier> selximu(Integer perid);
}
