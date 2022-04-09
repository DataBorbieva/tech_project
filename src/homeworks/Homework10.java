package homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
            /*
                Requirement:
        Assume that you are given a String of any length. First check if it
        has at least length of 1. If the length is zero, then print “Length is
        zero”
         If it has length more than zero, then find:
        -The length of the String
        -First char in the String
        -Last char in the String
        -Check if the String contains any vowel letters
        -if it has any vowel, then print “This String has vowel”
        -Else, print “This String does not have vowel”
        Vowels = a, e, i, u, o
        Test Data 2:
        String s2 = “”;
        Expected Result
        2:
        Length is zero
        Test Data 1:
        String s1 =
        “JavaScript”;
        Expected Result 1:
        Length is = 10
        First char is = J
        Last char is = t
        This String has vowel
             */
        System.out.println("Task-1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String for Task-1");
        String str = scan.nextLine();

        if (str.length() >= 1) {
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() - 1));

            if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("u") || str.contains("o")) {
                System.out.println("The String has vowel");
            } else System.out.println("The String does not have vowel");

        } else System.out.println("Length is zero");


        System.out.println("\nTask-2");
        /*
                Requirement:
        Assume that you are given a String of any length. First check if it
        has at least length of 3. If the length is less than 3, then print
        “Length is less than 3”
        If it has length more than or equal to 3, then find the middle
        character for the odd length, middle 2 characters for the even
        length.
        Test Data 2:
        String s2 = “ab”;
        Expected
        Result 2:
        Length is less
        than 3
        Test Data 3:
        String s3 =
        “civic”;
        Expected
        Result 3:
        v
        Test Data 1:
        String s1 = “”;
        Expected
        Result 1:
        Length is less
        than 3
        Test Data 4:
        String s4 =
        “toyota”;
        Expected
        Result 4:
        yo
         */

        System.out.println("Enter a String for Task-2");
        String str1 = scan.nextLine();
        if (str1.length() >= 3) {

            if (str1.length() % 2 == 0) {
                System.out.println("" + str1.charAt(str1.length() / 2 - 1) +
                        str1.charAt(str1.length() / 2));
            } else System.out.println(str1.charAt(str1.length() / 2));

        } else System.out.println("Length is less than 3");

/*
        Requirement:
        Write a program that divides the given String. Length of given will
        be at least 4.
        if length of the String is not at least 4, then print “INVALID INPUT”
        If the length is 4 or more, then
        -print the first two characters
        -print the last two characters
        -print all the middle characters other than first and last 2
        characters
        Test Data 2:
        String s2 = “Java”;
        Expected Result 2:
        First 2 characters are = Ja
        Last 2 characters are = va
        The other characters are =
                Test Data 3:
        String s3 = “Python”;
        Expected Result 3:
        First 2 characters are = Py
        Last 2 characters are = on
        The other characters  are = th
        Test Data 1:
        String s1 = “abc”;
        Expected Result
        1:
*/      System.out.println("\nTask-3");
        System.out.println("Enter a String for Task-3");
        String str2 = scan.nextLine();
        if (str2.length() < 4) {                  //length 6
            System.out.println("INVALID INPUT"); //Python
        } else {                                 //012345 index
            System.out.println("First 2 characters are = " + str2.substring(0, 2) +
                    "\nLast 2 characters are = " + str2.substring(str2.length() - 2) +
                    "\nThe other characters are = " + str2.substring(2, str2.length() - 2));
        }
            /*
            Requirement:
            Assume that you are given a String of any length. First check if
            it has at least length of 2. If the length is less than 2, then print
            “Length is less than 2”
            If it has length more than or equal to 2, then if first 2 and last 2
            characters of the given String are same.
            If first 2 and last characters are same, then print true.
            Otherwise, print false
            Test Data 2:
            String s2 = “a”;
            Expected
            Result 2:
            Length is less
            than 2
            Test Data 3:
            String s3 = “xy”;
            Expected
            Result 1:
            true
            Test Data 1:
            String s1 = “”;
            Expected
            Result 1:
            Length is less
            than 2 Test Data 4:
            String s4 =
            “xyzabc”;
            Expected
            Result 4:
            false
             */
        System.out.println("\nTask-4");
        System.out.println("Enter a String for Task-4");
        String str3 = scan.nextLine();
        if (str3.length() >= 2) {

//            if (str3.substring(0, 2).equals(str3.substring(str2.length() - 2))) {
//                System.out.println("True");
//            }else {
//                System.out.println("False");
//            }

            System.out.println(str3.substring(0, 2).equals(str3.substring(str2.length() - 2)));

        } else System.out.println("Length is less than 2");
        /*
                    Requirement:
            Write a program that gets rid of first and last characters of given two String
            values. After getting rid of first and last characters, add these two String
            values to each other and print the result. If one of the String values has
            length that is less than 2, then print “INVALID INPUT”
            Test Data 2:
            String s1 = “1234”;
            String s2 = “Green”;
            Expected Result 2:
            23ree
            Test Data 1:
            String s1 = “Orange”;
            String s2 = “6”;
            Expected Result 1:
            Invalid input!
            Test Data 3:
            String s1 =
            “123456”;
            String s2 =
            “Blue”;
            Expected
            Result 3:
            2345lu
            Test Data 4:
            String s1 =
            “Yellow”;
            String s2 = “Red”;
            Expected Result
            4:
            elloe
         */
        System.out.println("\nTask-5");
        System.out.println("Enter a String for Task-5");
        String str4 = scan.nextLine();
        //1234 --> str4
        //0123 --> index
        String str5 = scan.nextLine();
        //Green -->str5
        //01234 -->str5
        if(str4.length() >= 2 && str5.length() >= 2){
            System.out.println(str4.substring(1,str4.length()-1) +
                    (str5.substring(1,str5.length()-1)));

        }else System.out.println("INVALID INPUT");

       /*
               Requirement:
        Write a program that checks if a given String that has length of 4 at
        least and starts and ends with xx.
        -If the length of String is less than 4, then print “INVALID INPUT”
        -If given String starts and ends with xx, then print true.
        -Otherwise, print false
        Test Data 2:
        String s2 = “red”;
        Expected Result 2:
        INVALID INPUT
        Test Data 1:
        String s1 = “”;
        Expected Result 1:
        INVALID INPUT
        Test Data 3:
        String s1 =
        “green”;
        Expected
        Result 3:
        false
        Test Data 4:
        String s1 =
        “xxbluexx”;
        Expected Result
        4:
        */
        System.out.println("\nTask-6");
        System.out.println("Enter a String for Task-6");
        String str6 = scan.nextLine();
        if(str6.length() >= 4){
            System.out.println(str6.startsWith("xx") && str6.endsWith("xx"));
        }else System.out.println("INVALID INPUT");

    }

}
