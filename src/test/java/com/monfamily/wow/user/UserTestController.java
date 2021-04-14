package com.monfamily.wow.user;

import com.monfamily.wow.model.UserVO;
import com.monfamily.wow.repository.IUserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTestController {
    @Autowired
    IUserMapper mapper;

    @Test
    public void userAddTest(){
        UserVO user = new UserVO();
        user.setUserId("qwer12");
        user.setUserPw("123");
        user.setUserName("홍길동");
        user.setUserMail("qwer12@gmail.com");
        user.setUserContact(1012345678);
        mapper.userAdd(user);
    }

}
