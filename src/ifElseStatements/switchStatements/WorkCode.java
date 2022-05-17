package ifElseStatements.switchStatements;
import java.util.Scanner;
public class WorkCode {
    public static void main(String[] args) {

        /*
        Write a program that ask user to enter which day it is (1 to 5)
        Based on the answer print what color will be selected

        1 Monday -> Blue
        2 Tuesday -> Red
        3 Wednesday -> Purple
        4 Thursday -> Yellow
        5 Friday -> Orange
         */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 1- 5 ? ");//but in real life user can put any number 99,135,10003444
        int day = userInput.nextInt();             //and this any number 29993044 is default or else

       /* if(day==1){
            System.out.println("Blue");
        }else if(day==2) {
            System.out.println("Red");
        }else if(day==3) {
            System.out.println("Purple");
        }else if(day==4) {
            System.out.println("Yellow");
        }else if(day==5){
            System.out.println("Orange");
        }else if(day==6||day==7){
            System.out.println("This is weekend  ");
        }else{
            System.out.println("This is not representing any day!");
        } */

       switch (day) {  // can be used with String, int, byte,short,char, Enum
           case 1:
               System.out.println("Blue");
               break;  //if we will not put break , it will print out everything after matching statement
           case 2:
               System.out.println("Red");
               break;
           case 3:
               System.out.println("Purple");
               break;
           case 4:
               System.out.println("Yellow");
               break;
           case 5:
               System.out.println("Orange");
               break;
           case 6:
           case 7:
               System.out.println("It is a weekend");
               break;
           default:
               System.out.println("This is not representing any day!");

       }

        System.out.println("End of the program");











    }
}
