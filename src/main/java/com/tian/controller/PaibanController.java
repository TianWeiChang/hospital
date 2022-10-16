package com.tian.controller;

import com.tian.entity.Ban;
import com.tian.entity.Paiban;
import com.tian.service.PaibanService;
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
@RequestMapping("paiban")
public class PaibanController {
    @Autowired
    private PaibanService paibanService;
    @RequestMapping("findAllPaiban")
    @ResponseBody
    public Object findAllPaiban(Paiban paiban,Integer page,Integer limit){
        PageHelper.startPage(page, limit);
        List<Paiban> allPaiban = paibanService.findAllPaiban(paiban);
        PageInfo pageInfo = new PageInfo(allPaiban);
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
    @RequestMapping("editPaiban")
    @ResponseBody
    public Object editPaiban(Paiban paiban){
        int count = paibanService.count(paiban.getDoctorId());
        System.out.println(count);
        if(count==1){
            paibanService.editPaiban(paiban);

        }else if(count==0){

            paiban.setDoctorId(paiban.getDoctorId());
            paibanService.insertPaiban(paiban);
            paibanService.editPaiban(paiban);
        }
        return "修改成功";
       }
    @RequestMapping("findAllBan")
    @ResponseBody
    public Object findAllBan(){
        List<Ban> allBan = paibanService.findAllBan();
        return allBan;
    }

}
