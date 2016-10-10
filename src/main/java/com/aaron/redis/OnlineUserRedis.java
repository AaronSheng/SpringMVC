package com.aaron.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaron Sheng on 10/5/16.
 */
public interface OnlineUserRedis {
    void setName(final Long id, final String name);

    String getName(final Long id);

    void delete(final Long id);

    int size();
}
