package com.crpower.dao;

import com.crpower.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
