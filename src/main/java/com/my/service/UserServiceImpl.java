package com.my.service;

import com.my.dao.UserDao;
import com.my.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(String username,String password){
        User user=this.userDao.findUser(username,password);
        return user;
    }
}
