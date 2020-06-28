package com.itcast.service;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /*
    * queryById
    * */
    @Transactional
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
