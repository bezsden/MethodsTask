package com.bezsden.tasks;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class Methods<E> {
    // constructor  TBDL
    public Methods() {
    }

    public void sortAsc(List<E> list1) {
        Collections.sort(list1); // it sorts it and saves it
    }

    public void removeDuplicates(List<E> list) {
        List<E> noDuplicatresList = new ArrayList<>(new HashSet<>(list));
       list.clear();
       list.addAll(noDuplicatresList);
    }
    public void sortDsc(List<E> list) {
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

