package ifElseStatements.nestedIfStatements;

public class GreatestOf2Numbers {
    public static void main(String[] args) {
        //get random number between 0-10
        int num1=(int)(Math.random()*11),num2=(int)(Math.random()*11);
        System.out.println(num1);
        System.out.println(num2);
        //Math.max()
       // System.out.println("The greatest of "+ num1 + "and" + num2 + "is = " + Math.max(num1,num2));

        if(num1>num2){
            System.out.println("The greatest of "+ num1 + " and " + num2 + " is = " + num1);
        }
        else{  //num1==num2 || num2> num1
            System.out.println("The greatest of "+ num1 + " and " + num2 + " is = " + num2);
        }
         //SHORT CUT if else statement, we can use IF and ELSE without curly braces {},
        //we can do this only if we have 1 statement
      /*  if(num1>num2) System.out.println("The greatest of "+ num1 + " and " + num2 + " is = " + num1);
        else System.out.println("The greatest of "+ num1 + " and " + num2 + " is = " + num2);
        */



    }
}
