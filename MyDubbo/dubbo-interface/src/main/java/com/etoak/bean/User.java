package com.etoak.bean;

import java.io.Serializable;

/**
 * Created by li2xdd on 2018/12/19/0019.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
