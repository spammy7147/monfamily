package com.monfamily.wow.user;

import com.monfamily.wow.dto.BoardDTO;
import com.monfamily.wow.entity.User;
import com.monfamily.wow.repository.BoardRepository;
import com.monfamily.wow.repository.UserRepository;
import com.monfamily.wow.service.IBoardService;
import com.monfamily.wow.service.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EntityTest {
    @Autowired
    IBoardService boardService;
    @Autowired
    IUserService userService;
    @Autowired
    BoardRepository boardRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void addUser(){
        User user = User.builder()
                    .userId("qwer12")
                    .userPw("1234")
                    .userName("홍길동")
                    .userMail("spammy@gmail.com")
                    .userContact(1085928698)
                    .build();
        userRepository.save(user);
    }

    @Test
    public void addBoard(){
       User user =  userRepository.findById((long)21).orElseThrow(()->new IllegalArgumentException("못찾음! user="+21));
        System.out.println(user);
        boardRepository.save(
        BoardDTO.builder()
                .writer(user)
                .title("안녕하세요")
                .content("테스트입니다")
                .build()
                .toEntity());



        /*
        CONSTRAINT FK_writer FOREIGN KEY (writer)
        REFERENCES monfamily_user(user_id)
        규제 : FK_writer 라는 외래키
        wirter 의컬럼은
        monfamily_user 라는 테이블의 user_id를 참조한다

        @JoinColumn(name="writer", nullable = false, referencedColumnName = "user_id")
        이 field 의 column 이름은 writer 이고 user_id를 참조한다
         */

    }

}
