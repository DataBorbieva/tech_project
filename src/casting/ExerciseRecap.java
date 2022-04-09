package casting;
import java.util.Scanner;
public class ExerciseRecap {
    public static void main(String[] args) {
/*
        Write a program ASKS user for 5 of their grades as string
        and print out their avg

        Input:
        "45"
        "50"
        "55"
        "60"
        "65"

        Output:
        55
         */
        Scanner scan = new Scanner(System.in);
        //System.out.println("What are the 5 grades ?");

        /*
        Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.


        Input:
        "What is your balance?"
        user:
        456.7

        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4

        Output:
        "Your balance is now = x"

        */
       /* System.out.println("What is your balance ?");
        String balance = scan.next();
        System.out.println("What is your next 3 transactions ?");
        String tran1 = scan.next(),tran2=scan.next(),tran3=scan.next();

        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(tran1);
        Double t2D = Double.valueOf(tran2);
        Double t3D = Double.valueOf(tran3);
        System.out.println( "Your balance now is = "  + (balanceD - t1D - t2D - t3D)); */

        /*
        Write a program ASK user for full name, age, phone number then
        enter their 3 kids age as string then print out everything plus
        the oldest kid, youngest and the age difference between oldest
        and youngest.

        Program: "Please enter your name"
        User: John Doe
        Program: "Please enter your age:
        User: 45
        Program: "Please enter your phone number:
        User: (123) 123 1234
        Program: "Enter the ages of your kids"
        User:
        12
        22
        17
        Program:
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.

         */
        System.out.println("What is your full name ?");
        String fullName = scan.nextLine();

        System.out.println("What is your age ?");
        String age = scan.next();
        scan.nextLine(); //clearing the spaces for the nextline for phone number

        System.out.println("What is your phone number ?");
        String number = scan.nextLine(); //(312) 123-1234

        System.out.println("What are the kids age ?");
        String kid1 = scan.next(), kid2 = scan.next(), kid3 = scan.next();
        int kidsAge1 = Integer.parseInt(kid1);
        int kidsAge2 = Integer.parseInt(kid2);
        int kidsAge3 = Integer.parseInt(kid3);
        int max = Math.max(Math.max(kidsAge1,kidsAge2), kidsAge3);
        int min = Math.min(Math.min(kidsAge1,kidsAge2),kidsAge3);
        int abs = Math.abs(max-min);

        System.out.println("\nYour name is " + fullName + "," +
                        "your phone number is " + number + "," +
                "\nYou are " + age +  " years old, " + " Your oldest kid is " + max +
                " years old, " +
                "\nyour youngest is " + min + ", difference between oldest and youngest is " +
                abs +
                "\nyears.");



    }
}

