package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
                /*
        Write a program that generates a random number bt -50 and 50
        And check if number is positive first
        If number is positive, print "Number is positive"
        then also check if number is odd and print "Number is positive and odd"

        NOTE: if number is not positive, then you don't need to check if it is odd

        PSEUDO
        1.Generate a random number bt -50 and 50
        2.Check if it is positive, and print message
        3.If positive, also check if it is odd and print message
         */
        int rand = (int) (Math.random() * 101) - 50;
        System.out.println(rand);

        if (rand > 0) {
            System.out.println("NUmber is  positive");
            if (rand % 2 == 1) {      //checking number is it odd or not
                System.out.println("Number is odd and positive");
            } else {
                System.out.println("Number is positive ");
            }
        }else{
            System.out.println("It is negative");
        }




    }
}
