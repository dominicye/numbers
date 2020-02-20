package com.abc.numbermap;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class NumbersFixtureTest {

    private Numbers numbers;

    @Before
    public void before() {
        numbers = new Numbers(new ArrayList<>());
    }

    @Test
    public void testNumbersCombain9() {
        int[] numbers9 = new int[]{9};
        List resList9 = numbers.getCombainedStr(numbers9);
        List<String> expectedResultNumber9 = Arrays.asList("w", "x", "y", "z");
        assertEquals(expectedResultNumber9,resList9);
    }

    @Test
    public void testNumbersCombain23() {

        int[] numbers23 = new int[]{2,3};
        List resList23 = numbers.getCombainedStr(numbers23);
        List<String> expectedResultNumber23 = Arrays.asList("ad" , "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expectedResultNumber23,resList23);
    }

    @Test
    public void testNumbersCombain47() {
        int[] numbers47 = new int[]{4,7};
        List resList47 = numbers.getCombainedStr(numbers47);
        List<String> expectedResultNumber47 = new ArrayList<>(){{
            add("gp");add("gq");add("gr");add("gs");
            add("hp");add("hq");add("hr");add("hs");
            add("ip");add("iq");add("ir");add("is");
        }};
        assertEquals(expectedResultNumber47,resList47);
    }

}
