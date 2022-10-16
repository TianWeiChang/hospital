package com.tian.controller;


import com.tian.entity.CCashier;
import com.tian.entity.CPharmacy;
import com.tian.entity.Coutpatienttype;
import com.tian.entity.ReportVo;
import com.tian.service.COutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tianwc  公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description 费用相关
 * @createTime 2022年09月16日
 */
@Controller
@RequestMapping("caoout")
public class COutController {
    @Autowired
    private COutService cOutService;
    //进入处方划价页面
    @RequestMapping("xiang")
    public Object xiang(Model model){
        return  "cao/Cxiangmu";
    }
    //进入收费页面
    @RequestMapping("out")
    public Object look(Model model){
        return  "cao/Ctoll";
    }
    //查询药品所有信息
    @RequestMapping("selout")
    @ResponseBody
    public Object seldrug(Coutpatienttype coutpatienttype, Integer page, Integer limit,String projectName){
        coutpatienttype.setProjectName(projectName);
        PageHelper.startPage(page, limit);
        List<CPharmacy> selout = cOutService.selout(coutpatienttype);
        PageInfo pageInfo = new PageInfo(selout);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询处方中是否有这个药
    @RequestMapping("selchuo")
    @ResponseBody
    public Object seslchuo(CCashier cCashier,Integer reid, String mename){
        cCashier.setReportId(reid);//把用户id存入数据库
        cCashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = cOutService.selchuo(cCashier);
        return selcadr;
    }
    //添加处方药品
    @RequestMapping("addchuo")
    @ResponseBody
    public Object addchuo(CCashier cCashier,Integer ostate){
        System.out.println(123);
        System.out.println(ostate);
        cCashier.setOstate(ostate);
        System.out.println(cCashier.getOstate());
        //向处方添加药品
        Integer addchuo = cOutService.addchuo(cCashier);
        return addchuo;
    }
    //如果处方中有该药品则修改该药品的数量和价钱
    @RequestMapping("updchuo")
    @ResponseBody
    public Object updchuo(CCashier cCashier,CPharmacy cPharmacy){
        //修改处方中药品的数量
        Integer updchuo = cOutService.updchuo(cCashier);
        String pharmacyName=cCashier.getDurgname();
        cPharmacy.setPharmacyName(pharmacyName);
        return updchuo;
    }
    //删除处方中的药品
    @RequestMapping("delo")
    @ResponseBody
    public Object del(CCashier cCashier){
        Integer del = cOutService.delo(cCashier);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    //查询处方的总价钱
    @RequestMapping("selch")
    @ResponseBody
    public Object selch(CCashier cCashier){
        Double selch = cOutService.selch(cCashier);
        return selch;
    }
    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(ReportVo reportVo){
        Integer shoufei = cOutService.shoufei(reportVo);
        //把挂号费添加到收费表上
        Integer guafei = cOutService.guafei(reportVo);
        return  shoufei;
    }
}
