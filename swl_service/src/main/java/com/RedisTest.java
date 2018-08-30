package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by songweiliang on 2017/8/9.
 */
public class RedisTest {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void test(){
        RedisConnectionFactory c = redisTemplate.getConnectionFactory();
        RedisConnection connection= c.getConnection();
    }
}
