package com.alpha.wzh.pojo;

import java.io.Serializable;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-08 15:23
 * @since JDK 1.8
 */
public class User implements Serializable {

    private String name;

    private Integer age;

    private Pet pet;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
