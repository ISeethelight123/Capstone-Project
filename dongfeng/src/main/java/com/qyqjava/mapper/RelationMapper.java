package com.qyqjava.mapper;

import com.qyqjava.pojo.Relation;
import com.qyqjava.pojo.RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMapper {
    int countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}