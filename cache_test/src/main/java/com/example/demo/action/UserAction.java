package com.example.demo.action;

import com.example.demo.po.UserPO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/test")
    public String test(){
        return "test";
    }

    @GetMapping(path = "/user/{id}")
    public UserPO getUser(@PathVariable String id){
        UserPO userPO = null;
        long startTime = System.currentTimeMillis();
        userPO = userService.getUserById(id);
        System.out.println(System.currentTimeMillis()-startTime);
        return userPO;
    }

    @GetMapping(path = "/update")
    public String updateUserById(@RequestParam String id, @RequestParam String name, @RequestParam String age){
        String msg = null;
        long startTime = System.currentTimeMillis();
        msg = userService.updateUserById(id,name,age);
        System.out.println(System.currentTimeMillis()-startTime);
        return msg;
    }
}
