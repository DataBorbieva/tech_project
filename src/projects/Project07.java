package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
         /*
                TASK-1 - findGreatestAndSmallestWithSort() method
        Write a method that takes an int array that has at least one element. Find
        the greatest and smallest elements from the array and print them.
        Complete task using sort() method.
        Test data:
        [10, 7, 7, 10 -3, 10, -3]
        Expected output:
        Smallest = -3
        Greatest = 10
         */
    /*
    PSEUDO COD:
    1.create method that is static and called by Project07 class name
    2.method is void and only prints the result without returning anything
    3.method takes an argument of int[] n
    4.method has Arrays.sort(n)
    5.after .sort() i can print out  min element by using index[0]
    6.after .sort() i can print out  max element by using n.length-1 to make my method dynamic
     */

    public static void findGreatestAndSmallestWithSort(int[] n) {
        Arrays.sort(n);
        System.out.println("Smallest = " + n[0]);
        System.out.println("Greatest = " + n[n.length - 1]);

    }

    /*
    TASK-2 findGreatestAndSmallest() method
Write a method that takes an int array that has at least one element. Find
the greatest and smallest elements from the array and print them. DO NOT
sort the array and complete task without sorting.
Test data:
[10, 7, 7, 10, -3, 10, -3]
Expected output:
Smallest = -3
Greatest = 10
     */
    /*
    PSEUDO COD:
    1.create method that is static and called by Project07 class name
    2.method is void and only prints the result without returning anything
    3.method takes an argument of int[] n
    4.create max and min int containers to put MIN_VALUE and MAX_VALUE
    5.check every element of int array by using for each or fori loop, both can be used
    6.if num is less than min , assign my min to that num
    7.if num is more than max , assign my max to that num
    8.print out, without  returning
     */
    public static void findGreatestAndSmallest(int[] n) { //{1,2,3,4,5,6,7}
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // for (int i = 0; i >= n.length - 1; i++){
        for (int num : n) {//1
            if (num < min) min = num;

            //  for (int num1 : n) {
            if (num > max) max = num;


        }


        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);

        // i have not correct min value. it has to show me smallest number is = -3, but it is showing me that my
        // smallest number is = 10
        // for max number i have correct output
        //tried it with fori and for each loop, both has not correct smallest number, but greatest number is correct
    }   //tried with nested loops, also not worked , still have not correct output on smallest number

    /*
            TASK-3 - findSecondGreatestAndSmallestWithSort() method
        Write a method that takes an int array that has at least one element. Find
        the second greatest and second smallest elements from the array and print
        them. Complete task using sort() method.
        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */
/*
    PSEUDO CODE:
    1.create method that is static and called by Project07 class name
    2.method is void and only prints the result without returning anything
    3.method takes an argument of int[] n
    4.method has Arrays.sort(n)
    5.create loop to check if my element is not equal to first element by index[0] and more than [0] print out my num
    6.if my element is not equal to  element by n.length-1 and more than n.length-1 print out my num
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] n) {
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(n);
        //[5, 5, 6, 7, 8, 10, 15, 15]
        int max = n[n.length - 1];
        int min = n[0];

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int j : n) {
            if (j != max && j > secondMax) secondMax = j;
            if (j != min && j < secondMin) secondMin = j;
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);

    }

    /*
            TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find
        the second greatest and second smallest elements from the array and print
        them. DO NOT sort the array and complete task without sorting.
        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallest(int[] n){
        int max = Integer.MIN_VALUE;   //[10, 5, 6, 7, 8, 5, 15, 15]
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if( n[i] < min) min = n[i];
            if(n[i] > max) max = n[i];
            for (int k : n) {
                if (k != min && k < secondMin) secondMin = k;
                if (k != max && k > secondMax) secondMax = k;

            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);

    }

    /*
    TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and
    print them.
    NOTE: It is case-sensitive!
    Test data:
    [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
    Expected output:
    bar
    6
    */
    /*
    PSEUDO CODE
    1.create static void method that takes String[]
    2.find all duplicated elements in array
    3.use 2 for each loops to find duplicates
    4.use .equals() method to find if elements are equal
    5.print out duplicate elements
     */
    public static void findDuplicatedElementsInAnArray(String[] s) {

        ArrayList<String> ss = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) { //[“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
                if (s[i].equals(s[j])) ss.add(s[i]);
            }

        }
        System.out.println(ss);
    }

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.
    Test data:
    [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
    Expected output:
    pen
     */
    /*
    PSEUDO CODE
    1.create static void method that takes String[]
    2.create nested for each loops to find most repeated element
    3.create String container for most repeated element
    4.check elements with .equals method if the elements are equal to each other by using nested for each loops
    5.print out container which has most repeated element
     */
    public static void findMostRepeatedElementInAnArray(String[] s) { //[“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
//        ArrayList<String> sss = new ArrayList<>();
//
//        for (int i = 0; i < s.length; i++) {
//            for (int j = i + 1; j < s.length; j++) {
//                if (s[i].equals(s[j])) sss.add(s[i]);
//
//            }
//
//        }
//        System.out.println(sss);

        String mostRepeated = "";

        for (int i = 0; i < s.length; i++) {

            int count = 0;
            int secondCount = count;
            for (int j = i + 1; j < s.length; j++) {

                if (s[i].equals(s[j])) count ++;

            }
            if (count > secondCount) mostRepeated = s[i];
        }
        System.out.println(mostRepeated);
    }


    public static void main(String[] args) {

        System.out.println("Task2");

        int[] nums11 = {20, 7, 7, 10, -7, 10, -3};
        Project07.findGreatestAndSmallest(nums11);
        System.out.println("Task3");

        int[] nums = {10, 5, 6, 7, 8, 5, 15, 15};
        Project07.findSecondGreatestAndSmallestWithSort(nums);


        System.out.println("Task5");
        String[] sss = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        Project07.findDuplicatedElementsInAnArray(sss);

        System.out.println("\n\nTask6");
        String[] sT6 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen" , " eraser"};

        Project07.findMostRepeatedElementInAnArray(sT6);

        System.out.println("\n\nTask4");
        int[] n = {10, 5, 6, 7, 8, 5, 15, 15};
        Project07.findSecondGreatestAndSmallest(n);

    }
}
