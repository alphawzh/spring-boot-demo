package com.alpha.wzh.config;

import com.alpha.wzh.pojo.Pet;
import com.alpha.wzh.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 * Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 * Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 * 组件依赖必须使用Full模式默认。其他默认是否Lite模式
 * 配置类组件之间无依赖关系用Lite模式加速容器启动过程，减少判断
 * 配置类组件之间有依赖关系，方法会被调用得到之前单实例组件，用Full模式
 *
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-08 15:25
 * @since JDK 1.8
 */
@Configuration(proxyBeanMethods = true)
@ConditionalOnMissingBean(name = "tom")
public class MyConfig {

    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     */
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user() {
        User user = new User("alphawzh", 23);
        user.setPet(pet());
        return user;
    }

    @Bean
    public Pet pet() {
        Pet pet = new Pet("tomcat");
        return pet;
    }
}
