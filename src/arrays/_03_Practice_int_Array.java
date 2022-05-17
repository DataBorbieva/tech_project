package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {
        System.out.println("\nTask-1");
        int[] numbers = {-3,-7,0,2,0,7,7,10,2,15};
        System.out.println("Array not sorted = " +Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        System.out.println("\nTask-2");
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int number : numbers) {
            if(number > 0) pos++ ;
            else if (number < 0) neg++;
            else zero++;
        }
        System.out.println("Positives = " + pos +
        "\nNegatives = " + neg +
                "\nZeros = " + zero);


        System.out.println("\n-------TASK-2 - another approach-------\n");
        int pos1 = 0, neg1 = 0;

        for (int number : numbers) {
            if(number > 0) pos1++;
            else if(number < 0) neg1++;
        }

        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));


        System.out.println("\nTask-3");

        int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) even++;
            else odd++;

        }
        System.out.println("Evens = " +even);
        System.out.println("Odds = " +odd);

   /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */
    }
}
