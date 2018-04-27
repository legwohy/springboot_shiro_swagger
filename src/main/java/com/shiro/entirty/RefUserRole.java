package com.shiro.entirty;

import javax.persistence.*;

/**
 * 用户角色
 */
@Entity
@Table(name = "ref_user_role")
public class RefUserRole {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    private Integer userId;
    private Integer roleId;


    public RefUserRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }



    @Override
    public String toString() {
        return "RefUserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
