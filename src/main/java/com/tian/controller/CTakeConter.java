package com.tian.controller;

import com.tian.entity.ReportVo;
import com.tian.service.CTakeService;
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
@RequestMapping("caotake")
public class CTakeConter {
    @Autowired
    private CTakeService cTakeService;
    @RequestMapping("seltake")
    private Object seltake(){
        return "cao/Cquyao";
    }
    //查询所有患者信息
    @RequestMapping("tselpreson")
    @ResponseBody
    public Object tselperson(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<ReportVo> sel = cTakeService.sel();
        PageInfo pageInfo = new PageInfo(sel);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //修改用户状态
    @RequestMapping("chuku")
    @ResponseBody
    public Object chuku(ReportVo reportVo){
        Integer chuku = cTakeService.chuku(reportVo);
        return chuku;
    }
    //进入查看患者页面
    @RequestMapping("haun")
    public Object haun(){

        return "cao/chuanzhe";
    }
    //查看患者信息
    @RequestMapping("selhuan")
    @ResponseBody
    public Object selhuan(ReportVo reportVo,Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<ReportVo> selhuan = cTakeService.selhuan(reportVo);
        PageInfo pageInfo = new PageInfo(selhuan);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查看该用户的总价格
    @RequestMapping("zong")
    @ResponseBody
    public Object zong(Integer reid){
        int zong = cTakeService.zong(reid);
        return zong;
    }
}
