package com.qyqjava.mapper;

import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.InwrehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component(value="inwrehouseQYQ")
public interface InwrehouseMapper {
    int countByExample(InwrehouseExample example);

    int deleteByExample(InwrehouseExample example);

    int deleteByPrimaryKey(Integer inwrehouseId);

    int insert(Inwrehouse record);

    int insertSelective(Inwrehouse record);

    List<Inwrehouse> selectByExample(InwrehouseExample example);

    Inwrehouse selectByPrimaryKey(Integer inwrehouseId);

    int updateByExampleSelective(@Param("record") Inwrehouse record, @Param("example") InwrehouseExample example);

    int updateByExample(@Param("record") Inwrehouse record, @Param("example") InwrehouseExample example);

    int updateByPrimaryKeySelective(Inwrehouse record);

    int updateByPrimaryKey(Inwrehouse record);
}