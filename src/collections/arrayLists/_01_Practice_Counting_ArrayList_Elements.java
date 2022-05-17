package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        System.out.println("\n Task -1");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);                                                           // {10,12,13,8,9};
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);


        System.out.println("\n-------TASK-2-for each loop ---------\n");

        int countOdds = 0;

        for (Integer number : numbers) {
            if (number % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        System.out.println("\n-------TASK-2-fori loop ---------\n");
        countOdds = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        /*
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        System.out.println("\n-------TASK-3---------\n");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);

        System.out.println("\n-------TASK-4 fori loop---------\n");
        int colorsUpp = 0;
        for (int i = 0; i < colors.size(); i++) {

                if (Character.isUpperCase(colors.get(i).charAt(0))) colorsUpp++;
                System.out.println(colorsUpp);




            System.out.println("\n-------TASK-4 for each loop---------\n");
            int colorsUpp1 =0 ;
            for (String color : colors) {
                if(Character.isUpperCase(color.charAt(0))) colorsUpp1++;
                System.out.println(colorsUpp1);

            }



            }
        }
    }