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


}
