package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        Reverse r1 = new Reverse();
        int n = r1.reverse(122);
        assertEquals(221, n);
    }

    @Test
public void checkInt()
    {
        Reverse r2 = new Reverse();
        boolean n = r2.checkInt();
    assertEquals(true,n);
    }
}