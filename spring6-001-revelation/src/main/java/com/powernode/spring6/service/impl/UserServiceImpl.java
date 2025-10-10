package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.dao.impl.UserDaoImplForOracle;
import com.powernode.spring6.service.UserService;

public class UserServiceImpl implements UserService {

//    UserDao userDao = new UserDaoImplForMySQL();

    //修改为
    private UserDao userDao = new UserDaoImplForOracle();

    @Override
    public void deleteUser() {
        //删除用户信息逻辑
        userDao.deleteById();
    }

}
