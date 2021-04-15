package com.monfamily.wow.controller;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.repository.IUserMapper;
import com.monfamily.wow.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    IUserService service;

    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String userAdd(UserVO user){
        System.out.println("/user/ 요청들어옴 -> GET");

        service.userAdd(user);

        return "joinSuccess";
    }

}
