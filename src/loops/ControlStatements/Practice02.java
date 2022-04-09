package loops.ControlStatements;
import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        between 0 to 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5

        6 8   -> 6 7 8

        9 7   -> 7 8 9

        1 3   -> 1 2 3
        3 7   -> 3 4 6 7
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        System.out.println("Please enter a number");
        int num2 = scan.nextInt();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i == 5) continue;
            System.out.println(i);


        }

    }
}
