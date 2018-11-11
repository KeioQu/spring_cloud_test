package com.example.demo.service;

import com.example.demo.po.UserPO;

public interface UserService {
    public Integer addUser(String idTest,String name,String age);
    public UserPO getUserById(String idTest);
    public String updateUserById(String idTest,String name,String age);
}
