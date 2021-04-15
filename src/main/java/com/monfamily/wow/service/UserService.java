package com.monfamily.wow.service;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.repository.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    IUserMapper mapper;

    @Autowired
    public void setMapper(IUserMapper mapper) {
        this.mapper = mapper;
    }

    //회원가입
    @Override
    public void userAdd(UserVO user) {
        mapper.userAdd(user);
    }
}
