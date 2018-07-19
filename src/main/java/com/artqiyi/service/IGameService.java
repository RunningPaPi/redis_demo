package com.artqiyi.service;

import java.util.List;

import com.artqiyi.entity.Game;

public interface IGameService {
	Game getById(String id);
	
	List<Game> getAll();
}
