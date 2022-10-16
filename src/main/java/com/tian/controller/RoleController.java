package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.RoleService;
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
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("loadAllRole")
    @ResponseBody
    public Object loadAllRole(Role role, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Role> roles = roleService.loadAllRole(role);
        PageInfo pageInfo = new PageInfo(roles);
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

    @RequestMapping("insertRole")
    @ResponseBody
    public String insertRole(Role role) {
        int i = roleService.insertRole(role);
        if (i == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    @RequestMapping("updateRole")
    @ResponseBody
    public String updateRole(Role role) {
        int i = roleService.updateRole(role);
        if (i == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping("deleteRole")
    @ResponseBody
    public String deleteRole(Integer roleid) {
        roleService.deleteRoleId(roleid);
        roleService.deleteRoleUserId(roleid);
        roleService.deleteRoleMenuId(roleid);
        return "删除成功";

    }
    //加载角色管理分配菜单
    @RequestMapping("initRoleMenuTreeJson")
    @ResponseBody
    public DataGridView initRoleMenuTreeJson(Integer roleid) {
        return roleService.initRoleMenuTreeJson(roleid);
    }
    //保存角色和菜单的关系
    @RequestMapping("saveRoleMenu")
    @ResponseBody
    public Object saveRoleMenu(RoleMenu roleMenu){

        roleService.saveRoleMenu(roleMenu);
        return "分配成功";
    }
}
