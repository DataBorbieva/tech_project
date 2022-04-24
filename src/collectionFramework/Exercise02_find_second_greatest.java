package collectionFramework;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3); numbers.add(3);
        TreeSet<Integer> numbers1 = new TreeSet<>(numbers);
        System.out.println(numbers1); //[3, 5, 7]
        ArrayList<Integer> numbersLast = new ArrayList<>(numbers1);

        System.out.println(numbersLast.get(numbersLast.size()-2)); //5 second greatest
        System.out.println(numbersLast.get(1)); //3  //second smallest

    }
}
