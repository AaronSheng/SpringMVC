package com.aaron.entity;

import java.io.Serializable;

/**
 * Created by Aaron Sheng on 9/16/16.
 */
public class CommunityUser implements Serializable {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommunityUser communityUser = (CommunityUser) o;

        if (!id.equals(communityUser.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
