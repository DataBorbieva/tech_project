package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class PracticeComparison {
    public static void main(String[] args) {
            /*
    Write a Java program that asks user to enter 2 strings
    And store answers of user in different String variables
    Finally, check if given 2 Strings are equal or not and print messages given below

        Test data 1:
        Java
        java

        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello

        Expected output 2:
        These strings are equal
     */

      Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string 1 = ");
        String name1 = scan.nextLine();
        System.out.println("Enter a string 1 = ");
        String name2 = scan.nextLine();

        if (name1.equals(name2))System.out.println("This strings are equal");
        else System.out.println("This strings are NOT equal");

        //2nd WAY
        String str1 = ScannerHelper.getAStringFromUser();
        String str2 = ScannerHelper.getAStringFromUser();

        String resultMessage=str1.equals(str2) ? "This strings are equal" : "This strings are NOT equal";
        System.out.println(resultMessage);

        //3rd WAY
        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser())
                ? "These string are equal" : "These string are not equal");


    }
}
