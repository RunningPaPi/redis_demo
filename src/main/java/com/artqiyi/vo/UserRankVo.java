package com.artqiyi.vo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class UserRankVo implements Comparable<UserRankVo>{
    private String userName;
    private String userId;
    private String headPicUrl;
    private int passTimes;
    private int money;
    private int rank;
    private BigDecimal score;

    @Override
    public int compareTo(UserRankVo o) {
        int i = this.getPassTimes() - o.getPassTimes();//先按照年龄排序
        if(i == 0){
            return this.getMoney() - o.getMoney();//如果年龄相等了再用分数进行排序
        }
        return i;
    }
}
