package com.shiro.entirty;

import javax.persistence.*;
import java.util.Set;

/**
 * 系统资源
 */
@Entity
@Table(name = "sys_resource")
public class BackResource {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column private String permission;
    @Column private Integer available;
    @Column private String description;
    @Column(name = "parent_id") private Integer parentId;

    @ManyToMany(
            fetch = FetchType.LAZY,// 默认懒加载 用于查找同步
            cascade = {CascadeType.ALL}// 增删改同步
    )
    @JoinTable(
            name = "ref_role_resource",
            joinColumns = {@JoinColumn(name = "resource_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")}
    )
    private Set<BackRole> roleSet;
    public BackResource() {
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

    public Set<BackRole> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<BackRole> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "BackResourceMapper{" +
                "id=" + id +
                ", permission='" + permission + '\'' +
                ", available=" + available +
                ", description='" + description + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
