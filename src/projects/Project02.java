package projects;
import java.util.Scanner;
public class Project02 {
    public static void main(String[] args) {

        /*
        TASK-1
        -Write a program that asks user to enter their 3 numbers
        -Then multiply these numbers and print the result in the format:
        The product of the numbers entered is =
        {number1}*{number2}*{number3}

        EXAMPLE PROGRAM
        Program: Please enter 3 numbers
        User: 3 6 10
        Program: The product of the numbers entered is = 180
         */


        //Task-1
        /*1.Create an object of scanner
        2.ask questions to get a required input from user
        3.multiply numbers
        4.print out, as required
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int number1 = userInput.nextInt(), number2 = userInput.nextInt(), number3 = userInput.nextInt();
        int mult = number1 * number2 * number3;

        System.out.println("The product of the numbers entered is = " + mult);



        /*TASK-2
        -Write a program that asks user to enter their first name, last name and year of
        birth.
        -Then calculate the age by subtracting the year of birth from current year we are in.
        -Print result in the format: {firstName} {lastName}’s age is = {currentYear}
        – {yearOfBirth}.

         */
        //Task-2
        /*1. The object is already created
        2.ask user required questions to get input
        3.Find age by subtracting years
        4.print out, as required
         */

        System.out.println("What is your first name? ");
        String firstName = userInput.next();
        System.out.println("What is your last name? ");
        String lastName = userInput.next();
        System.out.println("What is your year of birth? ");
        int yearOfBirth = userInput.nextInt();
        int age = 2022 - yearOfBirth;
        System.out.println(firstName + " " + lastName + "'s age is = " + age);


        /*
        TASK-3
        -Write a program that asks user to enter their full name and weight as kg.
        -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
        -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
        EXAMPLE PROGRAM
        Program: What is your full name?
        User: Alex Morgan
        Program: What is your weight?
        User: 70
        Program: Alex Morgan’s weight is = 154.35 lbs.
         */


         //Task-4
        /*1.ask required questions to get correct user input
        2.find out wight of user in lbs by multiplication
        3.print out as required

         */

        System.out.println("What is your full name?");
        userInput.nextLine();   // we need extra nextLine method for user to be able to put 2 words
        String fullNameOfUser = userInput.nextLine();// 2 words - Alex Morgan

        System.out.println("What is your weight?");
        double kgWeight = userInput.nextDouble();
        double lbsWeight = kgWeight * 2.205;

        System.out.println(fullNameOfUser + "'s weight is = " + lbsWeight + "lbs.");


       /*
       TASK-4
        -Write a program that asks 3 students to enter their full name and age
        -Then print each student’s age with their full names as {fullName}’s age is
        {age}.
        -And, calculate the average age for these students and print result as The average
        age is {averageAge}.
        -And, find the eldest age and print result as The eldest age is {eldestAge}.
        -And, find the youngest age and print result as The youngest age is
        {youngestAge}.
        EXAMPLE PROGRAM
        Program: What is your full name?
        Student 1: Scott Wender
        Program: What is your age?
        Student 1: 48
        Program: What is your full name?
        Student 2: Ben Meeder
        Program: What is your age?
        Student 2: 23
        Program: What is your full name?
        Student 3: Matt Chris
        Program: What is your age?
        Student 3: 34
        Program:
        Scott Wender’s age is 48.
        Ben Meeder’s age is 23.
        Matt Chris’s age is 34.
        The average age is 35.
        The eldest age is 48.
        The youngest age is 23.
        */
        //Task-4
        /*ask questions, as required in the Task-4
        2.Find the average age of users
        3.Find eldest age - by using   Math.max()
        4.Find youngest by using Math.min
        5.Print out, as required

         */


        System.out.println("What is your full name?");
        userInput.nextLine();
        String studentOne = userInput.nextLine();

        System.out.println("What is your age?");
        int student1age = userInput.nextInt();

        System.out.println("What is your full name?");
        userInput.nextLine();
        String studentTwo = userInput.nextLine();

        System.out.println("What is your age?");
        int student2age = userInput.nextInt();

        System.out.println("What is your full name?");
        userInput.nextLine();
        String studentThree = userInput.nextLine();

        System.out.println("What is your age?");
        int student3age = userInput.nextInt();

        int avrge = (student1age + student2age + student3age)/3;

        int eldestAge = Math.max(Math.max(student1age, student2age),student3age);
        int youngestAge = Math.min(Math.min(student1age, student2age),student3age);
        System.out.println(studentOne + "'s age is " + student1age +".");
        System.out.println(studentTwo + "'s age is " + student2age +".");
        System.out.println(studentThree + "'s age is " + student3age +".");
        System.out.println("The average age is " + avrge);
        System.out.println("The eldest age is " + eldestAge + ".");
        System.out.println("The youngest age is " + youngestAge + ".");
    }
}