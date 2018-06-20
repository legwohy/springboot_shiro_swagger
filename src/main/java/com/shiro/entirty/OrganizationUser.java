package com.shiro.entirty;

import javax.persistence.*;

/**
 * 组织架构
 */
@Entity
@Table(name = "sys_organization")
public class OrganizationUser {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "user_id") private Integer user_id;
    @Column(name = "organization_id") private Integer organizationId;


    public OrganizationUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return "OrganizationUser{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", organizationId=" + organizationId +
                '}';
    }
}
