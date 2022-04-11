package com.company;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Catalog {
    private HashMap<Integer, TreeSet<Student>> catalog;

    public Catalog() {
        catalog = new HashMap<>();
        for( int i = 0; i <=10; i++)
            catalog.put(i, new TreeSet<>(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return Double.compare(o2.getGrade(), o1.getGrade());
                }
            }));
    }
    void addStudent( Student s){
        catalog.get((int)Math.round(s.getGrade())).add(s);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalog=" + catalog +
                '}';
    }
}
