package com.alpha.wzh.pojo;

import java.io.Serializable;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-08 15:25
 * @since JDK 1.8
 */
public class Pet implements Serializable {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
