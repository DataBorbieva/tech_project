package practiceAbeData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class Mock3_factorial {
    public static int[] factorial2(int[] fact) {
        int[] fact2 = new int[fact.length];
        for (int i = 0; i < fact.length; i++) {
            for (int j = 0; j <= fact[i]; j++) {
                if (fact[i] == 0 || fact[i] == 1) fact2[i] = 1;
                else fact2[i] += fact[i] *= j;
            }
        }
        return fact2;
    }


    public static String removeDuplicateNumbers(int[] numbers) {
        TreeSet<Integer> a = new TreeSet<>(); // either or collection would work
        for (int element : numbers) {
            a.add(element);
        }
        return Arrays.toString(a.toArray());
    }

    public static void getFibonacciSeries(int number) {
        int zero = 0, one = 1, sum;

        for (int i = 0; i < number; i++) {
            System.out.println(zero);
            sum = zero + one;
            zero = one;
            one = sum;
        }


    }

    public static boolean isPalindrome(String str) {
        return str.toLowerCase().equals(new StringBuilder(str.toLowerCase()).reverse().toString()); // we made it non case sens


    }

    public static void main(String[] args) {
        int[] nn = {0, 5, 4, 1, 3, 3, 3, 2};
        //   System.out.println(Arrays.toString(factorial2((nn))));

        System.out.println(removeDuplicateNumbers(nn));

        System.out.println("\n-----------------------\n");

        getFibonacciSeries(8);


        String s1 = "Data is best student 123";
        String vowels = "AEIOUaeiou";
        String container = "";
        for (char c : s1.toCharArray()) {
            if (vowels.indexOf(c) < 0 && Character.isLetter(c)) container += c; //only printing Consonant //dtsbststdnt

        }
        System.out.println(container);

        System.out.println("\n-----------------------\n");
        int[] nums = {1, 4, 5, 6, 7, 8, 9, 4, 55}; //count Prime  % 1, itself
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 1) {
                boolean isPrime = true;

                for (int j = 2; j < nums[i]; j++) {

                    if (nums[i] % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) count++;
            }
        }
        System.out.println(count);


        System.out.println("\n___________-----");
        int[] numbers = {1, 4, 5, 6, 6, 7, 7, 7, 8, 9, 4, 55};
        ArrayList<Integer> withoutDups = new ArrayList<>();
        for (int el : numbers) {
            if (!withoutDups.contains(el)) withoutDups.add(el);
        }
        System.out.println(withoutDups);


        System.out.println("\n___________-----");

        System.out.println(isPalindrome("Civic")); //true
    }
}