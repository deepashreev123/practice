package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    Even number;

    @Before
    public void setUp() throws Exception {

        number = new Even();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkGivenAnEvenNumberReturnsJerry() {
        String result = number.checkEven(20);
        assertEquals("Jerry", result);
    }


       @Test
       public void checkGivenAnOddNumberReturnsTom() {
           String res = number.checkEven(21);
           assertEquals("Tom", res);
       }
       @Test
    public void checkGivenOutOfRangeValueReturnsErrorMessge()
       {
           String res = number.checkEven(19);
           assertEquals("enter valid integer value between 20 and 30", res);

    }

 /*   public String  checkRange() {
        String res = n.checkRange();
        assertEquals("True", res);
        return res;
    }*/

}