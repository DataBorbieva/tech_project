package homeworks;

import java.util.Arrays;

public class Homework21 {
    /*
    Requirement:
-Create a method called fizzBuzz1()
-This method will take an int argument, and it will print
numbers starting from 1 to given argument. BUT, it will print
“Fizz” for the numbers divided by 3, “Buzz” for the numbers
divided by 5, and “FizzBuzz” for the numbers divided both by 3
and 5.
     */
    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
  /*  TASK 2
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return
    a String. BUT it will return "Fizz" if the given number is
    divided by 3, "Buzz" if the number is divided by 5, and
    "FizzBuzz" if the number is divided both by 3 and 5.
    Otherwise, it will return number itself.*/

    public static String fizzBuzz2(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else return String.valueOf(num);
    }

    /* TASK 3
       -Create a method called findSumNumbers()
       -This method will take a String argument and it will return
       an int which is the sum of all numbers presented in the String.
       NOTE: If there are no numbers represented in the String,
       return 0.*/

 public static int findSumNumbers(String str) { //NOT WORKING PROPERLY

        String[] strArr = str.replaceAll("[^0-9]", " ").trim().split("\\s+");
        int cont = 0;
        for (String number : strArr) cont += Integer.parseInt(number);
        return cont;

    }

 /* TASK 4
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will
    return an int which is the number presented in the
    String.
    NOTE: If there are no numbers represented in the String,
    return 0.*/

    public static int findBiggestNumber(String str) {
        String[] strArr = str.replaceAll("[^0-9]", " ").trim().split("\\s+");
        Arrays.sort(strArr);
        return Integer.parseInt(strArr[strArr.length - 1]);
    }

  /*TASK 5
    -Create a method called
    countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!! */

    public static String countSequenceOfCharacters(String str) {
        String sequence = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!sequence.contains(str.charAt(i) + "")) {
                sequence += str.charAt(i);
                sequence += count;
                count = 1;
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz2(20)); //Buzz
        System.out.println(findSumNumbers("a1b4cll3006")); //14
        System.out.println(findBiggestNumber("a11 b4c9  0#"));//9
        System.out.println(countSequenceOfCharacters("xxyyyzzaa"));//x2y3z3a2



    }
}




