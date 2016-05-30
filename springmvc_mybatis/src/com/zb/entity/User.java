package com.zb.entity;

import java.io.Serializable;

/**
 * 
 * 
 * 作者: zhoubang 
 * 日期：2015年9月25日 上午9:01:37
 */
public class User implements Serializable {
    private static final long serialVersionUID = 4321178667528474490L;

    private int id;
    private String name;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User() {
    }

    public User(int id, String name, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }
}
