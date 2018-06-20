package com.shiro.entirty;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.util.Set;

/**
 * 系统用户
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String salt;
    private String userMobile;
    private Integer organizationId;
    private Integer locked;

}
