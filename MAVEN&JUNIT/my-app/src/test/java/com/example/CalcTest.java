package com.example.my_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalcTest {

    @Test
    void testCalc() {
        
        Calc calc = new Calc();
        int actualResult = calc.divide(10, 2);
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

}

