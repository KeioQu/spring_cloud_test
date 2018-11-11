package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.UserPO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static java.lang.System.currentTimeMillis;

@Service
@CacheConfig(cacheNames = "userCache")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer addUser(String idTest, String name, String age) {
        return null;
    }

    @Override
    @Cacheable(key = "#idTest")
    public UserPO getUserById(String idTest) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.getUserPoById(idTest);
    }

    @Override
    @CacheEvict(key = "#idTest")
    public String updateUserById(String idTest, String name, String age) {
        UserPO userPO = new UserPO();
        userPO.setIdTest(idTest);
        userPO.setName(name);
        userPO.setAge(new Integer(age));
        userMapper.updateUser(userPO);
        return "ok";
    }
}
