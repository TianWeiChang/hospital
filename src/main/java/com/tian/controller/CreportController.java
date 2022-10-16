package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.CreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/cao")
    public class CreportController {
    @Autowired
    private CreportService creportService;
    //查询所有数据
    @RequestMapping("index")
    public Object toreport(ReportVo reportVo, Model model, String params, Integer cc, HttpServletRequest request){
        reportVo.setCc(cc);
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("ban",cc);
        creportService.upddang();
        String reportName=params;
        reportVo.setReportName(reportName);
        List<ReportVo> sel = creportService.sel(reportVo);
        model.addAttribute("report",sel);
        return "cao/report";
    }
    //查询所有的科室
    @RequestMapping("seldep")
    @ResponseBody
    public Object seldep(){
        List<CDepartments> seldep = creportService.seldep();
        return  seldep;
    }
    //查询所有的挂号类型
    @RequestMapping("/selreg")
    @ResponseBody
    public Object selreg(){
        List<CRegisteredtype> selreg = creportService.selreg();
        return selreg;
    }
    //查询医生信息
    @RequestMapping("seldoctor")
    @ResponseBody
    public Object seldoctor(CDoctor cDoctor){
        Calendar calendar = Calendar.getInstance();
        Integer data=calendar.get(Calendar.DAY_OF_WEEK)-1;//获取当前是星期几
        if(data==1){
            List<ReportVo> one = creportService.one(cDoctor);
            return one;
        }else if(data==2){
            List<ReportVo> two = creportService.two(cDoctor);
            return two;
        }else if(data==3){
            List<ReportVo> three = creportService.three(cDoctor);
            return three;
        }else if(data==4){
            List<ReportVo> four = creportService.four(cDoctor);
            return four;
        }else if(data==5){
            System.out.println(data);
            List<ReportVo> five = creportService.five(cDoctor);
            return five;
        }else if(data==6){
            List<ReportVo> six = creportService.six(cDoctor);
            return six;
        }else{
            List<ReportVo> seven = creportService.seven(cDoctor);
            return seven;
        }
    }
    //根据挂号类型查找该类型的价格
    @RequestMapping("seltymo")
    @ResponseBody
    public Object seltymo(CRegisteredtype cRegisteredtype){
        Integer seltymo = creportService.seltymo(cRegisteredtype);
        return seltymo;
    }
    //添加新的挂号
    @RequestMapping("addre")
    @ResponseBody
    public Object addre(CReport cReport){
            int addre = creportService.addre(cReport);
            if(addre==1){
                return "添加成功";
            }else{
                return "添加失败，请联系管理员";
            }

    }
    //根据id删除某个患者信息
    @RequestMapping("delre")
    @ResponseBody
    public Object delre(Integer id){
        int delre = creportService.delre(id);
        if(delre==1){
            return  "删除成功";
        }else{
            return  "删除失败";
        }

    }
    //根据id删除某个患者信息
    @RequestMapping("selById")
    @ResponseBody
    public Object selById(Integer reportId){
        List<ReportVo> reportVos = creportService.selById(reportId);
        return reportVos;
    }
    //判断就诊用户电话身份证号唯一
    @RequestMapping("phone")
    @ResponseBody
    public Object phone(CReport cReport){
        int carid = creportService.carid(cReport);
        int phone = creportService.phone(cReport);
        if(carid>=1){
            return 2;
        }else if(phone>=1){
            return 1;
        }else{
           return 3;
        }
    }
    //转入住院部
    @RequestMapping("zhuanyuan")
    @ResponseBody
    public Object zhuanyuan(Integer id,CReport cReport,String zhuan){
        cReport.setReportId(id);
        cReport.setZhuan(zhuan);
        Integer zhuanyuan = creportService.zhuanyuan(cReport);
        return zhuanyuan;
    }
}
