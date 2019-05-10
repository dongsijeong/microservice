package com.dsq.service;

import com.dsq.domain.Users;

import java.util.List;

public interface UsersService {

    List<Users> findUsersAll();

    Users findUserById(Integer id);

    void addUser(Users users);

    void updateUser(Users users);

    void deleteUserById(Integer id);
}
