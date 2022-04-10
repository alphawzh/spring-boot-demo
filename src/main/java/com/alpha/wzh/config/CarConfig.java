package com.alpha.wzh.config;

import com.alpha.wzh.pojo.Car;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-08 16:24
 * @since JDK 1.8
 */
@Configuration
@EnableConfigurationProperties(Car.class)
//1、开启Car配置绑定功能
//2、把这个Car这个组件自动注册到容器中
public class CarConfig {
}
