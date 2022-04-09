package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student std = new Student();
        std.firstName = "John";
        std.lastName = "Doe";
        std.age = 45;
        std.dateOfBirth = "01/01/1977";
        std.gender = "male";
        std.address = "Chicago";
        std.weight = 170.5;
        std.height = 5.6;
        std.weight = 5.7;
        std.email = "johndoe@gmail.com";
        std.id = 1001;
        System.out.println(std);

        Student std1 = new Student();
        std1.firstName = "Lionel";
        std1.lastName = "Messi";
        std1.age = 34;
        std1.dateOfBirth = "01/01/1988";
        std1.gender = "male";
        std1.address = "Paris";
        std1.weight = 150.0;
        std1.height = 4.9;
        std1.email = "lionel@gmail.com";
        std1.id = 1002;
        System.out.println(std1);


        Student std2 = new Student();
        std2.firstName = "Alex";
        std2.lastName = "Morgan";
        std2.age = 20;
        std2.gender = "male";
        std2.address = "Chicago";
        std2.dateOfBirth = "01/01/2002";
        std2.weight = 165.0;
        std2.height = 5.5;
        std2.email = "alex@gmail.com";
        std2.id = 1003;
        System.out.println(std2);

        Student std3 = new Student();
        std3.firstName = "Jessie";
        std3.lastName = "Smith";
        std3.age = 15;
        std3.gender = "female";
        std3.address = "Miami";
        std3.dateOfBirth = "01/01/2007";
        std3.weight = 160.0;
        std3.height = 5.7;
        std3.email = "jessie@gmail.com";
        std3.id = 1004;
        System.out.println(std3);

        Student std4 = new Student();
        std4.firstName = "Kaly";
        std4.lastName = "Ngo";
        std4.age = 16;
        std4.gender = "female";
        std4.address = "Berlin";
        std4.dateOfBirth = "01/01/2006";
        std4.weight = 150.0;
        std4.height = 5.3;
        std4.email = "kaly@gmail.com";
        std4.id = 1005;
        System.out.println(std4);

        List<Student> myStudents = new ArrayList<>();
       myStudents.add(std);
        myStudents.add(std1);
        myStudents.add(std2);
        myStudents.add(std3);
        myStudents.add(std4);

        System.out.println("\n\n---------------------------------------");

        int counter = 0;
        for (Student  st : myStudents) {
            if(st.address.equals("Chicago")) counter++;

        }
        System.out.println(counter);
        System.out.println("\n\n---------------------------------------");

        int counterGender = 0;
        int counterGenderMale = 0;
        int teen = 0;
        for (Student  st : myStudents) {
            if(st.gender.equals("female")) counterGender++;
            if(st.gender.equals("male")) counterGenderMale++;
            if(st.age >= 13 && st.age <= 19) teen++;

        }
         System.out.println(counterGender);
        System.out.println((counterGenderMale));
        System.out.println(teen);


        System.out.println("\n\n---------------------------------------");
        for (Student myStudent : myStudents) {
            System.out.println("\n");
            System.out.println(myStudent);
        }
        /*
        TASK-4
        Print all information of each student in separate lines
         */

        System.out.println("\n-------TASK-4----------\n");

        myStudents.forEach(student -> {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.height);
            System.out.println(student.email);
            System.out.println(student.id);
            System.out.println();
        });

    }












    }

