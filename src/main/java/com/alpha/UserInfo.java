package com.alpha;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-08 16:02
 * @since JDK 1.8
 */
@Component
public class UserInfo implements Serializable {
    public String name;

    private String age;

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
