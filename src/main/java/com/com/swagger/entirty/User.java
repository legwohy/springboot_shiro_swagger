package com.com.swagger.entirty;

/**
 * 实体类
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String address;
    private String realname;
    private String birthday;
    private String userPhone;
    private Integer status;

    public User() {
        super();
    }


    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "BackUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", realname='" + realname + '\'' +
                ", birthday=" + birthday +
                ", userPhone='" + userPhone + '\'' +
                ", status=" + status +
                '}';
    }
}
