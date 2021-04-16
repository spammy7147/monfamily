package com.monfamily.wow.repository;

import com.monfamily.wow.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {

    //회원가입
    void userAdd(UserVO user);
    //단일회원 정보 조회
    UserVO userSelect(String userId);
    //모든 회원 정보 조회
    List<UserVO> userSelectAll();
    // 회원 탈퇴 or 삭제
    void userDelete(String userId);
    //회원 정보 수정
    void userModify(UserVO user);
    //로그인 확인
    UserVO userLogin(String userId);
    //로그아웃
    String userLogout(UserVO user);





}
