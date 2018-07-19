package com.artqiyi.entity;

import java.util.Date;

public class GameRecord {
    private String id;

    private Long gameId;

    private String gameKey;

    private String gameNo;

    private String gameFiledName;

    private Integer totalRound;

    private Integer contestNum;

    private Integer passThroughNum;

    private Integer perAward;

    private Short gameStatus;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameKey() {
        return gameKey;
    }

    public void setGameKey(String gameKey) {
        this.gameKey = gameKey == null ? null : gameKey.trim();
    }

    public String getGameNo() {
        return gameNo;
    }

    public void setGameNo(String gameNo) {
        this.gameNo = gameNo == null ? null : gameNo.trim();
    }

    public String getGameFiledName() {
        return gameFiledName;
    }

    public void setGameFiledName(String gameFiledName) {
        this.gameFiledName = gameFiledName == null ? null : gameFiledName.trim();
    }

    public Integer getTotalRound() {
        return totalRound;
    }

    public void setTotalRound(Integer totalRound) {
        this.totalRound = totalRound;
    }

    public Integer getContestNum() {
        return contestNum;
    }

    public void setContestNum(Integer contestNum) {
        this.contestNum = contestNum;
    }

    public Integer getPassThroughNum() {
        return passThroughNum;
    }

    public void setPassThroughNum(Integer passThroughNum) {
        this.passThroughNum = passThroughNum;
    }

    public Integer getPerAward() {
        return perAward;
    }

    public void setPerAward(Integer perAward) {
        this.perAward = perAward;
    }

    public Short getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Short gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}