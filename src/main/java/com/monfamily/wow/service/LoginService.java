package com.monfamily.wow.service;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.repository.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginService implements ILoginService{

    IUserMapper mapper;

    @Autowired
    public void setMapper(IUserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response) {

        UserVO userCheck = mapper.userLogin(user.getUserId());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(user.getUserPw(),userCheck.getUserPw())){

        HttpSession session = request.getSession();
        Cookie cookie = new Cookie("loginCookie", session.getId());
        response.addCookie(cookie);
        }


    }

    @Override
    public void userLogout(Integer userNum) {

    }
}
