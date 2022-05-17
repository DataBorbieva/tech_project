package mathClass;
import java.util.Scanner;
public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers, write
        down the Pseudo code and print min and max with
        proper messages.


        NOTE: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
         */

//        int x = 4, y = 67, z = -54;
//
//        Math.max(x, y); // 67 1st step
//

        System.out.println("Max of every number is = " +
                Math.max(Math.max(4, 67), -54)); // 67, -54

        System.out.println("Min of every number is = " +
                Math.min(
                        Math.min(4, 67), -54)
         );

        System.out.println("Hello DATA");

        /*Write a program which is going to print the max of given 3 numbers
        4,56,23
         */

        int num1 = 4;
        int num2 = 56;
        int num3 = 23;

        System.out.println(Math.max(Math.max(num1,num2),num3));

        /*Write a program which is going to ask user  4 numbers print the max of given 4 numbers

         */

        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter 4 numbers " );
        int numOne = input.nextInt(), numTwo = input.nextInt(), numThree = input.nextInt(), numFour = input.nextInt();

        Math.max(numOne,numTwo); //compared 2 numbers. now we have 1 max number
        Math.max(numThree,numFour); // compared 2 numbers, now we have 1 max number

        // now we can compare 2 numbers, just take  2 formulas and put in one Math.max();

        System.out.println("The biggest number is = " + Math.max(Math.max(numOne,numTwo),Math.max(numThree,numFour)));




        Math.min(numOne, numTwo);
        Math.min(numThree,numFour);
        System.out.println("The smallest number is = " + Math.min(Math.min(numOne,numTwo), Math.min(numThree,numFour)));

    }
}
