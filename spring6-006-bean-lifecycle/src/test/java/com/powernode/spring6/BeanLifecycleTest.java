package com.powernode.spring6;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {

    /**
     * Spring容器只对singleton的Bean进行完整的生命周期管理。
     * 如果是prototype作用域的Bean，Spring容器只负责将该Bean初始化完毕，等客户端程序一旦获取到该Bean之后，Spring容器就不再管理该对象的生命周期了
     */

    @Test
    public void testBeanLifecycleFive(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步：使用Bean：" + user);
        //必须手动关闭Spring容器，这个Spring容器才会销毁Bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
