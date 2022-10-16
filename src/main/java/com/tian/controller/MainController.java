package com.tian.controller;

import com.tian.entity.Paiban;
import com.tian.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("main")
public class MainController {
    /*
    * 查询周一到周日的排班
    * */
    @Autowired
    private MainService mainService;
    @RequestMapping("one")
    @ResponseBody
    public Object one(){
        List<Paiban> one = mainService.one();
        return one;
    }
    @RequestMapping("two")
    @ResponseBody
    public Object two(){
        List<Paiban> two = mainService.two();
        return two;
    }
    @RequestMapping("three")
    @ResponseBody
    public Object three(){
        List<Paiban> three = mainService.three();
        return three;
    }
    @RequestMapping("four")
    @ResponseBody
    public Object four(){
        List<Paiban> four = mainService.four();
        return four;
    }
    @RequestMapping("five")
    @ResponseBody
    public Object five(){
        List<Paiban> five = mainService.five();
        return five;
    }
    @RequestMapping("six")
    @ResponseBody
    public Object six(){
        List<Paiban> six = mainService.six();
        return six;
    }
    @RequestMapping("seven")
    @ResponseBody
    public Object seven(){
        List<Paiban> seven = mainService.seven();
        return seven;
    }
    /*
    * 查询当天门诊人数
    * */
    @RequestMapping("currentNum")
    @ResponseBody
    public Object currentNum(){
        int currentNum = mainService.currentNum();
        return currentNum;
    }
    /*
    * 查询所有人数
    * */
    @RequestMapping("Total")
    @ResponseBody
    public Object Total(){
        int Total = mainService.Total();
        return Total;
    }
    /*
     * 查询住院所有人数
     * */
    @RequestMapping("zhuyuanTotal")
    @ResponseBody
    public Object zhuyuanTotal(){
        int zhuyuanTotal = mainService.zhuyuanTotal();
        return zhuyuanTotal;
    }
    /*
     * 查询当天住院所有人数
     * */
    @RequestMapping("currentZhuYuan")
    @ResponseBody
    public Object currentZhuYuan(){
        int currentZhuYuan = mainService.currentZhuYuan();
        return currentZhuYuan;
    }
}
