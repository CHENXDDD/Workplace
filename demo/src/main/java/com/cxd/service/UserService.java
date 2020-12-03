package com.cxd.service;


import com.cxd.domian.User;

import java.util.List;

public interface UserService {

    void save(User user);

    User findOne(String name,String password);

    List<User> findAll();
}
