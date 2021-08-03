package com.monfamily.wow.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends TimeEntity{

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String mail;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private Integer userContact;
    @Column
    private boolean autoLogin;
    @Column
    private LocalDateTime lastLogin;

    @Builder
    public User(Long id, String mail, String password, String name, Integer userContact, boolean autoLogin, LocalDateTime lastLogin) {
        this.id = id;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.userContact = userContact;
        this.autoLogin = autoLogin;
        this.lastLogin = lastLogin;
    }
}
