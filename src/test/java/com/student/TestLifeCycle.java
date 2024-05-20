package com.student;

import org.junit.jupiter.api.*;

public class TestLifeCycle {
    // execute only once, in the starting
    @BeforeAll
    public static void beforeClass() {
        System.out.println("in before class");
    }
    // execute only once, in the end
    @AfterAll
    public static void afterClass() {
        System.out.println("in after class");
    }
    // execute for each test, before executing test
    @BeforeEach
    public void before() {
        System.out.println("in before");
    }

    // execute for each test, after executing test
    @AfterEach
    public void after() {
        System.out.println("in after");
    }
    // test case 1
    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }
    // test case 2
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}
