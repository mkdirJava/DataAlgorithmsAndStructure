package com.java.practice;

import com.java.Example;
import org.junit.Test;

import static org.junit.Assert.*;

public class Example_Test {

    private static final String HI = "hi";
    @Test
    public void random_Test(){
        assertTrue(Example.getHi().equals(HI));

    }

}
