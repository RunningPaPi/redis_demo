package com.artqiyi.mapper;

import com.artqiyi.entity.GameRecord;
import com.artqiyi.entity.GameRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameRecordMapper {
    int countByExample(GameRecordExample example);

    int deleteByExample(GameRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(GameRecord record);

    int insertSelective(GameRecord record);

    List<GameRecord> selectByExample(GameRecordExample example);

    GameRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GameRecord record, @Param("example") GameRecordExample example);

    int updateByExample(@Param("record") GameRecord record, @Param("example") GameRecordExample example);

    int updateByPrimaryKeySelective(GameRecord record);

    int updateByPrimaryKey(GameRecord record);
}