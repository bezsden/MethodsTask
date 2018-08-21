package com.bezsden.tasks;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        int z=0;
        switch(o1.getSex().compareTo(o2.getSex())){
            case 1:z=1;break;
            case -1:z=-1;break;
            case 0: z=o1.getName().compareTo(o2.getName());

        }
        return z;
    }
}