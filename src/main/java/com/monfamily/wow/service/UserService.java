package com.monfamily.wow.service;

import com.monfamily.wow.dto.UserDTO;
import com.monfamily.wow.model.UserVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserService implements IUserService{

    @Override
    public void userCreate(UserDTO user) {

    }

    @Override
    public void userDelete(UserDTO user) {

    }

    @Override
    public void userUpdate(UserDTO user) {

    }

    @Override
    public void UserRead(UserDTO user) {

    }

    @Override
    public void userLogin(UserVO user, HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void userLogout(Integer userNum) {

    }
}
