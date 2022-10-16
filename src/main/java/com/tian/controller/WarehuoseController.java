package com.tian.controller;

import com.tian.entity.Warehuose;
import com.tian.service.WarehuoseService;
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
@RequestMapping("warehouse")
public class WarehuoseController {
    @Autowired
    private WarehuoseService warehuoseService;
    /*
     * 查询仓库
     * */
    @RequestMapping("findAllWarehuose")
    @ResponseBody
    public Object WarehuoseList(Warehuose warehuose, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Warehuose> listAll = warehuoseService.findAllWarehuose(warehuose);
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
     * 添加仓库
     * */
    @RequestMapping("addWarehuose")
    @ResponseBody
    public Object addWarehuose(Warehuose warehuose){
        int count = warehuoseService.count(warehuose);
        if(count==0){
            int i = warehuoseService.addWarehuose(warehuose);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return warehuose.getSupplierName()+"已存在";
        }

    }

    /*
     * 删除仓库
     * */
    @RequestMapping("deleteWarehuose")
    @ResponseBody
    public Object deleteWarehuose(Integer warehouseId){
        int i = warehuoseService.deleteWarehuose(warehouseId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
