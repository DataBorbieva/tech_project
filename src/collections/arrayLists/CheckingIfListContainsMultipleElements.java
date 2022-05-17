package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class CheckingIfListContainsMultipleElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);
        System.out.println(numbers.contains(5)); //true

        List<Integer> elementsToBeChecked = new ArrayList<>();
        numbers.add(50);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);

        System.out.println(numbers.containsAll(elementsToBeChecked)); //true

    }
}
