package com.example.demo.domain.lectureTest.entity;

import lombok.Data;

@Data //생성자랑 게터세터를 만들어줌
public class TestMember {

    final private Long memberId;
    final private String name;
    final private Long age;
}
