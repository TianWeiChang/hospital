package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.PutinService;
import com.tian.service.RecordService;
import com.tian.service.StoreService;
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

@Controller
@RequestMapping("seldrugstore")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private PutinService putinService;
    @Autowired
    private RecordService rs;
//查询药品仓库
    @RequestMapping("selectdrugstore")
    @ResponseBody
    public Object seldrugstore(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.selStore(drugstore);
        PageInfo pageInfo = new PageInfo(drugstores);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }
    //查询药品类型
    @RequestMapping("seltype")
    @ResponseBody
    public Object seltype(Type type) {
        List<Type> seltype = storeService.seltype(type);
        return seltype;
    }
    //查询计量单位
    @RequestMapping("selunit")
    @ResponseBody
    public Object selunit(Unit unit) {
        List<Unit> selunit = storeService.selunit(unit);
        return selunit;
    }
    //查询产地
    @RequestMapping("selarea")
    @ResponseBody
    public Object selarea(Area area) {
        List<Area> selarea = storeService.selarea(area);
        return selarea;
    }
    //查询经办人
    @RequestMapping("selskull")
    @ResponseBody
    public Object selskull(Skull skull) {

        List<Skull> selskull = storeService.selskull(skull);

        return selskull;
    }
//查询供货商
    @RequestMapping("selupplier")
    @ResponseBody
    public Object selupplier(Upplier upplier, Model model) {
        List<Upplier> selupplier = storeService.selupplier(upplier);
        return selupplier;
    }

    //修改库房药品基本信息
    @RequestMapping("updrug")
    @ResponseBody
    public Object updrugstore(Drugstore drugstore) {
        int add = storeService.updrugstore(drugstore);
        if (add == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
//供货商
    @RequestMapping("bpisselupplier")
    public Object bpisselupplier(Upplier upplier, Model model) {

        List<Upplier> selupplier = storeService.selupplier(upplier);
        return "drugstore/c_beputinstorage";
    }
//查询药品清单
    @RequestMapping("selectdgty")
    @ResponseBody
    public Object selectdgty(Drugdictionary drugdictionary, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugdictionary> drugdictiona = putinService.seldcy(drugdictionary);
        PageInfo pageInfo = new PageInfo(drugdictiona);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());

        return drugstoresData;
    }


//添加一条药品入库
    @RequestMapping("adddrugs")
    @ResponseBody
    public Integer adddrugs(Drugstore drugstore,Record record) {
        System.out.print("查询方法");
        Integer updrugnumber=0;
        Integer adddrugstore=0;
        int seldrugname = putinService.seldrugname(drugstore);
        System.out.println(seldrugname+"yyyyyyyyyyyyyyyyyyyyyyyy");
        if(seldrugname==1){
            System.out.print("进入修改方法");
            updrugnumber = putinService.updrugnumber(drugstore);
            System.out.print("添加记录表0");
            int addjilu = rs.addjilu(record);//添加一条记录

        }
        if (seldrugname!=1){
            System.out.print("进入添加方法");
            adddrugstore = putinService.adddrugstore(drugstore);
            System.out.print("添加记录表1");
            int addjilu = rs.addjilu(record);//添加一条记录

        }
        return adddrugstore+updrugnumber;
    }
    //查询选中的药品的库存数量
    @RequestMapping("selnumber")
    @ResponseBody
    public int selnumber(Drugstore drugstore) {
        System.out.print("查询数量方法");
      int selnumber = putinService.selnumber(drugstore);
        System.out.println(selnumber);
       return selnumber;
    }
    //查询仓库里药品数量不足的药品
    @RequestMapping("selectlackdrug")
    @ResponseBody
    public Object selectlackdrug(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.selectlackdrug(drugstore);//查询药品数量不足的药
        PageInfo pageInfo = new PageInfo(drugstores);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }
    //查询采购单
    @RequestMapping("selcaigou")
    @ResponseBody
    public Object selcaigou(Caigou caigou, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Caigou> caigous = storeService.selcaigou(caigou);//查询遍历采购表
        PageInfo pageInfo = new PageInfo(caigous);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }

    //添加一条药品采购单
    @RequestMapping("addcaigou")
    @ResponseBody
    public Integer addcaigou(Caigou caigou) {
        int selcaigouname = storeService.selcaigouname(caigou);//查询采购单是是否已经存在此条数据
        if(selcaigouname==0){
            int seldrugname =storeService.addcaigou(caigou);//添加
            return seldrugname;

        }else {
            int upcaigounumber = storeService.upcaigounumber(caigou);//修改
            return upcaigounumber;
        }

    }
    //删除一条药品采购单
    @RequestMapping("delcaigou")
    @ResponseBody
    public Integer delcaigou(Integer caigouid) {
        int seldrugname =storeService.delcaigou(caigouid);//删除此条采购数据
        return seldrugname;
    }
    //查询过期的药都有哪些
    @RequestMapping("seldrugDateguoqi")
    @ResponseBody
    public Object seldrugDateguoqi(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.seldrugDate(drugstore);
        PageInfo pageInfo = new PageInfo(drugstores);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }
    //删除过期的药
    @RequestMapping("delguoqidurg")
    @ResponseBody
    public Integer delguoqidurg(Integer rugstoreId,Record record) {
        System.out.print("进入删除");
        int delguoqidurg = storeService.delguoqidurg(rugstoreId);//删除此条数据
        if(delguoqidurg==1){//如果删除此条 则添加到记录表

            System.out.print("添加记录表");
            int addjilu = rs.addjilu(record);
        }
        return delguoqidurg;
    }

}