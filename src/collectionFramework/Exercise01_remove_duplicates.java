package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");
        System.out.println("My list before removing = " + objects); //My list before removing = [Computer, Phone, Mouse, Mouse, Phone, Pen]

        ArrayList<String> uniques = new ArrayList<>();
        for (String object : objects) {
            if(!uniques.contains(object)) uniques.add(object);

        }

        System.out.println("My list after removing duplicates with = " + uniques);

        System.out.println("\n---------Converting Arraylist to LinkedHashSet---------\n");
        LinkedHashSet<String> hashSetCollection = new LinkedHashSet<>(objects);
        System.out.println(hashSetCollection); //[Computer, Phone, Mouse, Pen]

       //--->>>  System.out.println(new LinkedHashSet<>(objects)); one short removing all the duplicates
        // printing every element in Set

        for (String value : hashSetCollection) {
            System.out.println(value);
        }
       /*
       Computer
       Phone
       Mouse
       Pen
        */

    }
}
