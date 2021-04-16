package com.monfamily.wow.controller;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    ILoginService service;


    //로그인 확인
    @PostMapping
    public String userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response){

        service.userLogin(user, request,response);



        return "login";
    }
    //로그아웃
    @GetMapping("/{userNum}")
    public String userLogout(@PathVariable Integer userNum){

        return "logout";
    }

}
