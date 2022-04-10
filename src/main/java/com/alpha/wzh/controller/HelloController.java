package com.alpha.wzh.controller;

import com.alpha.wzh.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-07 16:22
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    @Resource
    private Car car;

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }


    @RequestMapping("/word")
    public Car word(){
        return car;
    }
}
