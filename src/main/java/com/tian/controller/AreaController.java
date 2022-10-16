package com.tian.controller;

import com.tian.entity.Area;
import com.tian.service.AreaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tianwc  公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description 地址信息
 * @createTime 2022年09月16日
 */
@Controller
@RequestMapping("area")
public class AreaController {
    @Autowired
    private AreaService areaService;
    /*
     * 查询生产地址
     * */
    @RequestMapping("findAllArea")
    @ResponseBody
    public Object AreaList(Area Area, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Area> listAll = areaService.findAllArea(Area);
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
     * 添加生产地址
     * */
    @RequestMapping("addArea")
    @ResponseBody
    public Object addArea(Area Area){
        int count = areaService.count(Area);
        if(count==0){
            int i = areaService.addArea(Area);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return Area.getAreaName()+"已存在";
        }

    }

    /*
     * 删除生产地址
     * */
    @RequestMapping("deleteArea")
    @ResponseBody
    public Object deleteArea(Integer areaId){
        int i = areaService.deleteArea(areaId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
