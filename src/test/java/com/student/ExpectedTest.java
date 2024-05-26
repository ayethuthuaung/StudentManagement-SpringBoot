package com.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpectedTest {
    @Test
    void checkExpected() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> testDivided(1, 0));
        assertEquals("/ by zero", exception.getMessage());
        assertTrue(exception.getMessage().contains("zero"));
    }
    Expected expected = new Expected();
    public int testDivided(int a, int b) {
        return expected.divided(a,b);
    }
}
