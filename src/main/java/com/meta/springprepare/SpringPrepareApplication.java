package com.meta.springprepare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrepareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrepareApplication.class, args);
        System.out.println("회원 가입 기능 구현");
        System.out.println("회원 정보 수정 기능 구현");
    }

}

