package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
                /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
        */

        int rand = (int) (Math.random() * 101) - 50;
        System.out.println(rand);

        if(rand>0){         //positive
            System.out.println("Win 10 points");

            if(rand>25){
                System.out.println("Win  extra 10 points");
          if(rand==7){
              System.out.println("Win 1000 points");
          }

            }
            if(rand==-7){
                System.out.println("Win extra 10 points");



            }
        }









            }

}
