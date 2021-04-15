package com.monfamily.wow.controller;

import com.monfamily.wow.repository.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private IUserMapper mapper;

    @GetMapping("/")
    public void userAdd(){


    }

}
