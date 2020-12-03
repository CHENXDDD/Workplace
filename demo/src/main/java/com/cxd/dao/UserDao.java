package com.cxd.dao;

import com.cxd.domian.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User findOne(String name,String password);

    List<User> findAll();
}
