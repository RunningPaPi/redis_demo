package com.artqiyi.vo;

import lombok.Data;

@Data
public class UserGameRecordVo {
	private Long id;

    private Long gameId;

    private String gameNo;

    private Long userId;

    private String nickName;

    private boolean isRobot; //是否是机器人

    private String headUrl;

    private Integer recoveryTimes;

    private Short passMaxLevel;

    private Boolean isPass;

    private Integer score;

    private String note;

    private int randomNum;//产生随机数

    private boolean isTurn;//是否当前叫数

    private Object data;//叫骰点数

    private boolean hasCallOne;//是否叫过1，若叫过1则1只能代表1

    private long againstId;//对手id

    private Object agaistData;//对手叫骰点数

    private String agaistNickName;//对手昵称

    private String agaistHeadUrl;//对手头像

    private boolean isWin;//是否取胜

    private boolean islive;//是否存活

    private int gender;//性别

    private int agaistGender;//对手性别

    private boolean isRobotWin;//预设是否机器人赢

    private int callNumRound;//叫骰回合数

    private int maxShareTimes;

    private int shareTimes;

    private String shareType;
    
    private int gameTime;
    
    private boolean pass;

}
