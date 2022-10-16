package com.tian.mapper;

import com.tian.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrjectTypeMapper {
    /*
     * 项目增删改查
     * */
    List<Projecttype> findAllProjecttype(Projecttype projecttype);
    int addProjecttype(Projecttype projecttype);
    int deleteProjecttype(Integer projectId);
    int count1(Projecttype projecttype);
    /*
     * 门诊收费项目Outpatienttype
     * */
    List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype);
    int addOutpatienttype(Outpatienttype outpatienttype);
    int editOutpatienttype(Outpatienttype outpatienttype);
    int deleteOutpatienttype(Integer outpatientId);
    int count2(Outpatienttype outpatienttype);
    /*
     * 住院收费项目Inoutpatienttype
     * */
    List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype);
    int addInoutpatienttype(Inoutpatienttype inoutpatienttype);
    int editInoutpatienttype(Inoutpatienttype inoutpatienttype);
    int deleteInoutpatienttype(Integer inoutpatientId);
    int count3(Inoutpatienttype inoutpatienttype);
    /*
     * 收费类型Monetype
     * */
    List<Moneytype> findAllMoneytype(Moneytype moneytype);
    int addMoneytype(Moneytype moneytype);
    int editMoneytype(Moneytype moneytype);
    int deleteMoneytype(Integer moneyId);
    int count4(Moneytype moneytype);

    /*
     * 床位Bed
     * */
    List<Bed> findAllBed(Bed bed);
    int addBed(Bed bed);
    int editBed(Bed bed);
    int deleteBed(Integer bedId);
    int count5(Bed bed);
    /*
     * 判断该床位是否有人
     * */

    int checkCount(Integer bedId);
}
