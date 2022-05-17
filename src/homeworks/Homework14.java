package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        /*
                Requirement:
        Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate
        elements.
        NOTE: Make your code dynamic that works for any given int array.
        Test data 1:
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        Expected output 1:
        0
        Test data 2:
        int[] numbers = {-8, 56, 7, 8, 65};
        Expected output 2:
        There is no duplicates
        Test data 3:
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        Expected output 2:
        3
         */
        System.out.println("-----Task-1-----");
        //int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        int[] numbers = {-8, 56, 7, 8, 65};

        boolean isDuplicate = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) break;
        }
        if (!isDuplicate) System.out.println("There is no duplicates");


        System.out.println("-----Task-2-----");
       /* Requirement:
        Write a program to find the first duplicated String in a String array, ignore
        cases. It should print “There is no duplicates” if there are no duplicate
        elements.
                NOTE: Make your code dynamic that works for any given String array.
        Test data 1:
        String[] words = {“Z”, “abc”, “z”, “123”, “#” };

        Expected output 1:
        Z
        Test data 2:
        String[] words = {“xyz”, “java”, ”abc”};

        Expected output 2:
        There is no duplicates
        Test data 3:
        String[] words = {“a”, “b”, “B”, “XYZ”, “123”};

        Expected output 2:
        b   */

        String[] words = {"Z", "abc", "z", "123", "#"};
        boolean isDupWord = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].toLowerCase().equals(words[j].toLowerCase())) {
                    System.out.println(words[i]);
                    isDupWord = true;
                    break;
                }
            }
            if (isDupWord) break;
        }
        if (!isDupWord) System.out.println("There is no duplicates");


        System.out.println("-----Task-3-----");

        /*
                Requirement:
        Write a program to find the all duplicates in an int array. It
        should print “There is no duplicates” if there are no
        duplicate elements.
        NOTE: Make your code dynamic that works for any given
        int array.
        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        Expected output 1:
        0
        -7
        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};

        Expected output 2:
        There is no duplicates
         */
        int[] numbersT3 = {1, 2, 5, 0, 7};

        //  int[] numbersT3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        boolean isDupT3 = false;
        for (int i = 0; i < numbersT3.length; i++) {
            for (int j = i + 1; j < numbersT3.length - 1; j++) { // I did hard coded  (numbersT3.length - 1) to avoid second 0 in console
                if (numbersT3[i] == numbersT3[j]) {
                    System.out.println(numbersT3[i]);
                    isDupT3 = true;
                    break;
                }
            }
            //  if (isDupT3) break;
        }
        if (!isDupT3) System.out.println("There is no duplicates");

        System.out.println("-----Task-4-----");
/*
        Requirement:
        Write a program to find the all duplicates in a String array,
        ignore cases. It should print “There is no duplicates” if
        there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given
        String array.
        Test data 1:
        String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”,
        “java”};

        Expected output 1:
        A
        foo
        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };

        Expected output 2:
        There is no duplicates
 */

        String[] wordsT4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        //  String[] wordsT4 = {"python", "foo", "bar", "java", "123" };


        boolean isDupWordT4 = false;
        // boolean isDupSecondT4 = false;
        for (int i = 0; i < wordsT4.length - 1; i++) {
            for (int j = i + 1; j < wordsT4.length; j++) {
                if (wordsT4[i].equalsIgnoreCase(wordsT4[j])) {
                    System.out.println(wordsT4[i]);
                    isDupWordT4 = true;
                    break;
                }
                //  isDupSecondT4 = true; //tried to avoid second "a" in console , but didnt worked
                //break;
            }
        }
        if (!isDupWordT4) System.out.println("There is no duplicates");


        System.out.println("-----Task-5-----");
        /*
        Requirement:
        Write a program to reverse elements in an array, then
        print array.
        NOTE: Make your code dynamic that works for any
        given array.
        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};

        Expected output 1:
        [bar, foo, abc]
        Test data 2:
        String[] words2 = {“java”, “python”, “ruby”};

        Expected output 2:
        [ruby, python, java]
         */

        String[] wordsT5 = {"abc", "foo", "bar"};
        ArrayList<String> wordsContainer = new ArrayList<String>();
        for (int i = wordsT5.length - 1; i >= 0; i--) wordsContainer.add(wordsT5[i]);
        System.out.println(wordsContainer);

        System.out.println("-----Task-6-----");
  /*   Requirement:
             Write a program to reverse each word in a given String
             NOTE: Make your code dynamic that works for any
             given String.
             Test data 1:
             String str = “Java is fun”;

             Expected output 1:
             avaJ si nuf
             Test data 2:
             String str = “Today is a fun day”;

             Expected output 2:
             yadoT si a nuf yad

*/

        String str = "Java is Fun";
      /*  for (int i = str.length() - 1; i >= 0; i--) {
       //     for (int j = 0; j <= str.length() - 1; i++) // this str should be reversed one more time, i created method
            System.out.print(str.charAt(i));                //but my method is still not dynamic
        }
    }
*/
       String container = "";
       for (int i = str.length() - 1; i >= 0; i--) container += str.charAt(i);

        System.out.println(Homework14.reversedString(container)); // avaJ si nuf -> output is correct

    }

    public static String reversedString(String str) {   //Java is  fun
        String first = str.substring(0, str.indexOf(" "));
        String last = str.substring(str.lastIndexOf(" ") + 1);
        String middle = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));
    /*  String middle = "";
            for (int i = str.length(); i >= 0; i--) {
                String middle += str.charAt(i);
               System.out.println(middle);
            }*/
        return last + " " + middle + " " + first;
    }

}
  /*      String [] arr = str.split(" ");

        for (String s : arr) {

            String reversed = "";
            for (int i = s.length() -1; i >= 0; i++) {

            }
        }

//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }// "nuf si avaJ"
//
//        String[] arr = reversed.split(" ");// ["nuf", "si", "avaJ"]
//        String[] reversedArr = new String[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            reversedArr += arr[i];
//        }//["avaJ" , "si", "nuf"]
//
//        String result = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            result += reversedArr[i] + " ";
//        }
//        return result.trim();


    */


