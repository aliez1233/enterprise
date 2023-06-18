package com.my.service;

import com.my.vo.User;

public interface UserService {
    public User findUser(String username,String password);
}
