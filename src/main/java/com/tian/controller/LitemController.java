package com.tian.controller;

import com.tian.entity.Litem;
import com.tian.entity.Lrecord;
import com.tian.service.LdrugService;
import com.tian.service.LitemService;
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
@RequestMapping("/liao")
public class LitemController {

    @Autowired
    private LitemService litemService;
    @Autowired
    private LdrugService ldrugService;

    @RequestMapping("/item")
    public String item(){
        return  "liao/item";
    }

    //查询收费项目
    @RequestMapping("/selItems")
    @ResponseBody
    public Object selItems(Integer page, Integer limit, Litem litem){
        PageHelper.startPage(page, limit);
        List<Litem> listAll =litemService.selItems(litem);
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

    //添加收费项目
    @RequestMapping("/addItem")
    @ResponseBody
    public Object updItem(Lrecord lrecord){
        lrecord.setDurgnum(1);
        lrecord.setState(1);
        lrecord.setRepicetotal(lrecord.getRepiceprice()*lrecord.getDurgnum());
        Integer integer = ldrugService.addDrug(lrecord);
        if(integer==1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    //查询患者收费项目
    @RequestMapping("/selItem")
    @ResponseBody
    public Object selItem(Integer page, Integer limit, Lrecord lrecord){
        lrecord.setState(1);
        PageHelper.startPage(page, limit);
        List<Lrecord> listAll =ldrugService.selDrugs(lrecord);
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

    //移除患者收费项目
    @RequestMapping("/delItem")
    @ResponseBody
    public Object delItem(Integer hospitalpriceid){
        Lrecord lrecord=new Lrecord();
        lrecord.setHospitalpriceid(hospitalpriceid);
        int i = ldrugService.delDrug(lrecord);
        if (i == 1) {
            return "移除成功";
        } else {
            return "移除失败";
        }
    }
}