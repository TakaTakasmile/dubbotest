package com.bjpowernode.service;

import com.bjpowernode.entity.User;

public interface UserService {

    User queryUser(Integer id);

    int countUser();

}
