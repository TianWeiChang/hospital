package com.tian.service;

import com.tian.entity.Menu;
import com.tian.entity.User;

import java.util.List;

public interface MenuService {
    //登陆
    User loginname(String loginname);
    //查询所有菜单
    List<Menu> queryMenuByUid(Integer userid);
    //查询可用菜单
    List<Menu> loadAvailableMenu();

    List<Menu> selAllMenuByUser(Integer userId);
    //查询所有菜单   模糊查询
    List<Menu> queryMenuAllList(Menu menu);
    //添加菜单
    int addMenu(Menu menu);
    //删除菜单
    int deleteMenu(Integer id);
    //判断该菜单是否还有子级菜单
    int checkMenuHasChildren(Integer pid);
    //修改菜单
    int updateMenu(Menu menu);

}
