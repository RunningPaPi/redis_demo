package com.artqiyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artqiyi.service.IGameRecordService;
import com.artqiyi.service.IGameService;
import com.artqiyi.vo.ResultVO;

@RestController
@RequestMapping("/game")
public class GameController {
	@Autowired
	private IGameService gameService;
	@Autowired
	private IGameRecordService gameRecordService;
	
	@GetMapping("/")
	public ResultVO getAllGame() {
		ResultVO result = new ResultVO();
		result.setCode(200);
		result.setData(gameService.getAll());
		result.setMsg("所有游戏");
		return result;
	}
}
