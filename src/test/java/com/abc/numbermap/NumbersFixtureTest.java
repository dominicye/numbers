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
        numbers = new Numbers();
    }

    @Test
    public void testNumbersCombain() {
        List resList9 = numbers.getCombainedStr("9", new ArrayList<>());
        List<String> expectedResultNumber9 = Arrays.asList("w", "x", "y", "z");
        assertEquals(expectedResultNumber9,resList9);

        List resList23 = numbers.getCombainedStr("23", new ArrayList<>());
        List<String> expectedResultNumber23 = Arrays.asList("ad" , "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expectedResultNumber23,resList23);

        List resList47 = numbers.getCombainedStr("47", new ArrayList<>());
        List<String> expectedResultNumber47 = new ArrayList<>(){{
            add("gp");add("gq");add("gr");add("gs");
            add("hp");add("hq");add("hr");add("hs");
            add("ip");add("iq");add("ir");add("is");
        }};
        assertEquals(expectedResultNumber47,resList47);
    }

}
