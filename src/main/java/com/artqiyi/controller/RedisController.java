package com.artqiyi.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

//import com.artqiyi.tanqiu.common.constant.RedisFiledConstant;
//import com.artqiyi.tanqiu.common.util.JSONUtil;
//import com.artqiyi.tanqiu.game.IGameBreakRecordsService;
//import com.artqiyi.tanqiu.game.IGameModelService;
//import com.artqiyi.tanqiu.game.domain.GameBreakRecords;
//import com.artqiyi.tanqiu.game.domain.GameBreakUserRecords;
//import com.artqiyi.tanqiu.game.vo.UserGameRecordVo;
//import com.artqiyi.tanqiu.redis.RedisClient;
//import com.artqiyi.tanqiu.redis.RedisService;
//import com.artqiyi.tanqiu.redis.StringRedisService;
//import com.artqiyi.tanqiu.response.UserResponse;
//import com.artqiyi.tanqiu.user.domain.User;
//import com.artqiyi.tanqiu.user.service.IUserService;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.artqiyi.constants.RedisFiledConstant;
import com.artqiyi.core.RedisClient;
import com.artqiyi.entity.GameRecord;
import com.artqiyi.entity.UserGameRecord;
import com.artqiyi.service.IGameRecordService;
import com.artqiyi.vo.ResultVO;
import com.artqiyi.vo.UserGameRecordVo;
import com.artqiyi.vo.UserRankVo;


@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisClient redisClient;
    @Autowired
    private IGameRecordService gameRecordService;

//    @RequestMapping("/loadToRedis")
//    public String loadToRedis(){
//
//    }
    @RequestMapping("/exists")
    public boolean exists() {
        String key = "hTest";
        
        return redisClient.exists(RedisFiledConstant.GAME_RECORD);
    }
    
    @RequestMapping("/hExists")
    public boolean hexists() {
    	String key = "hTest";
        return redisClient.hExists(RedisFiledConstant.GAME_RECORD,key);
    }
    
    @RequestMapping("/htest")
    public String hSet() {
        String key = "hTest";
        String hKey = "hTest";
        String value = "testsdfasfdasfs";
        redisClient.hSet(RedisFiledConstant.GAME_RECORD, hKey, value);
        return "ojbk";
    }

    @RequestMapping("/hget")
    public Object hget() {
        String key = "hTest";
        String hKey = "hTest";
        return redisClient.hGet(key, hKey, String.class);
    }


    @RequestMapping("/get/{key}")
    public Object get(@PathVariable final String key) {
        return redisClient.get(key, String.class);
    }

    @RequestMapping("/set")
    public void set(@RequestParam final String key) {
        redisClient.set(key,"1");
    }


    @RequestMapping("/incr/{key}")
    public Long incr(@PathVariable final String key) {
        return redisClient.incr(key);
    }

    @RequestMapping("/del")
    public String del() {
        redisClient.del(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741");
        return "ojbk";
    }

    @RequestMapping("/ttl")
    public long ttl() {
        return redisClient.ttl("test");
    }

    @RequestMapping("/setWithExpire")
    public void setWithExpire() {
//        redisClient.setWithExpire("test", "1", 1000, TimeUnit.SECONDS);
    }

    @RequestMapping("/getList")
    public List getList(final String field, Class targetClass) {
//        redisClient.getList()
        return null;
    }

    @RequestMapping("/setList")
    public void setList(String field, List objList) {

    }

    @RequestMapping("/setListWithExpire")
    public void setListWithExpire(String field, List objList, final long expireTime) {

    }

    @RequestMapping("/hGet")
    public Object hGet(final String key, final String field, Class targetClass) {

        return null;
    }

    @RequestMapping("/hDel")
    public String hDel() {
        redisClient.hDel(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741", "3");
        return "ojbk";
    }

    @RequestMapping("/hSet")
    public boolean hSet(String key, String field, Object obj) {
    	UserGameRecordVo vo1 = new UserGameRecordVo();
        vo1.setIslive(true);
        vo1.setAgainstId(1);
        vo1.setAgaistGender(1);
        vo1.setAgaistHeadUrl("http://");
        vo1.setAgaistNickName("xmg");
        vo1.setGameTime(300);
        vo1.setPassMaxLevel((short) 3);
        vo1.setPass(false);
        vo1.setWin(false);
        vo1.setGameNo("BREAK_2018_187_1741");
        vo1.setGender(1);
        vo1.setHeadUrl("http://");
        vo1.setNickName("cainiao");
        vo1.setRecoveryTimes(0);
        vo1.setScore(1200);
        vo1.setGameId(1L);
        vo1.setId(1L);
        vo1.setNote("hehe");
        vo1.setData("shenma");
        redisClient.hSet(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741", "1", vo1);
        UserGameRecordVo vo2 = new UserGameRecordVo();
        vo2.setIslive(true);
        vo2.setAgainstId(3);
        vo2.setAgaistGender(1);
        vo2.setAgaistHeadUrl("http://");
        vo2.setAgaistNickName("cianiao");
        vo2.setGameTime(300);
        vo2.setPassMaxLevel((short) 6);
        vo2.setPass(false);
        vo2.setWin(false);
        vo2.setGameNo("BREAK_2018_187_1741");
        vo2.setGender(1);
        vo2.setHeadUrl("http://");
        vo2.setNickName("xmg");
        vo2.setRecoveryTimes(0);
        vo2.setScore(1500);
        vo2.setGameId(1L);
        vo2.setId(1L);
        vo2.setNote("hehe");
        vo2.setData("shenma");
        redisClient.hSet(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741", "2", vo2);
        UserGameRecordVo vo3 = new UserGameRecordVo();
        vo3.setIslive(true);
        vo3.setAgainstId(3);
        vo3.setAgaistGender(1);
        vo3.setAgaistHeadUrl("http://");
        vo3.setAgaistNickName("xmg1");
        vo3.setGameTime(300);
        vo3.setPassMaxLevel((short) 3);
        vo3.setPass(false);
        vo3.setWin(false);
        vo3.setGameNo("BREAK_2018_187_1741");
        vo3.setGender(1);
        vo3.setHeadUrl("http://");
        vo3.setNickName("cainiao1");
        vo3.setRecoveryTimes(0);
        vo3.setScore(1200);
        vo3.setGameId(1L);
        vo3.setId(1L);
        vo3.setNote("hehe");
        vo3.setData("shenma");
        redisClient.hSet(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741", "3", vo3);

        return false;
    }

    @RequestMapping("/hSetWithExpire")
    public void hSetWithExpire(String key, String field, Object obj, long expireTime) {


    }

    @RequestMapping("/hGetList")
    public List hGetList(final String key, final String field, Class targetClass) {

        return null;
    }

    @RequestMapping("/hSetList")
    public boolean hSetList(String key, String field, List objList) {

        return false;
    }

    @RequestMapping("/hMGet")
    public Object hMGet(String key, Collection<String> fields, Class targetClass) {

        return null;
    }

    @RequestMapping("/hMSet")
    public void hMSet(String field, Map<String, Object> values) {


    }

    @RequestMapping("/hGetAll")
    public Object hGetAll(String key, Class targetClass) {
        Map<String, UserGameRecordVo> map = redisClient.hGetAll(RedisFiledConstant.GAME_WAIT_PLAYER + "_BREAK_2018_187_1741", UserGameRecordVo.class);
        if (map != null || !map.isEmpty()) {
            for (Map.Entry<String, UserGameRecordVo> entry : map.entrySet()) {
            	UserGameRecord records = new UserGameRecord();
                BeanUtils.copyProperties(entry.getValue(), records);
                System.out.println("【hGetAll】：" + JSON.toJSONString(records));
            }
        }
        return map;
    }

    @RequestMapping("/lIndex")
    public Object lIndex(String key, int index, Class targetClass) {

        return null;
    }

    @RequestMapping("/lRange")
    public List lRange(String key, int start, int end, Class targetClass) {

        return null;
    }

    @RequestMapping("/lPush")
    public void lPush(String key, Object obj) {

    }

    @RequestMapping("/lPushList")
    public void lPushList(String key, List objList) {

    }

    @RequestMapping("/deleteCache")
    public void deleteCache(String key) {

    }

    @RequestMapping("/zAdd")
    public void zAdd() {
        String redisKey = "rank";
        Random random = new Random();
//        UserExample example = new UserExample();
//        List<User> users = userService.selectByExample(example);
        for (int i = 0; i < 15; i++) {
            BigDecimal r = BigDecimal.valueOf(random.nextInt(20));
            User user = new User();
            user.setUserId(i+"");
            user.setNickName("xmg_" + i);
            ImmutablePair<User, BigDecimal> immutablePair0 = new ImmutablePair<>(user, r);
            redisClient.zAdd(redisKey, immutablePair0);
        }

    }

    @RequestMapping("/zRangeWithScores")
    public ResultVO zRangeWithScores() {
        List<ImmutablePair<User, BigDecimal>> rank = redisClient.zRangeWithScores("rank", 0, -1, User.class);
        List<UserRankVo> list = new ArrayList<>();

        for (ImmutablePair<User, BigDecimal> pair : rank) {
            UserRankVo urv = new UserRankVo();
            BeanUtils.copyProperties(pair.left,urv);
            urv.setScore(pair.right);
            list.add(urv);
        }
        ResultVO response = new ResultVO();
        response.setCode(200);
        response.setData(list);
        return response;
    }

    @RequestMapping("/zRevRangeWithScores")
    public ResultVO zRevRangeWithScores() {
        List<ImmutablePair<User, BigDecimal>> rank = redisClient.zRevRangeWithScores("rank", 0, -1, User.class);
        List<UserRankVo> list = new ArrayList<>();

        for (ImmutablePair<User, BigDecimal> pair : rank) {
            UserRankVo urv = new UserRankVo();
            BeanUtils.copyProperties(pair.left,urv);
            urv.setScore(pair.right);
            list.add(urv);
        }
        ResultVO response = new ResultVO();
        response.setCode(200);
        response.setData(list);
        return response;
    }
    
    @GetMapping("/zRank/{id}")
    public ResultVO zRank(@PathVariable("id") String id) {
    	ResultVO result = new ResultVO();
    	List<ImmutablePair<User,BigDecimal>> zRangeWithScores = redisClient.zRangeWithScores("rank", 0, -1, User.class);
    	ImmutablePair<User,BigDecimal> immutablePair = zRangeWithScores.stream()
    			.filter(pairs->pairs.left.getUserId().equals(id))
    			.findFirst().get();
    	
    	result.setCode(200);
        result.setData(immutablePair.left);
        return result;
    }
}
