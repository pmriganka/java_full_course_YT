package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

   @Test 
   void test() {

        ReverseString rstr = new ReverseString();

        assertEquals("olleh",rstr.reverseString("hello"));
        assertEquals("eruliaF",rstr.reverseString("Failure"));


    }
       
}