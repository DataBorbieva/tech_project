package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;
import java.util.Scanner;
public class Homework11 {

    public static void main(String[] args) {

                /*
                Requirement:
        Write a program that prints all the
        numbers that are dividable by 7
        starting from 1 to 100 (1 and 100 are
        included)
        NOTE: Result must be in one line
        with space and dash separators
        Expected Output:
        7 – 14 – 21 - 28 . . . 77 - 84 - 91 - 98
                 */
        System.out.println("-----Task-1-----\n");
        String s = "";
        for (int num = 1; num <= 100; num++) {
            if (num % 7 == 0) s += num + " - ";
        }
        System.out.print(s.substring(0, s.length() - 3));


        System.out.println("\n\n\n-----Task-2-----\n");
        /*
                Requirement:
        Write a program that prints all the
        numbers that are dividable by both 2
        and 3 starting from 1 to 50 (1 and 50
        are included)
        NOTE: Result must be in one line
        with space and dash separators
        Expected Output:
        6 – 12 – 18 . . . 36 – 42 - 48
                 */
        String s1 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 2 == 0) s1 += i + " - ";
        }
        System.out.print(s1.substring(0, s1.length() - 3));
/*

        Requirement:
        Write a program that prints all the
        numbers that are dividable by 5
        starting from 100 to 50 (100 and 50
        are included)
        NOTE: Result must be in one line
        with space and dash separators
        Expected Output:
        100 – 95 – 90 . . . - 60 - 55 - 50
*/
        System.out.println("\n\n\n-----Task-3-----\n");
        String s2 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) s2 += i + " - ";
        }
        System.out.print(s2.substring(0, s2.length() - 3));
        /*
        Requirement:
        Write a program that prints the squares of all
        numbers starting from 0 to 7 (0 and 7 are
        included)
        NOTE: Use loop!!!
                Expected Output:
        The square of 0 is =  0
        The square of 1 is =  1
        The square of 2 is =  4
        The square of 3 is =  9
        The square of 4 is =  16
        The square of 5 is =  25
        The square of 6 is =  36
        The square of 7 is =  49
*/

        System.out.println("\n\n\n-----Task-4-----\n");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }
         /*
        Requirement:
        Write a program that finds sum of the
        numbers starting from 1 to 10
        Calculation =>
        1+2+3+4+5+6+7+8+9+10
        NOTE: Use loop!!!
        Expected Output:
        55
         */
        System.out.println("\n\n\n-----Task-5-----\n");
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n\n\n-----Task-6-----\n");
        /*
                Requirement:
        Write a program that asks user to enter a
        positive number
        And find the factorial of the number
        0! = 1
        1! = 1
        2! = 1*2 = 2
        3! = 1*2*3 = 6
        Test Data 1:
        5
        Expected Output 1:
        120
        NOTE:
        5! = 1*2*3*4*5 = 120
        Test Data 2:
        7
        Expected Output 2:
        5040
        NOTE:
        5! = 1*2*3*4*5*6*7 =
        5040
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int positiveNumber = scan.nextInt();
        scan.nextLine();

        int num1 = 1;
        for (int i = 1; i <= positiveNumber; i++) {
            num1 *= i;
        }
        System.out.println(num1);

        System.out.println("\n\n\n-----Task-7-----\n");
    /*
    Write a program that asks user to enter their first and last name
    And count how many vowel letters they have in their first and last name
    Vowel letters = a, e, i, o, u

    Example program1:
    Program: Please enter your full name
    User: Chris Thompson
    Program: There are 3 vowel letters in this full name

    Example program2:
    Program: Please enter your full name
    User: Alexander George
    Program: There are 7 vowel letters in this full name
    */
        System.out.println("Please enter your name:");
        String name = scan.nextLine();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (CharacterHelper.isVowel(name.charAt(i)))
                count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n\n\n-----Task-8-----\n");
    /*
    Write a program that asks user to enter a number.
    If number is less than 100, then ask user to enter another number and find sum of entered 2 numbers.
    Keep asking user to enter numbers until the sum of all entered numbers is at least 100.
    If first number entered by user more than or equal to 100,
    print message "This number is already more than 100" and do not ask user to enter any other numbers.
    NOTE: Use do while loop!!!
    Example program1:                                       Example program2:
    Program: Please enter a number                          Program: Please enter a number
    User : 120                                              User : 50
    Program: This number is already more than 100

    Program: Please enter a number
    User : 75
    Program: Sum of the entered numbers is at least 100
    */
        int user;
        int sumOfNum = 0;
        int attempt = 1;
        do {
            if (attempt == 1) {
                System.out.println("Please enter a number:");
                user= scan.nextInt();
                if (user >= 100){
                    System.out.println("This number is already more than or equals to 100");
                    break;
                }
            }else{
                System.out.println("Please enter another number:");
                user = scan.nextInt();
            }
            sumOfNum += user;
            if (sumOfNum >= 100){
                System.out.println("Sum of the entered numbers is at least 100");
            }
            attempt++;
        } while (sumOfNum < 100);       //it should 31

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n\n\n-----Task-9-----\n");
    /*
    Assume that you are given a number, and you are asked to find series of Fibonacci numbers.
    What is Fibonacci numbers? a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
    It always starts with 0 and 1
    EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
    NOTE: Write a program that handles any n series of numbers
    Test data 1:                    Test data 2:
    5                               7
    Expected output 1:              Expected output 2:
    0 – 1 – 1 – 2 – 3               0 – 1 – 1 – 2 – 3 – 5 - 8
    */
        int f = 7;
        int zero = 0;
        int one = 1;
        int sum1;
        String container = "";

        for (int i = 0; i < f; i++){
            container += zero + " - ";
            sum1 = zero + one;
            zero = one;
            one = sum1;
        }
        System.out.println(container.substring(0, container.length() - 3));

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n\n\n-----Task-10-----\n");
    /*
    Write a program that asks user to enter a name. If name starts with j or J, then finish the program.
    But, if the name does not start with j or J, then keep asking until user gives a name that starts with j or J.
    Example program1:                               Example program2:
    Program: Please enter a name                    Program: Please enter a name
    User: Jessie                                   User: Alexander
    Program: End of the program.                    Program: Please enter a name
                                                    User: Chris
                                                    Program: Please enter a name
                                                    User: Jordan
                                                    Program: End of the program.
    */
        scan.nextLine();
        String name9;
        do {
            System.out.println("Please enter a name:");
            name9 = scan.nextLine();
        } while (!(name9.startsWith("j") || name9.startsWith("J")));{
            System.out.println("End of the program");
        }

    }}
