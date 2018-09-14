package com.yijiupi.login.service.impl;

import com.yijiupi.login.dao.UserDao;
import com.yijiupi.login.entity.UserPO;
import com.yijiupi.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:吴宸煊
 * @Date: Created in 13:43 2018/1/17
 * @Description:实现用户service
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * @Description:用户注册
     * @param: userPO
     * @return:
     */
    @Override
    public void save(UserPO userPO) {
        userDao.insert(userPO);
    }

    /**
     * @Description:
     * @param: name
     * @param password
     * @return:UserPO
     */
    @Override
    public UserPO getUser(String name, String password) {
        return userDao.getUser(name,password);
    }

    @Override
    public UserPO getName(String name) {
        return userDao.getName(name);
    }

}
