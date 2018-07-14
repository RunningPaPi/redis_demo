package com.artqiyi.controller;

import lombok.Data;

@Data
public class User {
	private String userid;
	private String userName;
	private String userNickName;
	private String passwd;
	private String headPicUrl;
	
	public User(String userid, String userName, String userNickName, String passwd, String headPicUrl) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userNickName = userNickName;
		this.passwd = passwd;
		this.headPicUrl = headPicUrl;
	}

	public User() {
		super();
	}
	
	
}
