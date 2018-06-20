package com.shiro.entirty;

import javax.persistence.*;
import java.util.Set;

/**
 * 组织架构
 */
@Entity
@Table(name = "sys_organization")
public class Organization {
    @Id @GeneratedValue(generator = "UUID") private Integer id;
    @Column private String name;
    @Column(name = "parent_id") private Integer parentId;
    @Column private Integer available;

    @OneToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "ref_organization_user",
            joinColumns = {@JoinColumn(name = "organization_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")}
    )
    private Set<User> userSet;

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

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", available=" + available +
                ", userSet=" + userSet +
                '}';
    }
}
