package homeworks;

import java.util.ArrayList;

public class Homework16 {

        /*
        Requirement:
Write a method countWords() that takes a String as an
argument, and returns how many words there are in the
the given String
Test data 1:
String str = “      Java is fun       ”;
Expected output 1:
3
Test data 2:
String str = “Selenium is the most common UI
automation tool.   ”;
Expected output 2:
8
NOTE: Make your code dynamic that works for any given
String
NOTE: Be careful about empty String
NOTE: Be careful about before and after white spaces
         */
    //Task-1
    public static int countWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') count++;
        }
    return count;  //tested , working
    }

 // Task-2
    /*
            Requirement:
        Write a method countA() that takes a String as an
        argument, and returns how many A or a there are in the
        the given String
        Test data 1:
        String str = “TechGlobal is a QA bootcamp”;
        Expected output 1:
        4
        Test data 2:
        String str = “QA stands for Quality Assurance”;
        Expected output 2:
        5
        NOTE: Make your code dynamic that works for any given
        String
        NOTE: Be careful about empty String
        NOTE: Be careful about uppercase and lowercase
     */
    public static int countA(String str){
        int countaOrA = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A'|| str.charAt(i) == 'a') countaOrA++;

        }
    return countaOrA; //tested , working
    }
    //Task-3
            /*
            Requirement:
        Write a method countPos() that takes an ArrayList of
        Integer as an argument, and returns how many elements
        are positive
        Test data 1:
        [-45, 0, 0, 34, 5, 67]
        Expected output 1:
        3
        Test data 2:
        [-23, -4, 0, 2, 5, 90, 123]
        Expected output 2:
        4
        NOTE: Make your code dynamic that works for any given
        ArrayList of Integer
             */
    public static int countPos(ArrayList<Integer> list){
        int countPositives = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > 0 ) countPositives++; //tested, working

        }
          return countPositives;
        }


    /*Requirement:
    Write a method removeDuplicateNumbers() that takes an
    ArrayList of Integer as an argument, and returns it back
    with removed duplicates
    Test data 1:
            [10, 20, 35, 20, 35, 60, 70, 60]
    Expected output 1:
            [10, 20, 35, 60, 70]
    Test data 2:
            [1, 2, 5, 2, 3]
    Expected output 2:
            [1, 2, 5, 3]
    NOTE: Make your code dynamic that works for any given
    ArrayList of Integer */

    //Task-4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> removeDupNums = new ArrayList<>();

        for (Integer num : nums) {
            if(!removeDupNums.contains(num)){
                removeDupNums.add(num);   //tested working
            }
        }
        return removeDupNums;
     }
/*
        Requirement:
        Write a method removeDuplicateElements() that takes an
        ArrayList of String as an argument, and returns it back with
        removed duplicates
        Test data 1:
        [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
        Expected output 1:
        [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
        Test data 2:
        [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
        Expected output 2:
        [“abc”, “xyz”, “123”, “ab”, “ABC”]
        NOTE: Make your code dynamic that works for any given
        ArrayList of String
        NOTE: Be careful about lowercase and uppercases, this method
        is case sensitive
 */
     //Task-5
        public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){

            ArrayList<String> removedDupStrings = new ArrayList<>();
            for (String s : str) {
                if(!removedDupStrings.contains(s)){
                    removedDupStrings.add(s);
                }
            }
            return removedDupStrings;  //checked , working
        }


    //Task-6
    /*
            Requirement:
        Write a method removeExtraSpaces() that takes a String as an
        argument, and returns a String with removed extra spaces
        Test data 1:
        String str = “   I   am      learning     Java      ”;
        Expected output 1:
        I am learning Java
        Test data 2:
        String str = “Java  is fun    ”;
        Expected output 2:
        Java is fun
        NOTE: Make your code dynamic that works for any given
        String
        NOTE: Be careful about empty String
        NOTE: Be careful about before and after white spaces
     */
     public static String removeExtraSpaces(String str){
         str = str.trim().replaceAll(" +", " "); //worked , tested
         return str;
     }


    /*
            Requirement:
        Write a method add() that takes 2 int[] arrays as arguments and
        returns a new array with sum of given arrays elements.
        Test data 1:
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        Expected output 1:
        [9, 3, 2, 7, 5, 10]
        Test data 1:
        int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr2 = {10, 3, 6, 3, 2};
        Expected output 1:
        [16, 11, 9,  3, 2, 7, 5, 10, 34]
        NOTE: Make your code dynamic that works for any given arrays
        NOTE: You will assume that length of arrays are always more than zero
        NOTE: Be careful about arrays length, if they were equal, it would be
        an easy task, but they can be different as given in the example above.
     */
    //Task-7
    public static int[] add(int[] a, int[] b) {   //with solution  of Nataliia

        int[] numbersT7 = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < numbersT7.length; i++) {
            if (a.length > i) {
                numbersT7[i] += a[i];
            }
            if (b.length > i) {
                numbersT7[i] += b[i];
            }
        }
        return numbersT7;


    /*Write a method findClosestTo10() that takes an int[] array
    as an argument, and returns the closest element to 10
    from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
            5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
            8
    NOTE: You will assume that length of array is always more
    than zero
    NOTE: Make your code dynamic that works for any given
    int[] array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12)
    in this case return smallest which is 8
*/
        //Task -8
    /*    public static int findClosestTo10(int[] arr) {

            int indx = 0;
            int distance = Math.abs(arr[0] - indx);

            for (int i = 0; i < arr.length; i++) {
                int dist = Math.abs(arr[i] - indx);
                if (dist < distance) {
                    indx = i;
                    distance = dist;
                }
            }
            int numT8 = arr[indx];
            return new int[]{numT8};
        }

    }
    }
*/    //Nataliia's solution


    }}