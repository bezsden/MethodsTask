package com.bezsden.tasks;

import java.util.Comparator;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(age, people.age) &&
                sex == people.sex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
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
