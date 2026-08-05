package com.meta.springprepare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator(); // 계산기 인스턴스(=객체) 생성
        Double result = calculator.operate(8, "+", 2); // = 10

        System.out.println("result = " + result);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);

        System.out.println("result = " + result);
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("나누기(0) 테스트")
    void test21() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 0);

        System.out.println("result = " + result);
        Assertions.assertEquals(null, result);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void test3() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "*", 2);

        System.out.println("result = " + result);
        Assertions.assertEquals(16, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test4() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "-", 2);

        System.out.println("result = " + result);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("잘못된 연산자 테스트")
    void test5() {
        Calculator calculator = new Calculator();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.operate(8, "%", 2)
        );

        assertEquals("잘못된 연산자입니다.", exception.getMessage());
    }
}