package com.aaron.dao;

import com.aaron.dao.base.GenericDaoI;
import com.aaron.entity.User;

/**
 * Created by Aaron Sheng on 9/16/16.
 */
public interface UserDao extends GenericDaoI<User, Long> {
    User get(Long id);

    void add(User user);
}
