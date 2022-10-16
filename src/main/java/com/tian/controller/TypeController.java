package com.tian.controller;

import com.tian.entity.Type;
import com.tian.service.TypeService;
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
@RequestMapping("type")
public class TypeController {
    @Autowired
    private TypeService typeService;
    /*
     * 查询药品类型
     * */
    @RequestMapping("findAllType")
    @ResponseBody
    public Object TypeList(Type type, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Type> listAll = typeService.findAllType(type);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条);
        //tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 添加药品类型
     * */
    @RequestMapping("addType")
    @ResponseBody
    public Object addType(Type type){
        int count = typeService.count(type);
        if(count==0){
            int i = typeService.addType(type);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return type.getTypeName()+"已存在";
        }

    }

    /*
     * 删除药品类型
     * */
    @RequestMapping("deleteType")
    @ResponseBody
    public Object deleteType(Integer typeId){
        int i = typeService.deleteType(typeId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
