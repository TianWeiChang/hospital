package com.tian.controller;

import com.tian.entity.Unit;
import com.tian.service.UnitService;
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
@RequestMapping("unit")
public class UnitController {
    @Autowired
    private UnitService unitService;
    /*
     * 查询计量单位
     * */
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object UnitList(Unit unit, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Unit> listAll = unitService.findAllUnit(unit);
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
     * 添加计量单位
     * */
    @RequestMapping("addUnit")
    @ResponseBody
    public Object addUnit(Unit unit){
        int count = unitService.count(unit);
        if(count==0){
            int i = unitService.addUnit(unit);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return unit.getUnitName()+"已存在";
        }

    }

    /*
     * 删除计量单位
     * */
    @RequestMapping("deleteUnit")
    @ResponseBody
    public Object deleteUnit(Integer unitId){
        int i = unitService.deleteUnit(unitId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
