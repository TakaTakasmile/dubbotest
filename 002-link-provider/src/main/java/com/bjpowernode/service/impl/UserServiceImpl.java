package com.bjpowernode.service.impl;

import com.bjpowernode.entity.User;
import com.bjpowernode.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        return user;
    }

    @Override
    public int countUser() {
        return 54;
    }

}
