package com.com.shiro.entirty;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 */
public class BackUser {
    private Integer id;
    private String userName;
    private String password;
    private Set<BackRole> roleSet = new HashSet<BackRole>();// 一对多

    public BackUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BackRole> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<BackRole> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "BackUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }
}
