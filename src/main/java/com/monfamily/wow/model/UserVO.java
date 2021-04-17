package com.monfamily.wow.model;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;


@Getter
@ToString
public class UserVO {


    private Integer userNum;
    private String userId;
    private String userPw;
    private String userName;
    private String userMail;
    private Integer userContact;
    private Date regDate;
    private Date lastLogin;
    private boolean autoLogin;








    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserVO userVO = (UserVO) o;

        if (autoLogin != userVO.autoLogin) return false;
        if (!userNum.equals(userVO.userNum)) return false;
        if (!userId.equals(userVO.userId)) return false;
        if (!userPw.equals(userVO.userPw)) return false;
        if (!userName.equals(userVO.userName)) return false;
        if (!userMail.equals(userVO.userMail)) return false;
        if (userContact != null ? !userContact.equals(userVO.userContact) : userVO.userContact != null) return false;
        if (regDate != null ? !regDate.equals(userVO.regDate) : userVO.regDate != null) return false;
        return lastLogin != null ? lastLogin.equals(userVO.lastLogin) : userVO.lastLogin == null;
    }

    @Override
    public int hashCode() {
        int result = userNum.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + userPw.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + userMail.hashCode();
        result = 31 * result + (userContact != null ? userContact.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (autoLogin ? 1 : 0);
        return result;
    }
}
