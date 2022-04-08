package com.alpha.wzh;

import com.alpha.wzh.config.MyConfig;
import com.alpha.wzh.pojo.Pet;
import com.alpha.wzh.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author alphawzh
 * @Description Created with IDEA
 * @create: 2022-04-07 16:23
 * @since JDK 1.8
 */
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BootApplication.class, args);


       /* Pet pet1 = run.getBean("pet", Pet.class);

        Pet pet2 = run.getBean("pet", Pet.class);
        System.out.println("组件：" + (pet1 == pet2));

        // com.alpha.wzh.config.MyConfig$$EnhancerBySpringCGLIB$$de0ddb1b@2aa27288
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user();
        User user1 = bean.user();
        System.out.println(user == user1);

        User user01 = run.getBean("user", User.class);
        Pet tom = run.getBean("pet", Pet.class);
        System.out.println("用户的宠物："+(user01.getPet() == tom));*/

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user01 = run.containsBean("user");
        System.out.println("容器中user组件："+user01);

        boolean tom22 = run.containsBean("pet");
        System.out.println("容器中pet组件："+tom22);

    }
}
