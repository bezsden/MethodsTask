package com.bezsden.tasks;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MethodsTest {
    Methods methodsUtil = new Methods();
    List<String> list = new ArrayList<>();

    @Before
    public void testInit() {
        list.add("a1");
        list.add("a4");
        list.add("a3");
        list.add("a2");
        list.add("a1");
        list.add("a4");

    }

    @Test
    public void testSortAsc() {
        List<String> expectedList = Arrays.asList("a1", "a1", "a2", "a3", "a4", "a4");
        methodsUtil.sortAsc(list);
        assertEquals(expectedList, list);
    }

    @Test
    public void testDuplicates() {

        List<String> expectedList = Arrays.asList("a1", "a2", "a3",  "a4");
        methodsUtil.removeDuplicates(list);
        assertEquals(expectedList, list);
        assertEquals(4, list.size());
    }

}