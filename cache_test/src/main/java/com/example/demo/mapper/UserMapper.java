package com.example.demo.mapper;

import com.example.demo.po.UserPO;

public interface UserMapper {
    public int inserUser(UserPO userPO);
    public UserPO getUserPoById(String idTest);
    public int updateUser(UserPO userPO);
}
