package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UppercaseconverterTest {
    Uppercaseconverter upper;

    @Before
    public void setUp() throws Exception {
        upper=new Uppercaseconverter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void uppercaseConversion()
    {
    String result=upper.uppercaseConversion();
        assertEquals("DEEPA", result);
    }

    @Test
     public void checkNull()
      {
    boolean result=upper.checkNull();
    assertEquals(true, result);
      }
       }