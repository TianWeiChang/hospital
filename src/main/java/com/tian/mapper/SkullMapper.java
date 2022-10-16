package com.tian.mapper;

import com.tian.entity.Skull;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SkullMapper {
    //经办人的增删查改
    List<Skull> findAllSkull(Skull skull);
    int deleteSkull(Integer skullId);
    int addSkull(Skull skull);
    int editSkull(Skull skull);
}
