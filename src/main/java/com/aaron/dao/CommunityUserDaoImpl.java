package com.aaron.dao;

import com.aaron.dao.base.GenericDaoImpl;
import com.aaron.entity.CommunityUser;
import com.aaron.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Aaron Sheng on 10/12/16.
 */
@Repository
public class CommunityUserDaoImpl extends GenericDaoImpl<CommunityUser, Long> implements CommunityUserDao {

    @Resource(name = "communitySessionFactory")
    public void setCommunitySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public CommunityUser get(Long id) {
        return findByPK(id);
    }

    public void add(CommunityUser communityUser) {
        save(communityUser);
    }
}
