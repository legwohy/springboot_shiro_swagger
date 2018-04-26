package com.shiro.entirty;

import javax.persistence.*;


/**
 * 角色资源表
 */
@Entity
@Table(name = "ref_role_resource")
public class BackRoleResource {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "role_id") private Integer roleId;
    @Column(name = "resource_id") private Integer resourceId;



    public BackRoleResource() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }


    @Override
    public String toString() {
        return "BackRoleResource{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", resourceId=" + resourceId +
                '}';
    }
}
