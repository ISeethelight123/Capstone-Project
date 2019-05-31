package com.qyqjava.mapper;

import com.qyqjava.pojo.Outwerhouse;
import com.qyqjava.pojo.OutwerhouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value = "outwerhosueQYQ")
public interface OutwerhouseMapper {
    int countByExample(OutwerhouseExample example);

    int deleteByExample(OutwerhouseExample example);

    int deleteByPrimaryKey(Integer outwerhouseId);

    int insert(Outwerhouse record);

    int insertSelective(Outwerhouse record);

    List<Outwerhouse> selectByExample(OutwerhouseExample example);

    Outwerhouse selectByPrimaryKey(Integer outwerhouseId);

    int updateByExampleSelective(@Param("record") Outwerhouse record, @Param("example") OutwerhouseExample example);

    int updateByExample(@Param("record") Outwerhouse record, @Param("example") OutwerhouseExample example);

    int updateByPrimaryKeySelective(Outwerhouse record);

    int updateByPrimaryKey(Outwerhouse record);
}