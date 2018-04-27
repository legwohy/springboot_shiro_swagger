package com.shiro.entirty;


import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 * 系统角色
 * mybatis已开启驼峰命名
 */
@Entity
@Table(name = "sys_role")
@Alias("Role")
public class Role {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    private String role;
    private Integer roleParentId;
    private String description;
    private Integer available;


    public Role() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }



    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", roleParentId=" + roleParentId +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
