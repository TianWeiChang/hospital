package com.tian.service;

import com.tian.entity.Paiban;

import java.util.List;

public interface MainService {
    //1--7 的排班
    List<Paiban> one();
    List<Paiban> two();
    List<Paiban> three();
    List<Paiban> four();
    List<Paiban> five();
    List<Paiban> six();
    List<Paiban> seven();
    //门诊当天人数
    int currentNum();
    //总人数
    int Total();
    //住院总人数
    int zhuyuanTotal();
    //住院当天人数
    int currentZhuYuan();
}
