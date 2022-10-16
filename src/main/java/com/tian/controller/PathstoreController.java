package com.tian.controller;

import com.tian.entity.Drugstore;
import com.tian.entity.Skull;
import com.tian.entity.Upplier;
import com.tian.entity.Warehuose;
import com.tian.service.OutinstoreService;
import com.tian.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//负责跳转页面controller
@RequestMapping("dsnavigation")
public class PathstoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private OutinstoreService outinstoreService;
//进入库房查询
    @RequestMapping("store")
    public Object store(){
        return "drugstore/c_store";
    }
    //进入库房查询
    @RequestMapping("pharymacyhtml")
    public Object pharymaryhtml(){
        return "drugstore/c_pharmacy";
    }
    //库房药品查询
    @RequestMapping("selectdurg")
    public Object selectdurg() {
        return "drugstore/c_selectDrug";
    }
    //库房药品查询
    @RequestMapping("recycle")
    public Object recycle() {
        return "drugstore/c_recycle";
    }
    //库房药品出库
    @RequestMapping("selectchuku")
    public Object selectchuku(Model model) {
        System.out.print("进入出库");
        int selbaoquecount = outinstoreService.selbaoquecount();
        //在进入出库时查询报缺单有几条报缺显示在表头
        model.addAttribute("selbaoquecount",selbaoquecount);
        return "drugstore/c_gooutstore";
    }
    //进入药品日期报警
    @RequestMapping("seldrugDate")
    public Object seldrugDate(Drugstore drugstore, Model model) {
        int selcountlessnum = storeService.selcountlessnum();
        model.addAttribute("selcountlessnum",selcountlessnum);
        return "drugstore/c_storedrugDate";
    }
    //进入药品报缺
    @RequestMapping("selectless")
    public Object selectless(Model model) {
        return "drugstore/c_lackdrug";
    }
    //进入入库页面
    @RequestMapping("beputinstorage")
    public Object beputinstorage(Upplier upplier, Warehuose warehuose, Skull skull, Model model){
        //查询供货商，经办人，库房
        List<Upplier> selupp = storeService.selupplier(upplier);
        List<Skull> selsku = storeService.selskull(skull);
        List<Warehuose> selwar = storeService.selwarehuose(warehuose);
        model.addAttribute("selupp",selupp);
        model.addAttribute("selsku",selsku);
        model.addAttribute("selwar",selwar);
        System.out.print(warehuose.getSupplierName());
        return "drugstore/c_beputinstorage";
    }
//进入操作记录页面
    @RequestMapping("record")
    public  Object record(){


        return "drugstore/c_record";
    }
}
