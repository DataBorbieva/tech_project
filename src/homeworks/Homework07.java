package homeworks;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {
        System.out.println("Task-1");
                /*
                Write a program that generates 4 random numbers
        between 0 and 10 (0 and 10 are also included).
        -Store numbers in proper variables and print them first
        -Print each number’s absolute difference with 5
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        NOTE: Assume random numbers came as 2, 5, 3, 0
        respectively.
        EXPECTED RESULT:
        Number 1 = 2
        Number 2 = 5
        Number 3 = 3
        Number 4 = 0
        Absolute difference of 2 with 5 is = 3
        Absolute difference of 5 with 5 is = 0
        Absolute difference of 3 with 5 is = 2
        Absolute difference of 0 with 5 is = 5
        Greatest number is = 5
        Smallest number is = 0
                 */
        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11);
        int num3 = (int) (Math.random() * 11), num4 = (int) (Math.random() * 11);
        System.out.println("Number 1 = " + num1 +
                "\nNumber 2 = " + num2 +
                "\nNumber 3 = " + num3 +
                "\nNumber 4 = " + num4);

                int five = 5;
        System.out.println("Absolute difference of " + num1 + " with " + five + " is = " + Math.abs(num1 - 5) +
                "\nAbsolute difference of " + num2 + " with " + five + "  is = " + Math.abs(num2 - 5) +
                "\nAbsolute difference of " + num3 + " with  " + five + "  is = " + Math.abs(num3 - 5) +
                "\nAbsolute difference of " + num4 + " with " + five + "  is = " + Math.abs(num4 - 5) +
                "\nGreatest number is = " + Math.max(Math.max(Math.max(num1, num2), num3), num4) +
                "\nSmallest number is = " + Math.min(Math.min(Math.min(num1, num2), num3), num4));


        System.out.println("\nTask-2");
                /*Write a program that generates 8 random int numbers between -50 and 50 (-50
        and 50 are included)
        -Store numbers in proper variables and print them first
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        -Find average of all 8 numbers and print result with a proper message
        -Find the absolute difference between smallest and greatest and print result with
        a proper message
        -Print true if 3rd number is positive, false otherwise with a proper message
        -Print true if 5th number is negative, false otherwise with a proper message
        -Print true if any of the numbers is zero, false otherwise with a proper message
        NOTE: Assume random numbers came as -10, 5, -37, 13, 50, -39,
        17, 3 respectively.
        NOTE: Your result will be different based on the random numbers
        you will get.

        EXPECTED RESULT:
        Number 1 = -10
        Number 2 = 5
        Number 3 = -37
        Number 4 = 13
        Number 5 = 50
        Number 6 = -39
        Number 7 = 17
        Number 8 = 3
        Greatest number is = 50
        Smallest number is = -39
        Average of 8 numbers is = 1
        Absolute difference between smallest and greatest is = 89
        3rd number is positive = false
        5th number is negative = false
        There is at least one zero among those numbers is = false
                //end-start+1(-start)
         */
        int rand1 = (int) (Math.random() * 101) - 50, rand2 = (int) (Math.random() * 101) - 50,
                rand3 = (int) (Math.random() * 101) - 50, rand4 = (int) (Math.random() * 101) - 50,
                rand5 = (int) (Math.random() * 101) - 50, rand6 = (int) (Math.random() * 101) - 50,
                rand7 = (int) (Math.random() * 101) - 50, rand8 = (int) (Math.random() * 101) - 50;

        int j = 1;
        System.out.println(" Number " + j++ + " = " + rand1 +   //creating post increment variable to be dynamic
                "        \nNumber " + j++ + " = " + rand2 +
                "        \nNumber " + j++ + "  = " + rand3 +
                "        \nNumber " + j++ + " = " + rand4 +
                "        \nNumber " + j++ + " = " + rand5 +
                "        \nNumber " + j++ + " = " + rand6 +
                "        \nNumber " + j++ + " = " + rand7 +
                "        \nNumber " + j + " = " + rand8);

        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                (Math.max(rand1, rand2), +rand3), rand4), rand5), rand6), rand7), rand8);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (Math.min(rand1, rand2), +rand3), rand4), rand5), rand6), rand7), rand8);
        System.out.println(" Greatest number is = " + max);
        System.out.println(" Smallest number is = " + min);
        System.out.println("Average of 8 numbers is = " + (rand1 + rand2 + rand3 + rand4 + rand5 + rand6 + rand7 + rand8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " +
                +Math.abs(max - min));

        // if (rand3 > 0) System.out.println("3rd number is positive = " + true);
        //   else System.out.println("3rd number is positive = " + false);             1ST WAY

        //   String is3Pos = rand3 > 0 ? "true" : "false";
        //   System.out.println("3rd number is positive = " + is3Pos);                 2ND WAY

        //boolean is3RdNumPositive = rand3 > 0;
        System.out.println("3rd number is positive = " + (rand3 > 0));          //      3RD WAY

        //if (rand5 > 0) System.out.println("5th number is negative = false");
        //else System.out.println("5th number negative = true");

        System.out.println("5th number is negative = " + (rand5 < 0));

        //if (rand3 != 0 && rand5 != 0)
        //    System.out.println("There is at least one zero among those numbers is = false"); // 1ST WAY


        System.out.println("There is at least one zero among those numbers is = " +
                (rand1 == 0 || rand2 == 0 || rand3 == 0 || rand4 == 0 ||
                        rand5 == 0 || rand6 == 0 || rand7 == 0 || rand8 == 0));


        System.out.println("\nTask-3");
                /*
                Write a program that asks user to enter 7 numbers between 0 and 50 (0 and 50 are also included)
        -Store numbers in proper variables and print them first
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        -Find average of all 7 numbers and print result with a proper message
        -Print true if first number is greater than or equal to 10, false otherwise with a proper message
        -Print true if last number is less than or equal to 40, false otherwise with a proper message
        -Print true if both first and last numbers are greater than 25, false otherwise with a proper message
        -Print true if any of the numbers is zero or 50, false otherwise with a proper message
        -Print true if there is no number between 40 and 50 (40 and 50 are included), false otherwise with a
        proper message
        NOTE: Assume random numbers came as 4, 13, 23, 7, 0, 28, 49 respectively.
        NOTE: Your result will be different based on the random numbers you will get.
        EXPECTED RESULT:
        Number 1 = 4
        Number 2 = 13
        Number 3 = 23
        Number 4 = 7
        Number 5 = 0
        Number 6 = 28
        Number 7 = 49
        Greatest number is = 49
        Smallest number is = 0
        Average of 7 numbers is = 17
        First number is greater than or equal to 10 = false
        Last number is less than or equal to 40 = true
        Both first and last numbers are greater than 25 = false
        At least one of those numbers is 0 or 50  = true
        There is no number between 40 and 50 = false
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 7 numbers between 0 and 50");
        int number1=scan.nextInt(),number2 =scan.nextInt(),number3=scan.nextInt(),
                number4=scan.nextInt(),number5=scan.nextInt(),number6=scan.nextInt(),
                number7=scan.nextInt();
        System.out.println("Number 1 = " + number1 + "\nNumber 2 = " + number2 + "\nNumber 3 = " + number3 +
                "\nNumber 4 = " + number4 +
                "\nNumber 5 = " + number5 + "\nNumber 6 = " + number6 + "\nNumber 7 = " + number7);
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max
                (Math.max(Math.max(Math.max(number1, number2), number3), number4), number5), number6), number7));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min
                (Math.min(Math.min(Math.min(number1, number2), number3), number4), number5), number6), number7));
        System.out.println("Average of 7 numbers is = " + (number1 + number2 + number3 + number4 + number5 + number6 + number7) / 7);

        if (number1 >= 10) System.out.print("First number is greater than or equal to 10 = " + true);
        else System.out.println("First number is greater than or equal to 10 = " + false);

        if (number7 <= 40) System.out.println("Last number is less than or equal to 40 = " + true);
        else System.out.println("Last number is less than or equal to 40 = " + false);

        if (number1 >= 25 && number7 >= 25)
            System.out.println("Both first and last numbers are greater than 25 = " + true);
        else System.out.println("Both first and last numbers are greater than 25 = " + false);

        if (number1 == 0 || number1 == 50 || number2 == 0 || number2 == 50 || number3 == 0 || number3 == 50 ||
                number4 == 0 || number4 == 50 || number5 == 0 || number5 == 50 || number6 == 0 ||
                number6 == 50 || number7 == 0 || number7 == 50)
            System.out.println("At least one of those numbers is 0 or 50 = " + true);
        else System.out.println("At least one of those numbers is 0 or 50 = " + false);

        if ( number1 <=40 || number1>=50 || number2 <=40 || number2>=50 || number3 <=40
                || number3>=50 || number4 <=40 || number4>=50 ||  number5 <=40 || number5>=50 ||
                number6 <=40 || number6>=50 || number7 <=40 || number7>=50)
            System.out.println("There is no number between 40 and 50 = " + true);
        else System.out.println("There is no number between 40 and 50 = " + false);

        System.out.println("\nTask-4");
            /*Requirement:
        Write a Java program that generates 3 random
        numbers between 0 and 100 (0 and 100 are
        included) and find if all numbers are more than
        25
        Print true if all numbers are greater than 25
        Print false if any of the number is less than or
        equal to 25
        */

        int random1 = (int) (Math.random() * 101), random2 = (int) (Math.random() * 101),
                random3 = (int) (Math.random() * 101);

        if (random1 > 25 && random2 > 25 && random3 > 25) System.out.println(true);
        else System.out.println(false);

        System.out.println("\nTask-5");
                /*
                Requirement:
        Write a Java program to ask user to enter a
        number between 1 to 7 (1 and 7 are included)
        Print the day of the week according to given
        number. First day is MONDAY and last day is
        SUNDAY
        Test data 1:
        Input number: 3
        Expected Output:
        The number entered returns WEDNESDAY
        Test data 2:
        Input number: 5
        Expected Output:
        The number entered returns FRIDAY
                 */

        System.out.println("Enter a day from 1-7?");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Not a day");

        }
        System.out.println("\nTask-6");
                /*
                Requirement:
        Write a program that asks user to enter a number
        between
        -10 to 10 (-10 and 10 are included)
        -If number is positive, then print a message:
        “Number entered is POSITIVE”
        -If number is negative, then print a message:
        “Number entered is NEGATIVE”
        -If number is zero, then print a message: “Number
        entered is ZERO”
        -If number is even, then also print: “Number entered
        is EVEN”
        -If number is odd, then also print: “Number entered
        is ODD”
        Test data1:
        0
        Expected Output1:
        Number entered is
        ZERO
        Number entered is
        EVEN
        Test data2:
        5
        Expected Output1:
        Number entered is
        POSITIVE
        Number entered is
        ODD
                 */
        System.out.println("Please enter number between - 10 to 10?");
        int negativeNumbers = scan.nextInt();
        System.out.println(negativeNumbers);
        if (negativeNumbers > 0)
            System.out.println("Number entered is POSITIVE");
        else if (negativeNumbers < 0)
            System.out.println("Number entered is NEGATIVE");
        else
            System.out.println("Number entered is ZERO");

        if (negativeNumbers % 2 == 0)
            System.out.println("Number entered is EVEN");
        else
            System.out.println("Number entered is ODD");

        System.out.println("\nTask-7");
        /*
                Jennifer is taking a math course . This math course
        requires students to take 3 exams. At the end, if the
        average of those exams is more than or equal to 70, then
        Jennifer will pass the course. However, if the average of
        those 3 exams is less than 70, then Jennifer will fail.
        Requirement:
        Write a Java program that asks Jennifer to enter her exam
        results and print if she passed or failed for the exam.
        NOTE: This program requires you to use Scanner
        Example Program 1:
        Program: Tell me your
        exam results?
        User: 20 50 85
        Program: YOU FAILED!
        Example Program 2:
        Program: Tell me your
        exam results?
        User: 65 80 90
        Program: YOU PASSED!
                 */

        System.out.println("Tell me your exam results?");
        int grade = scan.nextInt(), grade2 = scan.nextInt(), grade3 = scan.nextInt();
        int averageOf3 = (grade + grade2 + grade3) / 3;

        if (averageOf3 >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        System.out.println("\nTask-8");
                /*
                Requirement:
        Write a Java program that asks user to enter 3 numbers
        -If all 3 numbers are equal, then print “TRIPLE MATCH”
        -If any of those 2 numbers are equal, then print
        “DOUBLE MATCH”
        -If all numbers are different, then print “NO MATCH”
        NOTE: This program requires you to use Scanner
        Example
        Program 1:
        Program: Enter 3
        numbers
        User: 3 3 3
        Program: TRIPLE
        MATCHExample
        Program 2:
        Program: Enter 3
        numbers
        User: 5 4 5
        Program: DOUBLE
        MATCH
        Example
        Program 3:
        Program: Enter 3
        numbers
        User: 2 5 7
        Program: NO MATCH
                 */


        System.out.println("Enter 3 numbers");
        int numberOne = scan.nextInt(), numberTwo = scan.nextInt(), numberThree = scan.nextInt();
        if (numberOne == numberTwo && numberOne == numberThree && numberTwo == numberThree)
            System.out.println("TRIPLE MATCH");
        else if (numberOne == numberTwo || numberTwo == numberThree || numberThree  == numberOne)
            System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

    }


}

















