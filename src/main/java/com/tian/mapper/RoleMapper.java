package com.tian.mapper;

import com.tian.entity.DataGridView;
import com.tian.entity.Role;
import com.tian.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {
    //加载所有角色
    List<Role> loadAllRole(Role role);
     //添加角色
    int insertRole(Role role);
    //修改角色
    int updateRole(Role role);
    //删除角色
    int deleteRoleId(Integer roleid);
    //删除角色与菜单的关系
    int deleteRoleMenuId(Integer roleid);
    //删除角色与用户的管理
    int deleteRoleUserId(Integer roleid);
    //按照角色id加载该角色的菜单
    DataGridView initRoleMenuTreeJson(Integer roleid);
    //保存角色与菜单的关系
    void saveRoleMenu(RoleMenu roleMenu);
    //添加角色
    void insertRoleMenu(@Param("rid")Integer rid, @Param("mid")Integer mid);
}
