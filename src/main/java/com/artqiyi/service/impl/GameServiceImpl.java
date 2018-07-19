package com.artqiyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artqiyi.entity.Game;
import com.artqiyi.entity.GameExample;
import com.artqiyi.mapper.GameMapper;
import com.artqiyi.service.IGameService;

@Service
public class GameServiceImpl implements IGameService{

	@Autowired
	private GameMapper mapper;
	
	@Override
	public Game getById(String id) {		
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Game> getAll() {
		GameExample example = new GameExample();		
		return mapper.selectByExample(example);
	}
}
