package ifElseStatements.nestedIfStatements;
import java.util.Scanner;
public class SmallestOf2Numbers {
    public static void main(String[] args) {
       Scanner userInput= new Scanner(System.in);
           /*
    Write a program that asks user to enter 2 numbers
    Find the smallest and print it

    EXAMPLE PROGRAM:
    Program: Please enter 2 numbers
    User: 5 7

    Program: 5
     */

        System.out.println("PLease enter 2 numbers ?");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt();
        //1st way using simple if else

        if (num1 < num2) System.out.println(num1);
        else System.out.println(num2);


        //2nd way - using ternary operator
        /*Java Ternary operator can be used instead of if else statement
        It is used a lot in Java programming
        NOTE: it can be used only for simple if else statemnt
        You can not use it for if-else  if - else and nested if else statements
        variable variableName = condition ? option1:option2;
         */

        int smallestNumber = num1 < num2 ? num1 : num2;
       System.out.println(smallestNumber);
       //WE CAN PUT SHORt Cut
        //System.out.println(num1 < num2 ? num1 : num2);



        System.out.println("End of the program");





    }
}
