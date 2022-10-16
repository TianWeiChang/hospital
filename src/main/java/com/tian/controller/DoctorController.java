package com.tian.controller;

import com.tian.entity.Departments;
import com.tian.entity.Doctor;
import com.tian.entity.Paiban;
import com.tian.entity.Registeredtype;
import com.tian.service.DoctorService;
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
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    /*
     * 查询医生
     * */
    @RequestMapping("doctorList")
    @ResponseBody
    public Object doctorList(Doctor doctor, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Doctor> listAll = doctorService.doctorList(doctor);
        PageInfo pageInfo = new PageInfo(listAll);
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
    /*
     * 添加医生
     * */
    @RequestMapping("addDoctor")
    @ResponseBody
    public Object addDoctor(Doctor doctor, Paiban paiban){
        int count = doctorService.count(doctor);
        if(count==0){
            int i = doctorService.addDoctor(doctor);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return doctor.getDoctorName()+"已存在";
        }
    }
    /*
     * 修改医生
     * */
    @RequestMapping("editDoctor")
    @ResponseBody
    public Object editDoctor(Doctor doctor){
        int i = doctorService.editDoctor(doctor);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除医生
     * */
    @RequestMapping("deleteDoctor")
    @ResponseBody
    public Object deleteDoctor(Integer doctorId){
        int i1 = doctorService.checkCount(doctorId);
        if(i1>0){
           return "该医生还有病人";
        }else{
            int i = doctorService.deleteDoctor(doctorId);
            if(i==1){
                return "删除成功";
            }else{
                return "删除失败";
            }
        }

    }
    /*
     * 查询科室
     * */
    @RequestMapping("findAllDepartments")
    @ResponseBody
    public Object findAllDepartments(){
        List<Departments> allDepartments = doctorService.findAllDepartments();
        return allDepartments;
    }
    /*
     * 查询类型
     * */
    @RequestMapping("findAllRegisteredtype")
    @ResponseBody
    public Object findAllRegisteredtype(){
        List<Registeredtype> allRegisteredtype = doctorService.findAllRegisteredtype();
        return allRegisteredtype;
    }

}
