package com.tian.service;

import com.tian.entity.*;

import java.util.List;

public interface LadminService {

    List<Departments> selDepartment(Departments departments);
    List<Doctor> selDoctor(Doctor doctor);
    List<Bed> selBed(Bed bed);
    int addRegister(Register register);
    List<Register> selRegister(Register register);
    int updBed(Register register);
    List<Moneytype> selDis();
    List<Register> selDoor();
    int updZ(Register register);
    int updKe(Register register);
}
