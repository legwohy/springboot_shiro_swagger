package com.shiro.entirty;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.util.Set;

/**
 * 系统资源
 */
@Entity
@Table(name = "sys_resource")
@Alias("Resource")
public class Resource {
    @Id @GeneratedValue(generator = "UUID") private Integer id;

    private String url;// url
    private String name;// 资源名称
    private String description;
    private Integer parentId;
    private String permission;
    private Integer available;



    public Resource() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parentId=" + parentId +
                ", permission='" + permission + '\'' +
                ", available=" + available +
                '}';
    }
}
