package stringMethods;

import utilities.ScannerHelper;

public class PracticeLength {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
Finally, print the length of those Strings with proper message
 */
        String str1 = ScannerHelper.getAStringFromUser();
        String str2 = ScannerHelper.getAStringFromUser();
        System.out.println(str1.length() + str2.length());

        System.out.println("First String length is " + str1.length());
        System.out.println("Second String length is " + str2.length());

    }
}
