package com.qyqjava.mapper;

import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.AllocationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value= "allocationMapperQYQ")
public interface AllocationMapper {
    int countByExample(AllocationExample example);

    int deleteByExample(AllocationExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(Allocation record); //增加仓库位置

    int insertSelective(Allocation record);

    List<Allocation> selectByExample(AllocationExample example);

    Allocation selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") Allocation record, @Param("example") AllocationExample example);

    int updateByExample(@Param("record") Allocation record, @Param("example") AllocationExample example);

    int updateByPrimaryKeySelective(Allocation record);

    int updateByPrimaryKey(Allocation record);
    
    int addAllocation(Map<String, Object> map);
    
    List<Object> showAllNum();
}