package com.dsq.service.impl;

import com.dsq.dao.UserDao;
import com.dsq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        this.userDao.saveUser();
    }
}
