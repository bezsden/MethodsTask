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
    List<People> peopleList=new ArrayList<>();
    Methods methodsUtilPeople = new Methods();


    @Before
    public void testInit() {
        list.add("a1");
        list.add("a4");
        list.add("a3");
        list.add("a2");
        list.add("a1");
        list.add("a4");
        //new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
        //// new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN))
        peopleList.add(new People("Vasya",16,Sex.MAN));
        peopleList.add(new People("Petya",23,Sex.MAN));
        peopleList.add(new People("Lena",42,Sex.WOMEN));
        peopleList.add(new People("Liz",22,Sex.WOMEN));
        peopleList.add(new People("Ivanov Ivan Ivanovich",69,Sex.MAN));

    }

    @Test
    public void testSortAsc() {
        List<String> expectedList = Arrays.asList("a1", "a1", "a2", "a3", "a4", "a4");
        methodsUtil.sortAsc(list);
        assertEquals(expectedList, list);
    }
    @Test
    public void testSortAscP() {
        //List<People> expectedList = Arrays.asList(new People("Vasya", 16, Sex.MAN), new People("Petya", 23, Sex.MAN), new People("Lena", 42, Sex.WOMEN), new People("Ivanov Ivan Ivanovich", 69, Sex.MAN));
       // List<People> expectedList = Arrays.asList(new People("Ivanov Ivan Ivanovich", 69, Sex.MAN), new People("Lena", 42, Sex.WOMEN), new People("Petya", 23, Sex.MAN), new People("Vasya", 16, Sex.MAN));
        List<People> expectedList=new ArrayList<>();
        expectedList.add(new People("Ivanov Ivan Ivanovich",69,Sex.MAN));
        expectedList.add(new People("Lena",42,Sex.WOMEN));
        expectedList.add(new People("Liz",22,Sex.WOMEN));
        expectedList.add(new People("Petya",23,Sex.MAN));
        expectedList.add(new People("Vasya",16,Sex.MAN));
        methodsUtilPeople.sortAscP(peopleList);
        assertEquals(expectedList, peopleList);

    }
    @Test
    public void testPeopleComparator() {
        ;
        List<People> expectedList=new ArrayList<>();
        expectedList.add(new People("Ivanov Ivan Ivanovich",69,Sex.MAN));
        expectedList.add(new People("Lena",42,Sex.WOMEN));
        expectedList.add(new People("Liz",22,Sex.WOMEN));
        expectedList.add(new People("Petya",23,Sex.MAN));
        expectedList.add(new People("Vasya",16,Sex.MAN));
        methodsUtilPeople.sortPeopleByPeople(peopleList);
        assertEquals(expectedList, peopleList);

    }
    @Test
    public void testDuplicates() {

        List<String> expectedList = Arrays.asList("a1", "a2", "a3",  "a4");
        methodsUtil.removeDuplicates(list);
        assertEquals(expectedList, list);
        assertEquals(4, list.size());
    }
    @Test
    public void testSortDsc() {

        List<String> expectedList = Arrays.asList("a4", "a4", "a3", "a2", "a1", "a1");
        methodsUtil.sortDsc(list);
        assertEquals(expectedList, list);
        assertEquals(6, list.size());
    }
    @Test
    public void testSortAscNoDuplicates() {

        List<String> expectedList = Arrays.asList("a1", "a2", "a3",  "a4");
        methodsUtil.sortAscNoDuplicates(list);
        assertEquals(expectedList, list);
        assertEquals(4, list.size());
    }
    @Test
    public void testSortDscNoDuplicates() {

        List<String> expectedList = Arrays.asList("a4", "a3", "a2",  "a1");
        methodsUtil.sortDscNoDuplicates(list);
        assertEquals(expectedList, list);
        assertEquals(4, list.size());
    }

}