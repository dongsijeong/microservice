package com.dsq.dao.impl;

import com.dsq.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("insert into users......");
    }
}
