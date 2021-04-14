package com.monfamily.wow.model;

import java.util.Date;

public class UserVO {


    private Integer userNum;
    private String userId;
    private String userPw;
    private String userName;
    private String userMail;
    private Integer userContact;
    private Date regDate;
    private Date lastLogin;


    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Integer getUserContact() {
        return userContact;
    }

    public void setUserContact(Integer userContact) {
        this.userContact = userContact;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userNum=" + userNum +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userContact=" + userContact +
                ", regDate=" + regDate +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
