package com.monfamily.wow.dto;

import com.monfamily.wow.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
public class UserDTO {

    private Long id;
    private String userId;
    private String userPw;
    private String userName;
    private String userMail;
    private Integer userContact;
    private LocalDateTime regDate;
    private LocalDateTime lastLogin;
    private boolean autoLogin;

    @Builder
    public UserDTO(Long id, String userId, String userPw, String userName, String userMail, Integer userContact, LocalDateTime regDate, LocalDateTime lastLogin, boolean autoLogin) {
        this.id = id;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userMail = userMail;
        this.userContact = userContact;
        this.regDate = regDate;
        this.lastLogin = lastLogin;
        this.autoLogin = autoLogin;
    }













    public User toEntity(){
        return User.builder()
                .id(id)
                .userId(userId)
                .userPw(userPw)
                .userName(userName)
                .userMail(userMail)
                .userContact(userContact)
                .lastLogin(lastLogin)
                .autoLogin(autoLogin)
                .build();
    }

}
