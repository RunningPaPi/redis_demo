package com.artqiyi.service;

import java.util.List;

import com.artqiyi.entity.GameRecord;

public interface IGameRecordService {

	GameRecord getById(String id);
	
	List<GameRecord> getAll();
}
