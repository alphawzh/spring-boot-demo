package com.alpha.wzh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-07 16:22
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }
}
