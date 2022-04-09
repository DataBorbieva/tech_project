package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {
  /*
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "
*/

        String str1 = ScannerHelper.getAStringFromUser();
        System.out.println("First character in the name is " + str1.charAt(0));
        System.out.println("Last character oin the name is " + str1.charAt(str1.length() - 1));


  //example Kaly
        //charAt(0)
        //charAt(3) -->name.length()-1


        //First character of String is always -> str.charAt(0)
        // Last character of String is always -> str.charAt(str.length()-1)





    }}
