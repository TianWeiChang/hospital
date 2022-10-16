package com.tian.controller;

import com.tian.entity.Lrecord;
import com.tian.entity.Pay;
import com.tian.entity.Register;
import com.tian.service.LadminService;
import com.tian.service.LpayService;
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
@RequestMapping("liao")
public class LpayController {

    @Autowired
    private LadminService ladminService;
    @Autowired
    private LpayService lpayService;

    //跳转预交款页面
    @RequestMapping("/pay")
    public String pay(){
        return "liao/pay";
    }

    //查询和交款
    @RequestMapping("/selPay")
    @ResponseBody
    public Object selPay(Register register,Double moneys){
        //判断是否是交款
        if(moneys!=0){
            register.setMoney(moneys);
            //修改预交款
            lpayService.updPay(register);
            //添加预交款记录
            lpayService.addPay(register);
        }
        List<Register> registers = ladminService.selRegister(register);
        return registers;
    }

    //查询交款记录
    @RequestMapping("/selPays")
    @ResponseBody
    public Object selPays(Integer page, Integer limit,Register register){
        PageHelper.startPage(page, limit);
        List<Pay> selPays=lpayService.selPays(register);
        PageInfo pageInfo = new PageInfo(selPays);
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

    //查询已用多少
    @RequestMapping("/selSurplus")
    @ResponseBody
    public Object selSurplus(Lrecord lrecord){
        List<Lrecord> list = lpayService.selSurplus(lrecord);
        return list;
    }
}
