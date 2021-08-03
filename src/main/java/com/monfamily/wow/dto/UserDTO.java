package com.monfamily.wow.dto;

import com.monfamily.wow.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
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
