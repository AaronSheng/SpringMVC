package com.aaron.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaron Sheng on 10/10/16.
 */
@Repository
public class OnlineUserRedisImpl implements OnlineUserRedis {
    private final static String PREFIX = "user:";
    private final static String NAME = "name";

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void setName(final Long id, final String name) {
        redisTemplate.opsForHash().put(PREFIX + id, NAME, name);
    }

    public String getName(final Long id) {
        return (String) redisTemplate.opsForHash().get(PREFIX + id, NAME);
    }

    public void delete(final Long id) {
        redisTemplate.opsForHash().delete(PREFIX + id);
    }

    public int size() {
        return redisTemplate.keys(PREFIX + "*").size();
    }
}
