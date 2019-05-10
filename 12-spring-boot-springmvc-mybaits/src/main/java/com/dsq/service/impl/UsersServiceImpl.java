package com.dsq.service.impl;

import com.dsq.mapper.UsersMapper;
import com.dsq.domain.Users;
import com.dsq.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> findUsersAll() {
        return this.usersMapper.selectUsersAll();
    }

    @Override
    public Users findUserById(Integer id) {
        return this.usersMapper.selectUserById(id);
    }

    @Override
    public void addUser(Users users) {
    this.usersMapper.insertUser(users);
    }

    @Override
    public void updateUser(Users users) {
        this.usersMapper.updateUser(users);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.usersMapper.deleteUserById(id);
    }
}
