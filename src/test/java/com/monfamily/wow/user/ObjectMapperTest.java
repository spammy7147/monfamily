package com.monfamily.wow.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ObjectMapperTest {
    TestUser user = new TestUser();


    ObjectMapper objectMapper = new ObjectMapper();

    String json;

    @Test
    public void TestMethod(){

        //Jackson ObjectMapper 이해하기
        //기본생성자는 필수! 만약 생성자를 명시할경우 기본 생성자도 같이 만들어 줘야한다!
        // 세터 아니면 생성자가 있으면 자동으로 찾아서 올려주는거같다
        // 실험 1. 생성자 입력방식 + NO 세터 + NO 기본생성자 => 기본생성자 부재로 오류
        // 실험 2. 생성자 입력방식 + NO 세터 + 기본생성자 => OK
        // 실험 3. 세터 + 기본생성자 => OK
        // 실험 4. 기본생성자 => OK (데이터를 넣을방법이없어서 내부에서 선언 고정적인 데이터)

        try {
            json = objectMapper.writeValueAsString(user);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            System.out.println("objectToJson fail");
        }

        try {
            TestUser jsonToObject = objectMapper.readValue(json,TestUser.class);
            System.out.println(jsonToObject);
        } catch (JsonProcessingException e) {
            System.out.println("jsonToObject fail");
            e.printStackTrace();
        }

    }


}
