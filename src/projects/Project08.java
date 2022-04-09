package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project08 {


    /*
            TASK-1 - countMultipleWords() method
            •Write a method that takes a String[] array as an argument and counts
            how many strings in the array has multiple words
            •This method will return an int which is the count of multiple words
            •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
            “    abc”,  “abc   “
            Test data:
            [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]
            Expected output:
            2
     */
    // TASK - 1
    public static int countMultipleWords(String[] a) {
        int countMultiWordsElements = 0;
        for (String element : a) {
            if (element.trim().contains(" ")) countMultiWordsElements++;
        }
        return countMultiWordsElements;
    }

    /*
            TASK-2 - removeNegatives() method
        •Write a method that takes an “ArrayList<Integer> numbers” as an
        argument and removes all negative numbers from the given list if there
        are any
        •This method will return an ArrayList with removed negatives
        Test data 1:
        [2, -5, 6, 7, -10, -78, 0, 15]
        Expected output 1:
        [2, 6, 7, 0, 15]
        Test data 2:
        [2, -5, 6, 7, -10, -78, 0, 15]
        Expected output 2:
        [2, 6, 7, 0, 15]
     */

    // TASK - 2
    public static ArrayList<Integer> removeAllNegativeNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator(); // I put all elements in a queue

        while (iterator.hasNext()) { // We are asking if there is an element in the queue
            Integer element = iterator.next(); // this gets an element from the queue
            if (element < 0) { // if element came from the queue is less than 0
                iterator.remove(); // Remove
            }
        }

        return numbers;
    }

/*
        TASK-3 - validatePassword() method
        •Write a method that takes a “String password” as an argument and
        checks if the given password is valid or not
        •This method will return true if given password is valid, or false if given
        password is not valid
        •A VALID PASSWORD:
        -should have length of 8 to 16 (length of 7 or 17 should return false)
        -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
        char
        -should NOT have any space
        Test data 1:
        Expected output 1:
        false
        Test data 2:
        abcd
        Expected output 2:
        false
        Test data 3:
        abcd1234
        Expected output 3:
        false
        Test data 4:
        Abcd1234
        Expected output 4:
        false
        Test data 5:
        Abcd123!
        Expected output 5:
        true
 */
    // TASK - 3

    //  public static boolean validPassword(String password) {
   /*     boolean valid = true;
        boolean inValid = false;
        for (int i = 0; i <= password.length(); i++) {
            if (password.length() >= 8 && password.length() <= 16)                     //should have length of 8 to 16
                if (Character.isDigit(password.charAt(i)))   //should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
                    if (Character.isUpperCase(password.charAt(i)) || Character.isUpperCase(password.charAt(i)))


        return valid;
else return inValid;
    }
*/
          public static boolean validatePassword(String password) {
              boolean validatePass = false;
              boolean inValidPass = false;
              if (!password.isEmpty() && (password.length() >= 8 && password.length() <= 16)) {
                  for (int i = 0; i < password.length(); i++) {
                      if (Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(password.charAt(i)) &&
                              Character.isDigit(password.charAt(i)) && (!Character.isWhitespace(password.charAt(i)))) {
                          validatePass = true;
                      }
                      if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)))
                          validatePass = true;

                  }
                  return validatePass; //true
              }
              return inValidPass; //else "false"
          }

/*
        TASK-4 - validateEmailAddress() method
        •Write a method that takes a “String email” as an argument and checks if
        the given email is valid or not
        •This method will return true if given email is true, or false if given email is
        not valid
        •A VALID EMAIL:
        -should NOT have any space
        -should not have more than one “@” character
        -should be in the given format <2+chars>@<2+chars>.<2+chars>
        Test data 1:
        a@gmail.com
        Expected output 1:
        false
        Test data 2:
        abc@g.com
        Expected output 2:
        false
        Test data 3:
        abc@gmail.c
        Expected output 3:
        false
        Test data 4:
        abc@@gmail.com
        Expected output 4:
        false
        Test data 5:
        abcd@gmail.com
        Expected output 5:
        true
 */
           public static boolean validateEmailAddress(String password) {
            return (((password.indexOf(" @") == password.lastIndexOf(" @")  &&password.contains(" @")))
                    &&(password.indexOf(".") ==password.lastIndexOf(".") &&password.contains("."))
                    &&(password.length() - password.indexOf(".")+1 >= 2) &&(password.indexOf(".")-password.indexOf(" @") >2)
                    &&(password.indexOf(" @") >1));
        } }