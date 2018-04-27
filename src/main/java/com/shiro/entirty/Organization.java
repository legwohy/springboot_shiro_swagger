package com.shiro.entirty;


import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 * 组织架构
 */
@Entity
@Table(name = "sys_organization")
@Alias("Organization")
public class Organization {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    private String name;
    private Integer parentId;
    private Integer available;


    public Organization() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }


    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", available=" + available +
                '}';
    }
}
