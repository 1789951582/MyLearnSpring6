package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.dao.UserDaoImplforMySQL;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstSpringTest {

    @Test
    public void testBeginInitBean(){
        //注意：不是在调用getBean()方法的时候创建对象，执行以下代码的时候，就会实例化对象
        new ClassPathXmlApplicationContext("spring6.xml");

        //你自己要怎么去使用log4j2记录日志信息呢？
        // 第一步：创建日志记录器对象
        // 获取FirstSpringTest类的日志记录器对象，也就是说只要是FirstSpringTest类中的代码执行记录日志的话，就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);

        //第二步：记录日志，根据不同的级别来输出日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");

    }

    @Test
    public void testBeanFactory(){
        //ApplicationContext接口的超级父接口是：BeanFactory（翻译为Bean工厂，就是能够生产Bean对象的一个工厂对象。）
        //BeanFactory是IoC容器的顶级接口
        //Spring的IoC容器底层实际上使用了：工厂模式。
        //Spring底层的IoC是怎么实现的？XML解析 + 工厂模式 + 反射机制
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        User userBean = applicationContext.getBean("UserBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testXmlPath(){
//        FileSystemXmlApplicationContext 不是从类路径当中加载资源
//        这种方式很少用，了解即可
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("d:/spring6.xml");
        User userBean = fileSystemXmlApplicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testFirstSpringCode(){
        //第一步：获取Spring容器对象
        //ApplicationContext 翻译为：应用上下文。其实就是Spring容器
        //ApplicationContext是一个接口。
        //ApplicationContext接口下有很多实现类。其中有一个实现类ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个Spring上下文对象
        //这行代码只要执行：就相当于启动了Spring容器，解析spring.xml文件,并且实例化所有的bean对象，放到spring容器中
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml","beans.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml","beans.xml","xml/beans.xml");

        //第二步：根据bean的id从Spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

//        Object userDaoBean = applicationContext.getBean("userDaoBean");
        UserDaoImplforMySQL userDaoBean = applicationContext.getBean("userDaoBean", UserDaoImplforMySQL.class);
        System.out.println(userDaoBean);

        Object vipBean = applicationContext.getBean("vipBean");
        System.out.println(vipBean);

        Object userBean2 = applicationContext.getBean("userBean2");
        System.out.println(userBean2);

//        如果bean的id不存在，不会返回null，而是出现异常。
//        Object nowTime = applicationContext.getBean("nowTime");
//        Date nowTime = (Date) applicationContext.getBean("nowTime");
//        不想强制类型转换，可以使用以下代码
//        System.out.println(nowTime);
        Date nowTime = applicationContext.getBean("nowTime", Date.class);
        //日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strNowTime = simpleDateFormat.format(nowTime);
        System.out.println(strNowTime);

    }

}
