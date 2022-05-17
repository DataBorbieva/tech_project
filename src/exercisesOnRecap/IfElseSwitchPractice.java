package exercisesOnRecap;
import java.util.Scanner;
public class IfElseSwitchPractice {
    public static void main(String[] args) {
        /*
        write a code takes user's age and
        if the user is 16or older print out "You can drive"
        if user is 18 or older "You can work
        if the user is 21 or older or older "you can drink"
        25 or older " you can rent a car

        */
    Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if(age >= 16 && age <18 ) {
            System.out.println("You can drive");
            if (age >= 18 && age < 21) System.out.println("You can work");
            if (age >= 21 && age < 25) System.out.println("You can drink");
            if (age >= 25) System.out.println("You can rent a car");
            else System.out.println("Everything else");


        }







    }
}
