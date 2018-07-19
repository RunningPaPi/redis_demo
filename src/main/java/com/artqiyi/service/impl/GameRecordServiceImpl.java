package com.artqiyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artqiyi.entity.GameRecord;
import com.artqiyi.entity.GameRecordExample;
import com.artqiyi.mapper.GameRecordMapper;
import com.artqiyi.service.IGameRecordService;

@Service
public class GameRecordServiceImpl implements IGameRecordService{

	@Autowired
	private GameRecordMapper mapper;
	
	@Override
	public GameRecord getById(String id) {		
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<GameRecord> getAll() {
		GameRecordExample example = new GameRecordExample();		
		return mapper.selectByExample(example);
	}
}
