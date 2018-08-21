package com.bezsden.tasks;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class Methods {
    // constructor  TBDL
    public Methods() {
    }

    public void sortAsc(List<String> list) {
        Collections.sort(list); // it sorts it and saves it
    }

    public void removeDuplicates(List<String> list) {
        List<String> noDuplicatresList = new ArrayList<>(new HashSet<>(list));
        list=noDuplicatresList;

      //List<String> newList=new HashSet<>((HashSet<String>)list);
        //list=(List<String>) newList;
    }

    }

