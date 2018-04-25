package com.com.shiro.entirty;

import java.util.HashSet;
import java.util.Set;

/**
 * 资源 权限
 */
public class BackModule {
    private Integer id;
    private String moduleName;
    private Set<BackRole> roleSet = new HashSet<BackRole>();// 一对多

    public BackModule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Set<BackRole> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<BackRole> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "BackModule{" +
                "id=" + id +
                ", moduleName='" + moduleName + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }
}
