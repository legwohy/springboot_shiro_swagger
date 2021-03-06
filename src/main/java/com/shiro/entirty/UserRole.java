package com.shiro.entirty;

import javax.persistence.*;

/**
 * 用户角色
 */
@Entity
@Table(name = "ref_user_role")
public class UserRole {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "user_id") private Integer userId;
    @Column(name = "role_id") private Integer roleId;

    public UserRole() {
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
        return "UserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
