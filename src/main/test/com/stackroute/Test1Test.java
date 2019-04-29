package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringDemo() {
        Test1 s1=new Test1();
        String s=s1.stringDemo();
        assertEquals("DEEPA",s);
    }
}