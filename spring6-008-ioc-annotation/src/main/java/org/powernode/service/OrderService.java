package org.powernode.service;

import org.powernode.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //AutoWired注解使用的时候，不需要指定任何属性，直接用这个注解即可。
    // 这个注解的作用是根据类型byType进行自动装配。
//    @Autowired
//    private OrderDao orderDao;

//    如果想解决以上问题，只能根据名字进行装配
//    @Autowired和@Qualifier联合使用，可以根据名字进行装配

    @Autowired
//    @Qualifier("orderDaoImplForOracle")
    @Qualifier("orderDaoImplForMySQL")
    private  OrderDao orderDao;

    public void generate(){
        orderDao.insert();
    }
}
