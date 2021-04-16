package com.monfamily.wow.controller;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    IUserService service;

    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    @PostMapping("/")
    public String userAdd(@RequestBody UserVO user){
        System.out.println("/user/ 요청들어옴 -> POST");
        System.out.println(user);
        service.userAdd(user);

        return "joinSuccess";
    }

    @GetMapping("/{userId}")
    public String userSelect(@PathVariable String userId){
        System.out.println(userId + "GET Mapping 요청 들어옴!");
        return "한명의 회원정보 검색";
    }

    @GetMapping("/")
    public String userSelect(){

        return "전체 회원정보 검색";
    }
    @DeleteMapping
    public String userDelete(){

        return "회원 탈퇴";
    }

    @PutMapping
    public String userModify(){
        return "회원 정보 수정";
    }

    @PostMapping("/loginCheck")
    public String testWork(){
        System.out.println("POST MAPPING 요청 들어옴");
        return "testsuccess";
    }



}
