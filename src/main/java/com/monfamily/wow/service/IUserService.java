package com.monfamily.wow.service;

import com.monfamily.wow.dto.UserDTO;
import com.monfamily.wow.model.UserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IUserService {


    //회원가입
    void userCreate(UserDTO user);

    void userDelete(UserDTO user);

    void userUpdate(UserDTO user);

    void UserRead(UserDTO user);

    //로그인
    void userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response);
    //로그아웃
    void userLogout(Integer userNum);



}
