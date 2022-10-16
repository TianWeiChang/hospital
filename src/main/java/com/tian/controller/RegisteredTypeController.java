package com.tian.controller;

import com.tian.entity.Registeredtype;
import com.tian.service.RegisteredTypeService;
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
@RequestMapping("registeredType")
public class RegisteredTypeController {
    @Autowired
    private RegisteredTypeService registeredTypeService;
    /*
     * 查询
     * */
    @RequestMapping("registeredTypeList")
    @ResponseBody
    public Object registeredTypeList(Registeredtype registeredtype, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Registeredtype> listAll = registeredTypeService.registeredTypeList(registeredtype);
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
     * 添加类型
     * */
    @RequestMapping("addRegisteredType")
    @ResponseBody
    public Object addRegisteredType(Registeredtype registeredtype){
        int count = registeredTypeService.count(registeredtype);
        if(count==0){
            int i = registeredTypeService.addRegisteredType(registeredtype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return registeredtype.getType()+"已存在";
        }

    }
    /*
     * 修改类型
     * */
    @RequestMapping("editRegisteredType")
    @ResponseBody
    public Object editRegisteredType(Registeredtype registeredtype){
        int i = registeredTypeService.editRegisteredType(registeredtype);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
    * 删除类型
    * */
    @RequestMapping("deleteType")
    @ResponseBody
    public Object deleteType(Integer registeredId){
        int i = registeredTypeService.deleteType(registeredId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
