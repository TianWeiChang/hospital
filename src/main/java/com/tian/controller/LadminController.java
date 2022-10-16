package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.LadminService;
import com.tian.service.LleaveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("liao")
public class LadminController {

    @Autowired
    private LadminService ladminService;
    @Autowired
    private LleaveService lleaveService;

    //跳转入院登记页面
    @RequestMapping("/admin")
    public String admin(){
        return "liao/admin";
    }

    //查询患者信息
    @RequestMapping("/selRegister")
    @ResponseBody
    public Object selRegister(Integer page, Integer limit,Register register){
        //分页查询
        PageHelper.startPage(page, limit);
        //查询未出院的患者信息
        List<Register> selreg=ladminService.selRegister(register);
        //把查到的信息放入分页插件中
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }

    //页面请求查询科室信息
    @RequestMapping("/selDepartment")
    @ResponseBody
    public Object selDepartment(){
        //new一个实体类
        Departments departments=new Departments();
        //查询所有科室
        List<Departments> Departments= ladminService.selDepartment(departments);
        //把查到的科室返回前台下拉框中
        return Departments;
    }

    //页面请求查询医生信息
    @RequestMapping("/selDoctor")
    @ResponseBody
    public Object selDoctor(Integer departmentId){
        //new一个实体类
        Doctor doctor=new Doctor();
        //把获取过来的科室编号放入实体类中
        doctor.setDepartmentId(departmentId);
        //根据科室查询旗下所有医生
        List<Doctor> doctors = ladminService.selDoctor(doctor);
        //把查到的医生返回前台下拉框中
        return doctors;
    }

    //查询床位
    @RequestMapping("/selBed")
    @ResponseBody
    public Object selBed(Integer departmentId){
        Bed bed= new Bed();
        bed.setDepartmentId(departmentId);
        //查询没有人入住的床位
        bed.setState(0);
        List<Bed> beds = ladminService.selBed(bed);
        return beds;
    }

    //添加患者
    @RequestMapping("/addRegister")
    @ResponseBody
    public Object addRegister(Register register,HttpServletRequest request){
        Register register1=new Register();
        register1.setIdcard(register.getIdcard());
        //把患者的身份证号查询一下看看是否已经办理入住
        List<Register> registers = ladminService.selRegister(register1);
        if(registers.size()==0){
            //如果是门诊转过来的用户删除门诊患者信息
            if(register.getReportid()!=0){
                ladminService.updZ(register);
            }
            //获取管理人员姓名
            String yonghu = (String)request.getSession().getAttribute("yonghu");
            register.setOperator(yonghu);
            //添加患者信息
            int i = ladminService.addRegister(register);
            if(i==1){
                //修改床位状态
                int j = ladminService.updBed(register);
                if(j==1){
                    return "添加成功";
                }else{
                    return "添加失败";
                }
            }else{
                return "添加失败";
            }
        }else{
            return "该患者已存在，请不要重复添加！";
        }
    }


    //查询折扣
    @RequestMapping("/selDis")
    @ResponseBody
    public Object selDis(){
        List<Moneytype> moneytypes = ladminService.selDis();
        return moneytypes;
    }

    //查询门诊过来的患者
    @RequestMapping("/selDoor")
    @ResponseBody
    public Object selDoor(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Register> selDoor=ladminService.selDoor();
        PageInfo pageInfo = new PageInfo(selDoor);
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

    //转科室
    @RequestMapping("/updKe")
    @ResponseBody
    public Object updKe(Register register){
        //把用户要住的床改成已住
        ladminService.updBed(register);
        //把用户的曾经床位改成空床
        lleaveService.updBstate(register);
        //把用户的信息进行更改
        int i = ladminService.updKe(register);
        if(i==1){
            return "变更成功";
        }else{
            return "变更失败";
        }
    }

}
