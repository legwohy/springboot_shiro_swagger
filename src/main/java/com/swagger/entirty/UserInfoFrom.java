package com.swagger.entirty;

import javax.persistence.*;

/**
 *
 */
@Entity// 实体
@Table(name = "user_info_from")// 用于表名与列名不一致
public class UserInfoFrom {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Integer id;
    @Column(name = "real_name") private String realName;
    @Column(name = "user_phone") private String userPhone;
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
