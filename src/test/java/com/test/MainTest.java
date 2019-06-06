package com.test;

import org.junit.Test;


import static com.test.Main.getSortedEvenNumbers;
import static com.test.Main.getSortedEvenNumbers2;
import static org.junit.Assert.*;

public class MainTest {

    private static String test1 = "1;2;3;4;5";
    private static String test2 = "1;3;5";
    private static String test3 = null;
    private static String test4 = "";
    private static String test5 = "1;4;3f";


    @Test
    public void getSortedEvenNumbersTest() {
        int[] numbers = getSortedEvenNumbers(test1);
        assertEquals(2, numbers.length);
        assertEquals(2, numbers[0]);
        assertEquals(4, numbers[1]);
    }

    @Test
    public void getSortedEvenNumbers2Test() {
        int[] numbers = getSortedEvenNumbers2(test1);
        assertEquals(2, numbers.length);
        assertEquals(2, numbers[0]);
        assertEquals(4, numbers[1]);
    }

    @Test
    public void notEvenNumbersTest() {
        assertEquals(0, getSortedEvenNumbers(test2).length);
        assertEquals(0, getSortedEvenNumbers2(test2).length);
    }

    @Test
    public void nullStringTest() {
        assertEquals(0, getSortedEvenNumbers(test3).length);
    }

    @Test
    public void emptyStringTest2() {
        assertEquals(0, getSortedEvenNumbers(test4).length);
    }

    @Test(expected = NumberFormatException.class)
    public void invalidStringTest() {
        int[] numbers = getSortedEvenNumbers(test5);
    }

    @Test(expected = NumberFormatException.class)
    public void invalidStringTest2() {
        int[] numbers = getSortedEvenNumbers(test5);
    }
}