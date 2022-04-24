package collectionFramework;

import java.util.*;

public class REcapArrayandList {
    public static void main(String[] args) {
        System.out.println("\n--------int array---------\n");
         int[] arr = {1,5,7,9,10}; //null is not allowed as it is a primitive array, but null is for objects
        System.out.println(Arrays.toString(arr)); //[1, 5, 7, 9, 10]
        System.out.println(arr[2]); //7

        System.out.println("\n--------String array---------\n");

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities)); //[Tokyo, Berlin, Oslo, Denver, null, null]

        System.out.println("\n--------List array---------\n");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,cities);
        cities2.add("Tokyo");
        System.out.println(cities2); //[Tokyo, Berlin, Oslo, Denver, null, null, Tokyo]
      /*  List<String> names2 = new ArrayList<>();
        Collection<String> names3 = new ArrayList<>();
        Iterable<String> names4 = new ArrayList<>();
        Object names5 = new ArrayList<>();
        Cloneable names6 = new ArrayList<>(); //this is not useful , Cloneable is parent of ArrayList too
*/

        System.out.println(cities2.get(3)); //Denver

        System.out.println("\n--------String Vector---------\n");
        List<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");
        System.out.println(names.size()); //6

        names.forEach(System.out::println); // keeps insertion order and uses indexes in methods
        System.out.println(names.get(5) );

        System.out.println("\n--------String LinkedList---------\n");
        LinkedList<String> objects1 = new LinkedList<>();
        List<String> objects2 = new LinkedList<>(); //we have less methods here, because LinkedList acts like its parent here List

        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        System.out.println(objects1.getLast());
        System.out.println(objects1); //[Phone, Computer, Airpods, Screen, Screen, null, null, null, null]
        System.out.println(objects1.stream().filter(element -> element == null).count()); //4 , we are counting how many nulls we have here
        System.out.println(objects1.stream().filter(Objects::isNull).count()); //4

        System.out.println(objects1.get(2)); //Airpods






















    }}
