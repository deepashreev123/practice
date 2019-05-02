package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkPalindrome() {
        palindrome p=new palindrome();

        int result=p.checkPalindrome();

        assertEquals(1, result);
       // assertEquals(0, result);

    }
}