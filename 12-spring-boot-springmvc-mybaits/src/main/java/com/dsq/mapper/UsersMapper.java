package com.dsq.mapper;

import com.dsq.domain.Users;

import java.util.List;

public interface UsersMapper {

    List<Users> selectUsersAll();

    Users selectUserById(Integer id);

    void insertUser(Users users);

    void updateUser(Users users);

    void deleteUserById(Integer id);
}
