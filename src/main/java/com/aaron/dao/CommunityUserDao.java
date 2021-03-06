package com.aaron.dao;

import com.aaron.dao.base.GenericDao;
import com.aaron.entity.CommunityUser;

/**
 * Created by Aaron Sheng on 10/12/16.
 */
public interface CommunityUserDao extends GenericDao<CommunityUser, Long> {
    CommunityUser get(Long id) ;

    void add(CommunityUser communityUser);
}
