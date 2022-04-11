package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Alexandra", 4.35);
        Student s2 = new Student("Mihai", 4.49);
        Student s3 = new Student("Bianca", 4.5);
        Student s4 = new Student("Alex", 10);

        Catalog catalog = new Catalog();
        catalog.addStudent(s1);
        catalog.addStudent(s2);
        catalog.addStudent(s3);
        catalog.addStudent(s4);

        System.out.println(catalog);


    }
}
