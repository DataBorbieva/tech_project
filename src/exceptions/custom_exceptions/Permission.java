package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {

    public static void ageOfUser(int age){
        if(age >= 16 ) System.out.println("it is allowed to have drivers license");
      else  throw new RuntimeException("Age of " + age + " is not allowed to have a drivers license" );
    } //custom Exception

    public static void checkIn( int day){
        if ( day >= 2 && day <= 6 ) System.out.println("user is allowed to check in from 10 AM to 5 PM");
        else if (day == 1 && day == 7) System.out.println("user is allowed to check in 10 AM to 3 PM");
        else throw new RuntimeException("The input does not represent any day!!!" );
    }


/*\
/*
Create a method that takes an int as an argument to state the day in the week
1 - Sunday
2 - Monday
7 - Saturday
method name = checkIn()
if it is weekday user is allowed to check in from 10 AM to 5 PM
if it is weekend user is allowed to check in 10 AM to 3 PM
if the input is not in the range of 1-7, then throw an exception with message
"The input does not represent any day!!!"
 */


    public static void checkInWithSwitch(int day){
        switch (day){
            case 1:
            case 7:
                System.out.println("user is allowed to check in 10 AM to 3 PM");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("user is allowed to check in 10 AM to 5 PM");
                break;
            default:
                throw new RuntimeException("The input does not represent any day!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! PLease enter your age");
        int age = scan.nextInt();

        try{
            ageOfUser(age);
        } //java.lang.RuntimeException: Age of 10 is not allowed to have a drivers license -->IN CONSOLE
   catch(Exception e){
            e.printStackTrace();
   }finally {
            System.out.println("your age is = " + age);
        }
        System.out.println("End of Program");


        System.out.println("\n\n------------------");
        checkIn(8);
    }
}
