package homeworks;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){
        System.out.println("Task - 1");
       /* 1.create a Scanner object
       2.ask questions
       3.get required numbers 7, 11 in output
       4.find an average between 7, 11
       5.print out
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("What is number one? ");
        int numberOne = scan.nextInt();

        System.out.println("What is number two? ");
        int numberTwo = scan.nextInt();

        int avg = (numberOne+numberTwo)/2;
        System.out.println("The average of the given 2 numbers is: " + avg);

        /*
        Sort-cut
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers');
        System.out.println("The average of 2 given numbers are" + (scan.nextInt()+scan.nextInt())/2);
         */

        System.out.println("\nTask-2");
         /* 1.create a Scanner object
       2.ask questions
       3.get required numbers 3, 5 in output
       4.find an average between 3, 5
       5.print out

          */



        Scanner scan1 = new Scanner(System.in);

        System.out.println("What is number one? ");
        int number1 = scan.nextInt();

        System.out.println("What is number two? ");
        int number2 = scan.nextInt();

        int product = number1*number2;
        System.out.println("The product of the given 2 numbers is: " + product);

        System.out.println("\nTask-3");
         /* 1.we already have scanner object, we do not need another one
       2.ask questions
       3.get required numbers 5,6,10 in output
       4.find the square of each given number
       5.print out

          */


        System.out.println("Please enter 3 numbers? ");
        int num1 = scan.nextInt(), num2 = scan.nextInt(),num3 = scan.nextInt();



        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " +(num1 * num1));
        System.out.println("The " + num2 + " multiplied with " + num2 + " is = " + (num2 * num2));
        System.out.println("The " + num3 + " multiplied with " + num3 + " is = " + (num3 * num3));

        System.out.println("\nTask-4");

        /* 1.we already have scanner object, we do not need another one
       2.ask questions
       3.get required numbers 25,8 in output
       4.find the remainder  of first number by second number
       5.print out
        */

        System.out.println("What is number one? ");
        int First = scan.nextInt();

        System.out.println("What is number two? ");
        int Second = scan.nextInt();

        int remainder = (First % Second);
        System.out.println("The remainder of " + First + " % " + Second + " = " + remainder);

        System.out.println("\nTask-5");
        /* 1.ask questions
       2.get required numbers 6,10,12,15,17 in output
       4.find an average between given 5 numbers
       5.print out as required

         */

        System.out.println("Please enter 5 numbers? ");
        int numOne = scan.nextInt(),numTwo = scan.nextInt(),numThree = scan.nextInt(),
                numFour = scan.nextInt(),numFive = scan.nextInt();

        System.out.println("The average of the given 5 numbers is: " +(numOne+numTwo+numThree + numFour + numFive)/5);

        System.out.println("\nTask-6");

         /* 1.ask questions
       2.get required number 7
       4.get an input as required in multiplication table up to 10
       5.print out as required
        */

        System.out.println("What is the number ? ");
        int numberA = scan.nextInt();


        int mult1 = numberA * 1;
        int mult2 = numberA * 2;
        int mult3 = numberA * 3;
        int mult4 = numberA * 4;
        int mult5 = numberA * 5;
        int mult6 = numberA * 6;
        int mult7 = numberA * 7;
        int mult8 = numberA * 8;
        int mult9 = numberA * 9;
        int mult10 = numberA * 10;

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int q = 10;

        System.out.println(numberA + " * " + a + " = " + mult1);
        System.out.println(numberA + " * " + b + " = " + mult2);
        System.out.println(numberA + " * " + c + " = " + mult3);
        System.out.println(numberA + " * " + d + " = " + mult4);
        System.out.println(numberA + " * " + e + " = " + mult5);
        System.out.println(numberA + " * " + f + " = " + mult6);
        System.out.println(numberA + " * " + g + " = " + mult7);
        System.out.println(numberA + " * " + h + " = " + mult8);
        System.out.println(numberA + " * " + i + " = " + mult9);
        System.out.println(numberA + " * " + q + " = " + mult10);
        //create first int a = 1
      //  System.out.println("for multiplication, we can use post - increment a++");

        System.out.println("\nTask - 7");
        /* 1.ask a question and get a side of a square
        2.find perimeter and area
        3.print out correct required output
         */

        System.out.println("Side of a square? ");
        int squareSide = scan.nextInt();

        int area = squareSide * squareSide;
        int perimeter = 4 * squareSide;

        System.out.println("Perimeter of the square = " + perimeter);
        System.out.println("Area of the square = " + area);



    }

}
