package com.com.shiro.entirty;


import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class BackRole {
    private Integer id;
    private String roleName;
    private Set<BackUser> userSet = new HashSet<BackUser>();// 一对多
    private Set<BackModule> moduleSet = new HashSet<BackModule>();// 一对多

    public BackRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<BackUser> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<BackUser> userSet) {
        this.userSet = userSet;
    }

    public Set<BackModule> getModuleSet() {
        return moduleSet;
    }

    public void setModuleSet(Set<BackModule> moduleSet) {
        this.moduleSet = moduleSet;
    }

    @Override
    public String toString() {
        return "BackRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", userSet=" + userSet +
                ", moduleSet=" + moduleSet +
                '}';
    }
}
