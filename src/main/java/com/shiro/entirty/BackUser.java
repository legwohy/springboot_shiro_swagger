package com.shiro.entirty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 系统用户
 */
@Entity
@Table(name = "sys_user")
public class BackUser {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "username") private String userName;
    @Column private String password;
    @Column private String salt;
    @Column(name = "user_mobile") private String userMobile;
    @Column(name = "organization_id") private Integer organizationId;
    @Column(name = "locked") private Boolean locked;

    @ManyToMany// 多对多
    @JoinTable(
            name = "ref_user_role",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},// joinTable的主键
            inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")}
    )
    private Set<BackRole> roleSet;

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
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
                ", salt='" + salt + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", organizationId=" + organizationId +
                ", locked=" + locked +
                ", roleSet=" + roleSet +
                '}';
    }
}
