package com.shiro.entirty;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 * 系统用户
 */
@Entity
@Table(name = "sys_user")
@Alias("User") // mybatis 需要开启别名
public class User {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "username")
    private String userName;
    private String password;
    private String salt;
    private String userMobile;
    private Integer organizationId;
    private Integer locked;

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

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", organizationId=" + organizationId +
                ", locked=" + locked +
                '}';
    }
}
