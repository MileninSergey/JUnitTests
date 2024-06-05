package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator ;

    @BeforeEach
    public void create(){
        System.out.println("before");
        calculator = new Calculator();
    }

    @AfterEach
    public void after() {
        System.out.println("after");
    }

    @Test
    public void testPlus(){
        Assertions.assertEquals(15,calculator.plus(10,5));
        System.out.println(calculator);
    }

    @Test
    public void testMinus(){
        Assertions.assertEquals(5,calculator.minus(10,5));
        System.out.println(calculator);
    }

    @Test
    public void counterTest(){
        calculator.minus(10,5);
        System.out.println(calculator);
        Assertions.assertEquals(1,calculator.getOperationCount());
    }



}
