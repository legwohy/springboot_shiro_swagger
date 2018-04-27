package com.shiro.entirty;

import javax.persistence.*;


/**
 * 角色资源关联表
 */
@Entity
@Table(name = "ref_role_resource")
public class RefRoleResource {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    private Integer roleId;
    private Integer resourceId;



    public RefRoleResource() {
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
        return "RefRoleResource{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", resourceId=" + resourceId +
                '}';
    }
}
