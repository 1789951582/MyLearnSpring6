package com.powernode.spring6.test;

import com.powernode.spring6.bean.*;
import com.powernode.spring6.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAnnotationTest {

    @Test
    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
        Order orderBean = applicationContext.getBean("order", Order.class);
        System.out.println(orderBean);
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(studentBean);

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        System.out.println(orderService);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }
}
