package com.tian.service;

import com.tian.entity.Lrecord;
import com.tian.entity.Pay;
import com.tian.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
