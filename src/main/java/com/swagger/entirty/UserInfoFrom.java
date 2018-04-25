package com.swagger.entirty;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 *
 */
@Entity// 实体
@Table(name = "user_info_from")// 用于表名与列名不一致
public class UserInfoFrom {
    /**
     * 注意@GeneratedValue配置只允许以下几种形式:
     1.全部数据库通用的@GeneratedValue(generator="UUID")
     2.useGeneratedKeys的@GeneratedValue(generator=\"JDBC\")
     3.类似mysql数据库的@GeneratedValue(strategy=GenerationType.IDENTITY[,generator="Mysql"])
     */
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "user_phone")
    private String userPhone;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfoFrom{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", status=" + status +
                '}';
    }
}
