package com.artqiyi.controller;

import lombok.Data;

@Data
public class User {
	private String userId;
	private String userName;
	private String nickName;
	private String passwd;
	private String headPicUrl;
	
	public User(String userId, String userName, String nickName, String passwd, String headPicUrl) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.nickName = nickName;
		this.passwd = passwd;
		this.headPicUrl = headPicUrl;
	}

	public User() {
		super();
	}
	
	
}
