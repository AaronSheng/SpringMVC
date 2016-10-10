package com.aaron.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaron Sheng on 10/6/16.
 */
public interface MessageRedis {
    Long add(String message);

    String get();

    Long size();
}
