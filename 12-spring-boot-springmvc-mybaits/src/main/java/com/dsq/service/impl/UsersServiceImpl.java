package com.dsq.service.impl;

import com.dsq.mapper.UsersMapper;
import com.dsq.domain.Users;
import com.dsq.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
    this.usersMapper.insertUser(users);
    }
}
