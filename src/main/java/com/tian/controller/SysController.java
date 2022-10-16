package com.tian.controller;


import com.tian.entity.User;
import com.tian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SysController {
    @Autowired
    private UserService userService;

    /*
     * 跳转管理菜单
     * */
    @RequestMapping("toMenuManager")
    public String toMenuManager() {
        return "view/menu/menuManager";
    }

    /*
     * 跳转加载菜单管理左边的菜单树
     * */
    @RequestMapping("toMenuLeft")
    public String toMenuLeft() {
        return "view/menu/menuLeft";
    }

    /*
     * 跳转加载菜单管理左边的增删改
     * */
    @RequestMapping("toMenuRight")
    public String toMenuRight() {
        return "view/menu/menuRight";
    }
    /*
     * 跳转加载角色
     * */
    @RequestMapping("toLoadAllRole")
    public String toLoadAllRole() {
        return "view/role/roleManager";
    }
    /*
     * 跳转加载用户
     * */
    @RequestMapping("toLoadAllUser")
    public String toLoadAllUser() {
        return "view/user/userManager";
    }

    /*
     * 跳转加载doctor.html
     * */
    @RequestMapping("toDoctor")
    public String toDoctor() {
        return "view/center/doctor";
    }
    /*
     * 跳转加载departments.html
     * */
    @RequestMapping("toDepartments")
    public String toDepartments() {
        return "view/center/departments";
    }
    /*
     * 跳转加载registeredtype.html
     * */
    @RequestMapping("toRegisteredType")
    public String toRegisteredtype() {
        return "view/center/registeredType";
    }

    /*
     * 跳转加载icon.html
     * */
    @RequestMapping("icon")
    public String icon() {
        return "view/center/icon";
    }

    /*
     * 跳转加载type.html
     * */
    @RequestMapping("toType")
    public String toType() {
        return "view/center/type";
    }
    /*
     * 跳转加载area.html
     * */
    @RequestMapping("toArea")
    public String toArea() {
        return "view/center/area";
    }

    /*
     * 跳转加载skull.html
     * */
    @RequestMapping("toSkull")
    public String toSkull() {
        return "view/center/skull";
    }
    /*
     * 跳转加载warehuose.html
     * */
    @RequestMapping("toWarehuose")
    public String toWarehuose() {
        return "view/center/warehuose";
    }

    /*
     * 跳转加载supplyManage.html
     * */
    @RequestMapping("toSupplyManage")
    public String toSupplyManage() {
        return "view/center/supplyManage";
    }
    /*
     * 跳转加载supply.html
     * */
    @RequestMapping("toSupply")
    public String toSupply() {
        return "view/center/supply";
    }
    /*
     * 跳转加载unit.html
     * */
    @RequestMapping("toUnit")
    public String toUnit() {
        return "view/center/unit";
    }

    /*
     * 跳转加载updateLogin.html
     * */
    @RequestMapping("toUpdateLogin")
    public String toUpdateLogin(User user, Integer userid, Model model) {
        List<User> users = userService.updateLogin(user);
        model.addAttribute("usersLogin",users);
        return "view/user/updateLogin";
    }
    /*
     * 跳转加载projectTypeManage.html
     * */
    @RequestMapping("toProjectTypeManage")
    public String toProjectTypeManage() {
        return "view/center/projectTypeManage";
    }
    /*
     * 跳转加载paiban.html
     * */
    @RequestMapping("toPaiban")
    public String toPaiban() {
        return "view/center/paiban";
    }
    /*
     * 跳转加载drugdictionary.html
     * */
    @RequestMapping("toDrugdictionary")
    public String toDrugdictionary() {
        return "view/center/drugdictionary";
    }
    /*
     * 跳转加载main.html
     * */
    @RequestMapping("toMain")
    public String toMain() {
        return "view/main/main";
    }
    /*
     * 跳转加载reportManage.html
     * */
    @RequestMapping("toReportFinance")
    public String toReportFinance() {
        return "view/finance/reportManage";
    }

    /*
     * 跳转加载zhuYuanManage.html
     * */
    @RequestMapping("toZhuYaunManage")
    public String toZhuYaunManage() {
        return "view/finance/zhuYuanManage";
    }
    /*
     * 跳转加载zhuYuanManage.html
     * */
    @RequestMapping("toBingYear")
    public String toBingYear() {
        return "view/finance/reportBing";
    }
    /*
     * 跳转加载zhuYuanBing.html
     * */
    @RequestMapping("toBing2")
    public String toBing2() {
        return "view/finance/zhuYuanBing";
    }
    /*
     * 跳转加载doctorDuibi.html
     * */
    @RequestMapping("toDoctorDuibi")
    public String toDoctorDuibi() {
        return "view/finance/doctorDuibi";
    }

    /*
     * 跳转加载current.html
     * */
    @RequestMapping("toCurrent")
    public String toCurrenti() {
        return "view/finance/current";
    }
}
