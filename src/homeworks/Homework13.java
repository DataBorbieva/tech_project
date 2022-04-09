package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("-----Task-1-----");
        /*
                Requirement:
        Write a program that prints all the numbers from 1 to 10 (1
        and 10 are included)
        If the number is dividable by 2, then print “Foo” instead of
        number itself
        If the number is dividable by 5, then print “Bar” instead of
        number itself
        If the number is dividable by both 2 and 5, then print
        “FooBar” instead of number itself
        Else print number itself
        Expected output:
        1
        Foo
        3
        Foo
        Bar
        Foo
        7
        Foo
        9
        FooBar
         */
        for (int i = 1 ; i <= 10 ; i++){
            if ( i % 10 == 0) System.out.println("FooBar");
            else if(i % 2 == 0 ) System.out.println("Foo");
            else if ( i %  5 == 0 ) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n-----Task-2-----");
        /*
        Requirement:
        Write a program to find the first positive and
        negative numbers in an int array
        Test data:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        Expected output:
        First positive number is: 5
        First negative number is: -4
        NOTE: Make your code dynamic that works for
        any given int array.
         */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};


          boolean isFirstPos = false;
        boolean isFirstNeg = false;

        for (int number : numbers) {
            if(number > 0 && !isFirstPos) {
                isFirstPos = true;
                System.out.println("First positive number = " + number);
            }
            else if(number < 0 && !isFirstNeg){
                isFirstNeg = true;
                System.out.println("First negative number = " + number);
            }

            if(isFirstPos && isFirstNeg) break;
        }

     /*   if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");
         */






        System.out.println("\n-----Task-3-----");
       /* Requirement:
        Write a program to generate 5 random numbers
        between 1 to 10 (1 and 10 are included) and
        store those numbers in an int array.
        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return
                false */
        int[] numT5 = new int[5];
        numT5[0] = (int)(Math.random()*11);
        numT5[1] = (int)(Math.random()*11);
        numT5[2] = (int)(Math.random()*11);
        numT5[3] = (int)(Math.random()*11);
        numT5[4] = (int)(Math.random()*11);

        boolean isT5Has2And3 = false;
        for(int num : numT5){
            if(num == 2 || num == 3) isT5Has2And3= true;
        }
        System.out.println(isT5Has2And3);





        System.out.println("\n-----Task-4-----");
               /*
        Requirement:
        Write a program to find if String array contains
        “apple” as an element, ignore cases.
        Test data 1:
        String[] list = {“banana”, “orange”, “Apple”};
        Expected output:
        true
        Test data 2:
        String[] list = {“pineapple”, “banana”, “orange”,
        “grapes”};
        Expected output:
        false
        NOTE: Make your code dynamic that works for
        any given String array.
                */
        String[] list1 = {"banana", "orange", "Apple"};
        //String[] list2 = {"pineapple", "banana", "orange","grapes"};
        boolean isApple = false;
        for(String fruit : list1){
            if(fruit.toLowerCase().equals("apple")) isApple = true;
      }
        System.out.println(isApple);






        System.out.println("\n-----Task-5-----");

        /*

        Requirement:
        Write a program to find the all-matching elements between
        2  int arrays
        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};

        Expected output 2:
        There is no matching elements
        NOTE: Make your code dynamic that works for any given
        int arrays.

         */
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean isDuplicateFound = false;
        for (int num1 : numbers1) {
            for (int num2 : numbers2) {
                if (num1 == num2) {
                    System.out.println(num1);
                    isDuplicateFound = true;
                    break;
                }
            }}
        if(!isDuplicateFound) System.out.println("There is no matching elements");

        System.out.println("\n-----Task-6-----");

        /*
        Requirement:
        Write a program to print duplicated characters in
        a String, ignore cases
        Test data 1:
        String str = ”baNana”;
        Expected output 1:
        a
        N
        Test data 2:
        String str = ”aPple”;
        Expected output 1:
        P
        NOTE: Make your code dynamic that works for
        any given String.
         */
      /*  String str = "baNana";
        char[] characters = str.toCharArray();
        for(char c : characters) {
            for (char ch : characters) {
                if (c == ch) {
                    System.out.println(characters[c]);
                    System.out.println(characters[ch]);
                }
            }
        }
*/ //Task 6 shows me ArrayIndexOutOfBoundsException

        String str = "baNana";
        String duplicates = "";
        for(int i = 0 ; i < str.length() - 1 ; i ++){
            for(int j = i + 1 ; j < str.length(); j++){
                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !duplicates.contains(str.toLowerCase().substring(i,i+1))){
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }



    }}
