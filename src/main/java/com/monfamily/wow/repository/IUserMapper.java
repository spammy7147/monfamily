package com.monfamily.wow.repository;

import com.monfamily.wow.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper {

    //회원가입
    void userAdd(UserVO user);
}
