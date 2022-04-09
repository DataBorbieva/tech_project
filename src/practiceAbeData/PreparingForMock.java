package practiceAbeData;
import java.util.Scanner;
public class PreparingForMock {
    public static void main(String[] args) {

/*
        Scanner scan = new Scanner(System.in);

        /*System.out.println("My favorite book ?");
        String favBook= scan.nextLine();
        System.out.println("My telephone number");
        scan.nextLine();
        String phone = scan.nextLine();




        System.out.println("What is your address? ");
        String address = scan.nextLine();

        System.out.println("What is your fav number? ");
        int number = scan.nextInt();

        System.out.println("What is your fav color? ");
        String color = scan.next();
        scan.nextLine();

        System.out.println("What is your email?");
        String email = scan.nextLine();

        System.out.println("What is your fav quote? ");
        String quote = scan.nextLine();


        System.out.println((44481%2));
        */
   /*
        if(5000>1000){
           System.out.println("you have good money");
        }else{
            System.out.println("you are poor ");
        };

      System.out.println("Enter a number");
      int a = scan.nextInt();
        if( a % 7 == 0){
            System.out.println("The number is dividable by 7 !");
        }else{
            System.out.println("it is not div by 7! ");
        }

       System.out.println(28881%2);
        */

        System.out.println("--------DATA SECOND MOCK PREPARATION--------");
        System.out.println("--------YOU CAN DO IT GIRL!!!!!!!!!!--------");
        System.out.println("--------BELIEVE IN YOURSELF!!!!!!!!!--------");
        /*
                    Requirement:
            Convert given Strings below to int data types and find
            their sum, product, division, subtraction and
            remainder.
            NOTE: Scanner is not needed for this task!
            String s1 = “5”, s2 = “10”;
            Expected results:
            -Sum of 5 and 10 is = 15
            -Product of 5 and 10 is = 50
            -Division of 5 and 10 is = 0
            -Subtraction of  5 and 10 is = -5
            -Remainder of 5 and 10 is = 5
                 */

        /*1.Convert given Strings to int
        2.Find sum,product,division,subtraction, remainder
        3.print out as required
         */


        String s = "ab1x2y3cd3dsjfhw43";
      //  1+2+3+3+4+3 = 16;
      //  49+50+51+51+52+51 = 304;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

    }
}
