package com.bezsden.tasks;

import java.util.*;
import java.util.stream.Collectors;


public class Methods {



    public List<String> sortAsc(List<String> list) {
        return   list.stream().sorted().collect(Collectors.toList()); // it sorts it and saves it

    }
    public List<People> sortAscP(List<People> list) {
        return   list.stream().sorted().collect(Collectors.toList()); // it sorts it and saves it
    }
    public List<People> sortPeopleBySexAndName (List<People> list) {
        return   list.stream().sorted(new PeopleComparator()).collect(Collectors.toList());
        //Collections.sort(list, new PeopleComparator());
    }

    public void removeDuplicates(List<String> list) {
        List<String> noDuplicatresList = new ArrayList<>(new HashSet<>(list));
       list.clear();
       list.addAll(noDuplicatresList);
    }
    public void sortDsc(List<String> list) {
         Collections.sort(list, Collections.reverseOrder());
    }
    public void sortAscNoDuplicates(List<String> list) {
        sortAsc(list);
        removeDuplicates(list);

    }
    public void sortDscNoDuplicates(List<String> list) {

        removeDuplicates(list);
        sortDsc(list);

    }
    }

