package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
      //  Set<Integer> numbers2 = new HashSet<>(); //we may loose some functionality that we have in HashSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(899);
        numbers.add(null);
        System.out.println(numbers); //[0, -3, 899, 5, -7, -55, 10]
        System.out.println(numbers.contains(36742993)); //false
        //we use it , when we dont care about insertion order, there is no methods with indexes like .get(index) , no duplicates

    }
}
