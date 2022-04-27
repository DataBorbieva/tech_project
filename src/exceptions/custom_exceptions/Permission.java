package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {

    public static void ageOfUser(int age){
        if(age >= 16 ) System.out.println("it is allowed to have drivers license");
      else  throw new RuntimeException("Age of " + age + " is not allowed to have a drivers license" );
    } //custom Exception

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

    }
}
