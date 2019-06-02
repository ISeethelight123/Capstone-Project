package com.qyqjava.mapper;

import com.qyqjava.pojo.Coordinate;
import com.qyqjava.pojo.CoordinateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value = "coordinateMapperQYQ")
public interface CoordinateMapper {
    int countByExample(CoordinateExample example);

    int deleteByExample(CoordinateExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(Coordinate record);

    int insertSelective(Coordinate record);

    List<Coordinate> selectByExample(CoordinateExample example);

    Coordinate selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") Coordinate record, @Param("example") CoordinateExample example);

    int updateByExample(@Param("record") Coordinate record, @Param("example") CoordinateExample example);

    int updateByPrimaryKeySelective(Coordinate record);

    int updateByPrimaryKey(Coordinate record);
    
    List<Map<String, Object>> showXY();
}