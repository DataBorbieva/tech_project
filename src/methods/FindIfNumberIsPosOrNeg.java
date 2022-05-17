package methods;
import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsPosOrNeg {
    public static void main(String[] args) {

                /*
        Ask user to enter an any number
        -Print "The number is positive" if the user enters a positive number
        -Print "The number is negative" if the user enters a negative number
        -Print "The number is zero" if the user enters zero
         */
        int number = ScannerHelper.getNumberFromUser(); //new method returns an int by asking user
        System.out.println(MathHelper.isPositive(number));
        System.out.println(MathHelper.isNegative(number));
        System.out.println(MathHelper.isZero(number));

        if(MathHelper.isPositive(number)) System.out.println("The number is positive" );
         else if (MathHelper.isNegative(number)) System.out.println("The number is negative");
         else System.out.println("The number is zero");

         String name = ScannerHelper.getAStringFromUser();      //name from user by asking
        System.out.println(name + "'s age is " + number);
    }
}
