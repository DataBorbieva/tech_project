package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        System.out.println("\n---------------TreeSet Integer numbers--------------\n");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        System.out.println(numbers); //[1, 2, 3, 5]
        //we use it when we need sort it, with numbers its ascending order

    // -->    numbers.add(null); //  this line will throw NullPointerException
        //we can not add null in TReeSet
        System.out.println("\n---------------TreeSet String names--------------\n");
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");
        System.out.println(names); //[Alex, Joe, John, ali]
        //prints out in alphabetic order using ASCII table values
        //does not allow duplicates


    }
}
