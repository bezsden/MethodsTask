package com.bezsden.tasks;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
         int result= o1.getSex().compareTo(o2.getSex());
        if ( result == 0) {
             return o1.getName().compareTo(o2.getName());

        }
        return result;
    }
}