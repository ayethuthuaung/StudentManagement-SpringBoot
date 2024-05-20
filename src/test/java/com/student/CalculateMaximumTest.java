package com.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateMaximumTest {
    @Test
    public void testFindMax() {
        CalculateMaximum obj = new CalculateMaximum();
        assertEquals(2, obj.findMax(new int[] { 1,-1,0,2}));
       assertEquals(-1, obj.findMax(new int[] { -12, -1, -3, -4, -2 }));
    }
}
