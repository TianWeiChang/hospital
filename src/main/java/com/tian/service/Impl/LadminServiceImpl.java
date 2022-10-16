package com.tian.service.Impl;

import com.tian.entity.*;
import com.tian.mapper.LadminMapper;
import com.tian.service.LadminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class LadminServiceImpl implements LadminService {

    @Resource
    private LadminMapper ladminMapper;

    @Override
    public List<Departments> selDepartment(Departments departments) {
        return ladminMapper.selDepartment(departments);
    }

    @Override
    public List<Doctor> selDoctor(Doctor doctor) {
        return ladminMapper.selDoctor(doctor);
    }

    @Override
    public List<Bed> selBed(Bed bed) {
        return ladminMapper.selBed(bed);
    }

    @Override
    public int addRegister(Register register) {
        return ladminMapper.addRegister(register);
    }

    @Override
    public List<Register> selRegister(Register register) {
        return ladminMapper.selRegister(register);
    }

    @Override
    public int updBed(Register register) {
        return ladminMapper.updBed(register);
    }

    @Override
    public List<Moneytype> selDis() {
        return ladminMapper.selDis();
    }

    @Override
    public List<Register> selDoor() {
        return ladminMapper.selDoor();
    }

    @Override
    public int updZ(Register register) {
        return ladminMapper.updZ(register);
    }

    @Override
    public int updKe(Register register) {
        return ladminMapper.updKe(register);
    }
}
