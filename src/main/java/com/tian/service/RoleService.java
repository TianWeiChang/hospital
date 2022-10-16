package com.tian.service;

import com.tian.entity.DataGridView;
import com.tian.entity.Role;
import com.tian.entity.RoleMenu;

import java.util.List;

public interface RoleService {
    /*
     *
     * */
    //查询说有用户
    List<Role> loadAllRole(Role role);
    //添加角色
    int insertRole(Role role);
    //修改角色
    int updateRole(Role role);
    //删除角色
    int deleteRoleId(Integer roleid);
    //删除角色与菜单的关系
    int deleteRoleMenuId(Integer roleid);
    //删除角色与用户的关系
    int deleteRoleUserId(Integer roleid);
    //初始角色菜单
    DataGridView initRoleMenuTreeJson(Integer roleid);
    //保存角色与菜单的关系
    void saveRoleMenu(RoleMenu roleMenu);
}
