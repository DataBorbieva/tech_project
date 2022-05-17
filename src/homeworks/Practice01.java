package homeworks;

import utilities.ScannerHelper;

import java.sql.SQLOutput;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("Task - 1");
                /*
                Assume that you are given a String as below;
        String str = "SDLC is step by step procedure to create an application";
        Write a program to find length of given String and the indexes of “SDLC” and “application” words
                 */

        String str = "SDLC is step by step procedure to create an application";
        System.out.println("The length of String is = " + str.length());
        System.out.println("The index of SDLC is = " + str.indexOf("SDLC"));
        System.out.println("The index of application is = " + str.indexOf("application"));

        System.out.println("\nTask -2 ");
                /*
                Requirement:
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;
        •
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
                 */

        String str1 = "  I know how to code with Python  ";
        System.out.println(str1.trim().toUpperCase().replace("PYTHON", "JAVA"));
        System.out.println(str1.replace("Python", "JaVa").toUpperCase().trim());
        System.out.println(str1.toUpperCase().trim().replace("PYTHON", "JAVA"));

        System.out.println("\nTask - 3");

        /*
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */
        String str2 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();

        System.out.println("The first character is " + str2.charAt(0));
        System.out.println("The last character is " + str2.charAt(str2.length()-1));

        System.out.println("\nTask - 4");
                /*
                Requirement:
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
                 */
        String s1 = "  TECH " .trim();
        String s2 = " glo  ".trim();
        String s3 = " BAL       ".trim();
        String s4 = s1+s2+s3;
        System.out.println(s4.toLowerCase().replace("t","T").replace("g","G"));

        System.out.println("\nTask - 5");
        /*
                Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
                 */
        String color = ScannerHelper.getAStringFromUser();

        System.out.println("First char in the color = " + color.charAt(0)); //p
        System.out.println("Last char in the color = " + color.charAt(color.length()-1)); //e
        System.out.println("First 3 chars in the color = " + color.substring(0,3)); //pur
        System.out.println("First 3 chars in the color = " + color.substring(color.length()-3)); //ple

        System.out.println("\nTask - 6");
               /*
               Requirement:
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        1st word is = java
        2nd word is = language
                */
        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();
        String first = sentence.substring(0,sentence.indexOf(' '));  // first word -> java
        String last = sentence.substring(sentence.lastIndexOf(' ')+1); // last word -> language
        System.out.println("First = " + first);
        System.out.println("Last  = " + last);

        System.out.println("\nTask - 7");

/*Requirement:
        Write a program that asks user to enter a full sentence
        Then, check if given sentence contains $ character
        If it contains $ character, then find the index of the $ character and print a proper message for the found index
        Test data 1:
        I saved $100 to buy new airpods
        Expected output 1:
        This sentence contains $ character
        $ character’s index is = 8
        Test data 2:
        I’ll become a Software Engineer in Test
        Expected output 2:
        This sentence does not contain $ character


*/

        String s7 = ScannerHelper.getAStringFromUser();
        if(s7.contains("$")){ //
            System.out.println("This sentence contains $ character" + "\n$ character's index is = " + s7.indexOf('$'));
        }
        else{
            System.out.println("This sentence does not contain $ character");
        }

        System.out.println(s7.contains("$") ?
                "This sentence contains $ character" + "\n$ character's index is = " + s7.indexOf('$') :
                "This sentence does not contain $ character");   //ternary 2nd way











    }
}
