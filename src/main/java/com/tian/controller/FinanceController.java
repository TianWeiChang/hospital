package com.tian.controller;

import com.tian.entity.Finance;
import com.tian.entity.SdoctorDuibi;
import com.tian.entity.currentFinance;
import com.tian.service.FinanceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("finance")
public class FinanceController {
    @Autowired
    private FinanceService financeService;
    /*门诊月收入对比*/
    @ResponseBody
    @RequestMapping("reportYearFinance")
    public Object reportYearFinance(String year){
        List<Double> doubles = financeService.reportYearFinance(year);
        for (int i = 0; i < doubles.size(); i++) {
            if(null==doubles.get(i)) {
                doubles.set(i, 0.0);
            }
        }
        return doubles;
    }
    /*住院月收入对比*/
    @ResponseBody
    @RequestMapping("zhuYuanYearFinance")
    public Object zhuYuanYearFinance(String year){
        List<Double> zhuYuan = financeService.zhuYuanYearFinance(year);
        for (int i = 0; i < zhuYuan.size(); i++) {
            if(null==zhuYuan.get(i)) {
                zhuYuan.set(i, 0.0);
            }
        }
        return zhuYuan;
    }
    /*门诊年收入对比*/
    @ResponseBody
    @RequestMapping("reportYearBingFinance")
    public Object reportYearBingFinance(){
        List<Finance> bingReport = financeService.reportYearBingFinance();
        return bingReport;
    }
    /*住院年收入对比*/
    @ResponseBody
    @RequestMapping("zhuYuanYearBingFinance")
    public Object zhuYuanYearBingFinance(){
        List<Finance> bingZhuYuan = financeService.zhuYuanYearBingFinance();
        return bingZhuYuan;
    }
    /*门诊医生收入统计对比*/
    @ResponseBody
    @RequestMapping("doctorDuibi")
    public Object doctorDuibi( SdoctorDuibi sdoctorDuibi,Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<SdoctorDuibi> sdoctorDuibis = financeService.doctorDuibi(sdoctorDuibi);
        PageInfo pageInfo = new PageInfo(sdoctorDuibis);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    /*住院医生收入统计对比*/
    @ResponseBody
    @RequestMapping("zDoctorDuibi")
    public Object zDoctorDuibi(SdoctorDuibi sdoctorDuibi, Integer page, Integer limit){

        PageHelper.startPage(page, limit);
        List<SdoctorDuibi> zDoctorDuibis = financeService.zDoctorDuibi(sdoctorDuibi);
        PageInfo pageInfo = new PageInfo(zDoctorDuibis);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    /*门诊当天收入*/
    @ResponseBody
    @RequestMapping("currentFinance")
    public Object currentFinance(String current){
        List<currentFinance> currentFinances = financeService.currentFinance(current);
        return currentFinances;
    }
}
