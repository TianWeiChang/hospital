package com.tian.mapper;


import com.tian.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CreportMapper {
    //查询挂号的所有信息
    List<ReportVo> sel(ReportVo reportVo);
    List<ReportVo> selById(Integer reportId);
    //查询所有的科室
    List<CDepartments> seldep();
    //查询所有的门诊类型
    List<CRegisteredtype> selreg();
    //查询医生的信息
    List<ReportVo> one(CDoctor cDoctor);
    List<ReportVo> two(CDoctor cDoctor);
    List<ReportVo> three(CDoctor cDoctor);
    List<ReportVo> four(CDoctor cDoctor);
    List<ReportVo> five(CDoctor cDoctor);
    List<ReportVo> six(CDoctor cDoctor);
    List<ReportVo> seven(CDoctor cDoctor);
    //根据所选科室查询该科室的价格
    Integer seltymo(CRegisteredtype cRegisteredtype);
    //添加挂号人员
    Integer addre(CReport cReport);
    //根据id删除某个患者的信息
    Integer delre(Integer id);
    //判断正在就诊的电话唯一
    Integer phone(CReport cReport);
    //判断正在就诊的电话唯一
    Integer carid(CReport cReport);
    //把今天预约而没有来的人进行删除
    int upddang();
    //从门诊转入住院
    Integer zhuanyuan(CReport cReport);
}
