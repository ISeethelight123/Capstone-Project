package com.qyqjava.mapper;

import com.qyqjava.pojo.Profit;
import com.qyqjava.pojo.ProfitExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value = "profitMapperQYQ")
public interface ProfitMapper {
    int countByExample(ProfitExample example);

    int deleteByExample(ProfitExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(Profit record);

    int insertSelective(Profit record);

    List<Profit> selectByExample(ProfitExample example);

    Profit selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") Profit record, @Param("example") ProfitExample example);

    int updateByExample(@Param("record") Profit record, @Param("example") ProfitExample example);

    int updateByPrimaryKeySelective(Profit record);

    int updateByPrimaryKey(Profit record);
    
    int updateIncome();
    
    int updateExpenses();
    
    int updateprofit();
}