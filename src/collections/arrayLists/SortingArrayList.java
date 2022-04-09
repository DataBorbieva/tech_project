package collections.arrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        //How to sort an array
        int[] numbersArray = {3,7,0,4};
        System.out.println("My arrays before sort = " + Arrays.toString(numbersArray)); //[3, 7, 0, 4]
        Arrays.sort(numbersArray);
        System.out.println("My arrays after sort = " + Arrays.toString(numbersArray)); //[0, 3, 4, 7]


        //How to sort an ArrayList
        System.out.println("\n------Sorting an ArrayList----------\n");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);

        System.out.println("My list before sorting = " + numbersList);
        Collections.sort(numbersList);
        System.out.println("My list after sorting = " + numbersList);

    }
}




