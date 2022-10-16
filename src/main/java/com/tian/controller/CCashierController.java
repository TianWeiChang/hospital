package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.CCashierService;
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
 * @description 处方相关
 * @createTime 2022年09月16日
 */
@Controller
@RequestMapping("caocc")
public class CCashierController {
    @Autowired
    private CCashierService cCashierService;
    //进入处方页面
    @RequestMapping("cc")
    public Object look(Model model){
        //查询所有药房
        List<CWarehuose> selware = cCashierService.selware();
        model.addAttribute("selware",selware);
        return  "cao/cashier";
    }
    //查询所有患者信息
    @RequestMapping("selpreson")
    @ResponseBody
    public Object selperson(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<ReportVo> sel = cCashierService.sel();
        PageInfo pageInfo = new PageInfo(sel);
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
    //查询药品所有信息
    @RequestMapping("seldrug")
    @ResponseBody
    public Object seldrug(String durgname,Integer page, Integer limit,CPharmacy cPharmacy){
        cPharmacy.setPharmacyName(durgname);
        PageHelper.startPage(page, limit);
        List<CPharmacy> selpharm = cCashierService.selpharm(cPharmacy);
        PageInfo pageInfo = new PageInfo(selpharm);
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
    @RequestMapping("selchu")
    @ResponseBody
    public Object seslchu(CCashier cCashier,Integer reid, String mename){
        cCashier.setReportId(reid);//把用户id存入数据库
        cCashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = cCashierService.selcadr(cCashier);
        return selcadr;
    }
    //添加处方药品
    @RequestMapping("addchu")
    @ResponseBody
    public Object addchu(CCashier cCashier,CPharmacy cPharmacy){
        //向处方添加药品
        Integer addchu = cCashierService.addchu(cCashier);
        String pharmacyName=cCashier.getDurgname();
        cPharmacy.setPharmacyName(pharmacyName);
        //减少药房中的数量
        Integer deldrunum = cCashierService.deldrunum(cPharmacy);
        return addchu;
    }
    //查询该用户的处方
    @RequestMapping("selpepi")
    @ResponseBody
    public Object selpepi(Integer perid,Integer page, Integer limit){
        List<CCashier> selpepi = cCashierService.selpepi(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selpepi);
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
    //删除处方中的药品
    @RequestMapping("del")
    @ResponseBody
    public Object del(CCashier cCashier,String durnme,Integer durnum,CPharmacy cPharmacy){
        Integer del = cCashierService.del(cCashier);
        cPharmacy.setPharmacyName(durnme);
        cPharmacy.setDrugstorenum(durnum);
        cCashierService.adddrunum(cPharmacy);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    //如果处方中有该药品则修改该药品的数量和价钱
    @RequestMapping("updchu")
    @ResponseBody
    public Object updchu(CCashier cCashier,CPharmacy cPharmacy){
        //修改处方中药品的数量
        Integer updchu = cCashierService.updchu(cCashier);
        String pharmacyName=cCashier.getDurgname();
        cPharmacy.setPharmacyName(pharmacyName);
        //修改仓库中药品的数量
        Integer deldrunum = cCashierService.deldrunum(cPharmacy);
        return updchu;
    }
    //模糊查询
    @RequestMapping("mohu")
    @ResponseBody
    public Object mohu(String durgname,ReportVo reportVo, Integer page, Integer limit){
        reportVo.setReportName(durgname);
        PageHelper.startPage(page, limit);
        List<ReportVo> mohu = cCashierService.mohu(reportVo);
        PageInfo pageInfo = new PageInfo(mohu);
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
    //添加用户病因
    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Integer reid, String bing, CReport cReport){
        cReport.setZhuan(bing);
        cReport.setReportId(reid);
        Integer addbing = cCashierService.addbing(cReport);
        return addbing;
    }
    //查询用户有没有填写病因
    @RequestMapping("selbing")
    @ResponseBody
    public Object selbing(Integer reid){
        String selbing = cCashierService.selbing(reid);
        return selbing;
    }
    //查看用户的检查结果
    @RequestMapping("lookbing")
    @ResponseBody
    public Object lookbing(Integer reid){
        String lookbing = cCashierService.lookbing(reid);
        return lookbing;
    }
    //查看该用户是否还有未交钱的项目
    @RequestMapping("seljiao")
    @ResponseBody()
    public Object seljiao(Integer reid){
        int seljiao = cCashierService.seljiao(reid);
        return seljiao;
    }
    //查询该用户所有的处方
    @RequestMapping("selall")
    @ResponseBody
    public Object selall(Integer perid,Integer page, Integer limit){
        List<CCashier> selall = cCashierService.selall(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selall);
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
    //查询用户所有的项目处方
    @RequestMapping("selximu")
    @ResponseBody
    public Object selximu(Integer perid,Integer page, Integer limit){
        List<CCashier> selximu = cCashierService.selximu(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selximu);
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
    //查看该用户是否有缴费未做的项目
    @RequestMapping("selwei")
    @ResponseBody
    public Object selwei(Integer reid){
        //查询该用户有几个做过的项目
        Integer selyi = cCashierService.selyi(reid);
        //查询该用户有几个缴费的项目
        Integer selgong = cCashierService.selgong(reid);
        if(selyi==selgong){
            return 1;
        }else {
            return 0;
        }
    }
}
