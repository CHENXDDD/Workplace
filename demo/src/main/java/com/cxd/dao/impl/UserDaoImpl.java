package com.cxd.dao.impl;

import com.cxd.dao.UserDao;
import com.cxd.domian.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findOne(String name, String password) {
        User userTmp = new User();
        userTmp.setUsername(name);
        userTmp.setPassword(password);

        for (User user : users) {
            if (user.matchUsernameAndPassword(name, password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    public UserDaoImpl() {
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("zhangsan");
        user1.setPassword("123");


        User user2 = new User();
        user2.setId(2);
        user2.setUsername("lisi");
        user2.setPassword("123");

        users.add(user1);
        users.add(user2);
    }
}
