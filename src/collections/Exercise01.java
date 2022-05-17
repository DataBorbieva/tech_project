package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store below data
cities

Berlin
Chicago
Dallas
Miami
Brugge
Kiev

Print the list
Then, remove Miami and Dallas
Print the list again

RESULT:
[Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
[Berlin, Chicago, Brugge, Kiev]
 */

        String[] cities = {"Berlin" , "Chicago", "Dallas", "Miami" , "Brugge", "Kyiv"};
        List<String> cities1 = new LinkedList(Arrays.asList(cities));
        //or one more way Collections.addAll(cities1, cities);
        System.out.println(cities1.remove("Miami"));
        System.out.println(cities1.remove("Dallas"));
        System.out.println(cities1);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("The ArrayList is = " + numbers);

        //Converting Arraylist to a LinkedList
        LinkedList<Integer> numbers2 =  new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);

        //Converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);
    }
}
