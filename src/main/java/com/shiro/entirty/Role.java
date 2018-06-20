package com.shiro.entirty;


import javax.persistence.*;
import java.util.Set;

/**
 * 系统角色
 */
@Entity
@Table(name = "sys_role")
public class Role {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column private String role;
    @Column(name = "role_parent_id") private Integer roleParentId;
    @Column private String description;
    @Column private Integer available;

    @ManyToMany(
            cascade = {CascadeType.PERSIST},
            fetch = FetchType.LAZY// 懒加载
    )
    @JoinTable(
            name = "ref_user_role",
            joinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")}
    )
    private Set<User> userSet;

    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY) private Set<UserRole> userRoleSet;

    @ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "ref_role_resource",
            joinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "resource_id",referencedColumnName = "id")}
    )
    private Set<Resource> resourceSet;

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Set<Resource> getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(Set<Resource> resourceSet) {
        this.resourceSet = resourceSet;
    }

    public Set<UserRole> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<UserRole> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", roleParentId=" + roleParentId +
                ", description='" + description + '\'' +
                ", available=" + available +
                ", userSet=" + userSet +
                ", resourceSet=" + resourceSet +
                '}';
    }
}
