package homeworks;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {
        /*Requirement:
        -Write a Java program that asks user to enter 3
        numbers - int values and find the Max and Min
        numbers by using Math.max() and Math.min()
        methods

        Test Data:
        6
        10
        3
        Expected Output:
        Max value = 10
        Min value = 3 */

        //Task-1
        /*1.create an object of scanner
        2.ask questions to get required user's input
        3.find max and min vale
        4.print out
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is number one ? ");
        int num1 = scan.nextInt();
        System.out.println("What is number two ? ");
        int num2 = scan.nextInt();
        System.out.println("What is number three ? ");
        int num3 = scan.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(num1, num2), num3));
        System.out.println("Min value = " + Math.min(Math.min(num1, num2), num3));

        //Task-2
                /*Requirement:
        -Write a Java program that asks user to enter 5
        numbers - int values and find the Max and Min
        number by using Math.max() and Math.min()
        methods

        Test Data:
        3
        15
        45
        20
        25
        Expected Output:
        Max value = 45
        Min value = 3  */

        /*1.we won't create object of scanner , we already have one
        2.ask questions to get required user's input
        3.find max and min vale
        4.print out
         */

        System.out.println("What is number 1 ?");
        int numOne = scan.nextInt();
        System.out.println("What is number 2 ?");
        int numTwo = scan.nextInt();
        System.out.println("What is number 3 ?");
        int numThree = scan.nextInt();
        System.out.println("What is number 4 ?");
        int numFour = scan.nextInt();
        System.out.println("What is number 5 ?");
        int numFive = scan.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(numOne, numTwo), numThree), Math.max(numFour, numFive)));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(numOne, numTwo), numThree), Math.min(numFour, numFive)));

        //Task-3
        /* Requirement:
        -Write a Java program that asks user to enter 2
        numbers - int values and find the absolute
        difference between the two numbers by using
        Math.abs() method

        Test Data:
        -5
        27
        Expected Output:
        The difference between numbers is = 32 */

        /*
       1.ask questions to get required user's input
       2.find abs
       3.print out
         */
        System.out.println("What is number 1 ?");
        int number1 = scan.nextInt();
        System.out.println("What is number 1 ?");
        int number2 = scan.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(number1 - number2));

        //Task-4
               /*Requirement:
        -Write a Java program that generates 3 random
        numbers between 50 and 100 both included.
        Use Math.random()
        First print the numbers
        Then, find the sum of these numbers

        Test Data:
        55
        67
        90
        Expected Output:
        Number 1 = 55
        Number 2 = 67
        Number 3 = 90
        The sum of numbers is = 212  */

        /*1.find random of  3 numbers between 50-100
        2.find the sum of these numbers
        2.print out as required
         */
        int a = (int) (Math.random() * 51) + 50;
        int b = (int) (Math.random() * 51) + 50;
        int c = (int) (Math.random() * 51) + 50;
        System.out.println("\nNumber 1 = " + a + "\nNumber 2 = " + b + "\nNumber 3 = " + c);
        System.out.println("The sum of numbers is = " + (a + b + c));


        //Task-5
                /*Assume Alex has $125, and Mike has $220.
        And Alex is going to give $25.5 to Mike.
        Then,
        How much money will Alex and Mike will have
        after that?
        Requirement:
        Write a java program to solve the problem given
        above
        Expected Output:
        Alex's money: $99.5
        Mike's money: 245.5 */

        double alexBalance = 125;
        double mikeBalance = 220;
        double alexGiveToMike = 25.5;
        System.out.println("Alex's money: $" + (alexBalance - alexGiveToMike) +
                "\nMike's money: " + (mikeBalance + alexGiveToMike));

        //Task-6
        /*1.find how many days David needs to save $390
        2.print out in int as required
         */
        double save = 390;
        double saveADay = 15.6;
        System.out.println((int) (save / saveADay));

    }
}