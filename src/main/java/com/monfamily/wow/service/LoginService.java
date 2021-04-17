package com.monfamily.wow.service;

import com.monfamily.wow.model.UserVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginService implements ILoginService{


    @Override
    public void userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void userLogout(Integer userNum) {

    }
}
