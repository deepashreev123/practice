package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {

        Even.Addition a = new Even.Addition();
        int n = a.sum(10,20);
        assertEquals(30, n);

    }}

