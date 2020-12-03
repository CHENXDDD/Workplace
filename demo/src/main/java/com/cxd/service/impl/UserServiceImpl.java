package com.cxd.service.impl;

import com.cxd.dao.impl.UserDaoImpl;
import com.cxd.domian.User;
import com.cxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;


    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findOne(String name, String password) {
        return userDao.findOne(name, password);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
