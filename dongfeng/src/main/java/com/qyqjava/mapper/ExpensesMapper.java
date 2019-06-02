package com.qyqjava.mapper;

import com.qyqjava.pojo.Expenses;
import com.qyqjava.pojo.ExpensesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value = "expensesMapperQYQ")
public interface ExpensesMapper {
    int countByExample(ExpensesExample example);

    int deleteByExample(ExpensesExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(Expenses record);

    int insertSelective(Expenses record);

    List<Expenses> selectByExample(ExpensesExample example);

    Expenses selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") Expenses record, @Param("example") ExpensesExample example);

    int updateByExample(@Param("record") Expenses record, @Param("example") ExpensesExample example);

    int updateByPrimaryKeySelective(Expenses record);

    int updateByPrimaryKey(Expenses record);
}