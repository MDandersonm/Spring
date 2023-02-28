package com.example.demo.domain.lectureTest.controller;

import com.example.demo.domain.lectureTest.entity.TestMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로그
@RestController//데이터를 무조건 제이슨처리
@RequestMapping("/spring-2nd")
public class LectureTestController {

    @GetMapping("/first")
    public String helloSpring () {
        log.info("helloSpring(): 이거 왜 안돼 ?");

        return "Hello Spring";
    }

    @GetMapping("/second")
    public String helloSpring2 () {
        return "Hello Test";
    }

    @GetMapping("/third")
    //레스트컨트롤러에의해 TESTMEMber를 받아서.. 제이슨으로 출력해주는거
    public TestMember returnEntityTest () {
        TestMember testMember =
                new TestMember(1L, "hi", 7L);

        return testMember;
    }
}
