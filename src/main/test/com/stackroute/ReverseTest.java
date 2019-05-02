package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse reverse;
    @Before
    public void setUp() throws Exception {
         reverse= new Reverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        int n = reverse.reverseInteger(122);
        assertEquals(221, n);
    }

    @Test
public void checkInt()
    {
        boolean n = reverse.checkInt();
    assertEquals(false,n);
    }
}