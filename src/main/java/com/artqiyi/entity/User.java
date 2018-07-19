package com.artqiyi.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String nickName;

    private String password;

    private String phone;

    private String email;

    private String token;

    private String unionId;

    private String tokenId;

    private Short registeType;

    private Short status;

    private Boolean isRobot;

    private Date createTime;

    private Date updateTime;    
}