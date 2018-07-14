
package com.artqiyi.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artqiyi.core.RedisClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/redis")
public class RedisController {
	@Autowired
	private RedisClient redisClient;
	
	@GetMapping("/get")
	public User get() {
		User user = redisClient.get("user:100001", User.class);
		return user;
	}
	
	@PostMapping("/set")
	public String set() {
		log.info("set");
		User u = new User("100001","xmg","nidie","*******","http://");
		redisClient.set("user:100001", u);
		return "ok";
	}
	
}
