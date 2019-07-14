package com.redisdao;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * The type My redis temp dao imp.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 9:03 2019/7/6
 */
@Repository
public class MyRedisTempDaoImp implements MyRedisTempDao {

    @Resource(name = "redisTemplate")
    public RedisTemplate redisTemplate;

    @Override
    public void setValue(String key, String value, long s) {
        System.out.println("存入redis中的验证码： "  + value);
        redisTemplate.opsForValue().set(key, value, s, TimeUnit.SECONDS);
    }

    @Override
    public String getValue(String key) {
        return redisTemplate.opsForValue().get(key).toString();
    }

}
