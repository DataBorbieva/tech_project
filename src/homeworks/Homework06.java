package homeworks;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
             //Task-1
                /*
                    Requirement:
            Convert given Strings below to int data types and find
            their sum, product, division, subtraction and
            remainder.
            NOTE: Scanner is not needed for this task!
            String s1 = “5”, s2 = “10”;
            Expected results:
            -Sum of 5 and 10 is = 15
            -Product of 5 and 10 is = 50
            -Division of 5 and 10 is = 0
            -Subtraction of  5 and 10 is = -5
            -Remainder of 5 and 10 is = 5
                 */

        /*1.Convert given Strings to int
        2.Find sum,product,division,subtraction, remainder
        3.print out as required
         */

        String s1 = "5", s2 = "10";

        int num1Int = Integer.parseInt(s1),num2Int = Integer.parseInt(s2);
        int sum = num1Int + num2Int;
        int mult = num1Int * num2Int;
        int div = num1Int / num2Int;
        int sub = num1Int - num2Int;
        int rem = num1Int % num2Int;



        System.out.println("\n-Sum of 5 and 10 is = " + sum +
                "\n-Product of 5 and 10 is = " + mult +
                "\n-Division of 5 and 10 is = " + div +
                "\n-Subtraction of  5 and 10 is = " + sub +
                "\n-Remainder of 5 and 10 is = " + rem);


                    //Task-2
                    /*Requirement:
            Convert given Strings below to int data types and
            find the greatest and smallest values and find the
            average and absolute difference of them.
            NOTE: Scanner is not needed for this task!
            String s1 = “200”, s2 = “-50”;
            Expected results:
            The greatest value is = 200
            The smallest value is = -50
            The average is = 75
            The absolute difference is = 250

                     */


        /*1.Convert given Strings to int
        2.Find min,max,average, abs
        3.print out as required
         */
        String st1 = "200", st2 = "-50";
        int numOneInt = Integer.parseInt(st1);
        int numTwoInt = Integer.parseInt(st2);
        int maxValue = Math.max(numOneInt,numTwoInt);
        int minValue = Math.min(numOneInt,numTwoInt);
        int avrge = (numOneInt+numTwoInt)/2;
        int abs = Math.abs(numOneInt-numTwoInt);

        System.out.println("\nThe greatest value is = " + maxValue +
                "\nThe smallest value is = " + minValue +
                "\nThe average is = " + avrge +
                "\nThe absolute difference is = " +abs );


        //Task-3
                /*Requirement:
        Assume that you have a coin bank, and you save
        3 quarters, 1 dime, 2 nickels and 1 penny each
        day.
        NOTE: Scanner is not needed for this task!
        -find how many days later you can save $24
        -find how many days later you can save $168
        -how much you will save after 5 months (assume
        a month is 30 days)
        Expected results:
        25 days
        175 days
        $144.0

       */
        /*1.create variables for everyday savings(but I think its not so necessary , we can just exactly print them out)
        2.find out how many days later can save $24
        3.find out how many days later you can save $168
        4.find out how much can be saved in 5 months
        5.print out as expected and required
         */
        double a = 0.75;
        double b = 0.1;
        double c = 0.1;
        double e = 0.01;

        double saving = a + b + c + e; //0.96
        double savings = 24;
        double saving1A = savings/saving; //25.0
        double bigSaving = 168;
        double bigSavings1 = bigSaving/saving;
        double months = (saving* 30)*5;

        System.out.println("\n" + (int)saving1A + " days");
        System.out.println("\n"+ (int)bigSavings1 + " days");
        System.out.println("\n"+"$"+ months);

        //Task-4
                /*Requirement:
        Jessie is going to save $1,250 to buy a new
        computer. Jessie is saving $62.5 in a day.
        Write a Java program that calculates how many
        days it will take for Jessie to buy the computer.
        NOTE: Scanner is not needed for this task!
        Expected Output:
        20

                 */

        double save = 1250;
        double day = 62.5;
        int saveDays = (int) day;
        int saveDays1 = (int) save;
        System.out.println("\n" + saveDays1/saveDays);

        //Task-5
        /*
                Requirement:
        Dan is going to save $14,265 to buy a new car. Dan is
        given two option to make monthly payments with no
        interest rate.
        Option 1: Equal payments of $475.50 per month
        Option 2: Equal payments of $951 per month
        Write a Java program that calculates how many months it
        will take for Dan to complete all the payments with option
        1 and option 2.
        NOTE: Scanner is not needed for this task!
        Expected Output:
        Option 1 will take 30 months
        Option 2 will take 15 months
        NOTE: 15 or 30 months are int results and do not have any
        floating point. So, it should not be 15.0 or 30.0 which
        are double
                 */

        double saveForCar = 14265;
        double option1 = 475.50;
        double option2 = 951;

        System.out.println("\nOption 1 will take " +(int)(saveForCar/option1) + " months "+
                "\nOption 2 will take " + (int)(saveForCar/option2) + " months");




        //Task-6
                /*
                Requirement:
        Write a Java program that asks user to enter 2
        numbers(number1 and number2) and store those in int
        variables.
        Find the result of number1/number2 and store this in a
        double.
        Finally print the result
        Test data:
        Number1 = 15
        Number2 = 2
        Expected Output:
        7.5
        NOTE: 7.5 is a double or float, but you are asked to store
        the result in a double. Make sure that your result is not
        returning 7 instead of 7.5
                 */
        /*1.create a scanner object
        2.ask questions
        3.give required user input
        4.print out as required -> 7.5 in double
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("What is number 1 ?");
        int num1 = scan.nextInt();
        System.out.println("What is number 2 ?");
        int num2 = scan.nextInt();
        System.out.println((double)num1/(double)num2);

    }
}
