package com.monfamily.wow.service;

import com.monfamily.wow.model.UserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ILoginService {

    //로그인
    void userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response);
    //로그아웃
    void userLogout(Integer userNum);

}
