package com.artqiyi.entity;

import java.util.Date;

import com.artqiyi.serializer.Date2LongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Game {
    private String id;

    private String gameKey;

    private String gameName;

    private String iconUrl;

    private String bgImg;

    private String iconUrlX;

    private String bgImgX;

    private Short sort;

    private Short status;

    private Boolean deleted;

    private String remark;

    private Long createId;

    private Long updatorId;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGameKey() {
        return gameKey;
    }

    public void setGameKey(String gameKey) {
        this.gameKey = gameKey == null ? null : gameKey.trim();
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg == null ? null : bgImg.trim();
    }

    public String getIconUrlX() {
        return iconUrlX;
    }

    public void setIconUrlX(String iconUrlX) {
        this.iconUrlX = iconUrlX == null ? null : iconUrlX.trim();
    }

    public String getBgImgX() {
        return bgImgX;
    }

    public void setBgImgX(String bgImgX) {
        this.bgImgX = bgImgX == null ? null : bgImgX.trim();
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
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