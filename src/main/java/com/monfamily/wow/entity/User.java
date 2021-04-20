package com.monfamily.wow.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity(name = "monfamily_user")
@Getter
@ToString
@SequenceGenerator(
        name = "monfamily_user_seq",
        sequenceName = "monfamily_user_seq",
        initialValue = 1,
        allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monfamily_user_seq")
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "user_id", unique = true, nullable = false)
    private String userId;
    @NotNull
    @Column(name = "user_pw")
    private String userPw;
    @NotNull
    @Column(name = "user_name")
    private String userName;
    @NotNull
    @Column(name = "user_mail")
    private String userMail;
    @NotNull
    @Column(name = "user_contact")
    private Integer userContact;
    @Column(name = "auto_login")
    private boolean autoLogin;
    @Column(name = "Last_login")
    private LocalDateTime lastLogin;

    @Builder
    public User(Long id, String userId, String userPw, String userName, String userMail, Integer userContact, LocalDateTime lastLogin, boolean autoLogin) {
        this.id = id;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userMail = userMail;
        this.userContact = userContact;
        this.lastLogin = lastLogin;
        this.autoLogin = autoLogin;
    }
}
