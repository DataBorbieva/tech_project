package homeworks;
import utilities.MyMethods;
import utilities.RandomNumberGenerator;
import java.util.Scanner;
public class Homework08 {
    public static void main(String[] args) {
        System.out.println("Task-1");
                /*
                Requirement:
        Write a program that generates a
        random number between 0 and 50
        (both 0 and 50 are included)
        Print true if number is in between 10
        and 25 (10 and 25 included)
        Print false otherwise
                 */
        /*1. get random number with new random method between 0-50 both included
        2.if number is between 10-25 both included print true using if-else statement
        3.print false otherwise
         */

       int ran = RandomNumberGenerator.getRandomNumber(0,50);
       System.out.println("Random number is = " + ran);
      //  if(ran >=10 && ran <=25) System.out.println(true);  --> 1st way
      //  else System.out.println(false);


        System.out.println(ran >=10 && ran <=25);  // 2nd way

        System.out.println((ran >= 10 && ran <= 25)  //--> 3rd way ternary
                ? "r is in between 10 and 25(included)"
                : "r is NOT in between 10 and 25(included)");

        MyMethods.isNumberBetween10And25(ran);   // 4 th way , we created method for that

        System.out.println("\nTask-2");
                /*
                Requirement:
        Write a program that generates a random number
        between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1st half is 1-50
        2nd half is 51-100
        Test data:
        34
        Expected result:
        34 is in the 1st half
        34 is in the 2nd quarter
                 */
        /*1.find a random number with new method between 1-100 , both uncluded
        2.find which if number is in quarter and a half by using if-else statements
        3.print out as required
         */
        int ran1 = RandomNumberGenerator.getRandomNumber(1,100);
        System.out.println("Random number is = " + ran1);
        if(ran1>=1 && ran1<=25) System.out.println(ran1 + " is in the 1st quarter ");
          if(ran1>=26 && ran1<=50) System.out.println(ran1 + " is in the 2nd quarter ");
             if (ran1>=51 && ran1<=75) System.out.println(ran1 + " is in the 3rd quarter ");
                if(ran1>=76 && ran1<=100) System.out.println(ran1 + " is in the 4th quarter ");
                else if(ran1>=1 && ran1<=50) System.out.println(ran1 + " is in the 1st half ");
               else System.out.println(ran1 + " is in the 2nd half ");

               /*
               if(num <= 25){
	//first quarter
}
else if(num <= 50){
	//second quarter
}
else if(num <= 75){
	//third quarter
}
else{
	//fourth quarter
}
if(num <= 50){
	//first half
}
else{
	//second half
}
78
if(number <= 50){
	// first half
	if(number <= 25){
		//first quarter
	}
	else{
		//second quarter
	}
}
else{
	// second half
	if(number <= 75){
		//third quarter
	}
	else{
		//fourth quarter
	}
}
                */

        /*public static void printHalfAndQuarter(int n){

            if (n <= 50){
                System.out.println(n + " is in the 1st half");

                if (n <= 25){
                    System.out.println(n + " is in the 1st quarter");
                }else{
                    System.out.println(n + " is in the 2nd quarter");
                }
            }else {
                System.out.println(n + " is in the 2nd half");     // the correct way of doing task 2

                if (n <= 75){
                    System.out.println(n + " is in the 3rd quarter");
                }else{
                    System.out.println(n + " is in the 4th quarter");
                }

           }

         */

        System.out.println("\nTask-3");
                /*
                Requirement:
        Write a program that asks user to enter 5 numbers
        between 1 to 10 (1 and 10 are included)
        They will get some points based on numbers they
        entered. So, their points will be calculated as below
        1st  number will be multiplied by 5 and added as points
        2nd number will be multiplied by 4 and added as points
        3rd number will be multiplied by 3 and added as points
        4th number will be multiplied by 2 and added as points
        5th number will be multiplied by 1 and added as points
        If user enters any number that is not in the range,
        then user will not get any points from that number
        Test data:
        3 7 2 1 8
        Expected result:
        59
                 */
        /*1.create Scanner object for user to input 5 numbers between 1 and 10 both included print out
        2.add points with if statement
        3.print out
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 numbers");
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(), n4 = scan.nextInt(), n5 = scan.nextInt();

        int points = 0;

        if (n1 >= 1 && n1 <= 10){
            points += n1 * 5;
        }

        if (n2 >= 1 && n2 <= 10){
            points += n2 * 4;
        }

        if (n3 >= 1 && n3 <= 10){
            points += n3 * 3;
        }

        if (n4 >= 1 && n4 <= 10){
            points += n4 * 2;
        }

        if (n5 >= 1 && n5 <= 10){
            points += n5;
        }

        System.out.println(points);
    }
}








