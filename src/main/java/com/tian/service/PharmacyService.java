package com.tian.service;

import com.tian.entity.Baoque;
import com.tian.entity.Huishou;
import com.tian.entity.Ypharmacy;

import java.util.List;

public interface PharmacyService {
    //查询药房药品
    List<Ypharmacy> selpharmacy(Ypharmacy ypharmacy);
    //添加药品到报缺表
    int addbaoque(Baoque baoque);
    //查询报缺表药品名称是否已存在
    int selbaoqueName(Baoque baoque);
    int upbaoquenum(Baoque baoque);
    //回收给药房
    int delpharymacy(Ypharmacy ypharmacy);
    //回收表
    int addhuishou(Huishou huishou);
    //查询回收表
    List<Huishou>selhuishou(Huishou huishou);
    //删除回收表
    int delhuishou(Huishou huishou);
}
