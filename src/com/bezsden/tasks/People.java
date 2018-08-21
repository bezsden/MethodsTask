package com.bezsden.tasks;

import java.util.Comparator;

enum Sex {
    MAN,
    WOMEN
}


public class People implements Comparable<People>{
    private final String name;
    private final Integer age;
    private final Sex sex;

    public People(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }


    //@Override
    public int compareTo(People o) {

        return this.getName().compareTo(o.getName()) ;
    }



}
