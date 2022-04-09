package utilities;

public class Calculator {
    /*
    What do we need to create a method
    1. A proper name
    2. Decide its accessibility level(public)
    3. Decide its accessibility way(You want to call it with class name or with object name)
    static -> You want to call it with class name
    non-static -> You want call it with object name
    4.Decide if it returns something or not
    if it returns, then decide what it returns
    if it does not return -> then put void
    5.Does it take any argument
    if it takes, then decide what arguments it takes and how many arguments it takes

    NOTE: if your method is not void meaning it is return type you MUST use return keyword in the body of the method
    NOTE: every method MUST have a body that runs a task
    NOTE: if your method returns an int, then the variable used next to return keyword in the body Must be an int
    NOTE: we can have multiple methods sharing the same name in the same class only if they have different arguments could
    be either number of arguments are different or the types of arguments are different
    NOte: do not ever create method inside the method!
     */


        public static int divide(int num1, int num2){
            return num1/num2;
        }
        public static double divide(double num1, double num2){
           return num1/num2;

        }
       public static int findSumOf2(int num1, int num2){
            return num1+num2;
       }
        public static double findSumOf2(double num1, double num2) {
            return num1 + num2;
        }
        public static int findAbsOf2(int num1, int num2) {
            return Math.max(num1, num2) - Math.min(num1, num2); // Math.abs(n1-n2)

        }

        /*
        //n1-n2
        if(n1>n2){
       return n1-n2
          }else ((((if (n2>n1){---> we can put only else here , not else if
          //n2-n1
          return n2-n1;
          }
          // ternary also possible
          return (n1>n2)?n1-n2:n2-n1;
         */

        public static double findAbsOf2(double num1, double num2) { //when we are doing same method but
        return Math.max(num1, num2) - Math.min(num1, num2);         //changing parameters from int to double- its method OVERLOADING
        }
        public static int findProductOf2(int num1, int num2) {
            return num1 * num2;
        }
        public static double findProductOf2(double num1, double num2) {
            return num1 * num2;
        }
    //Create a method that finds the sum of 2 int numbers and returns it
//Create a method that finds the sum of 2 double numbers and returns it
//Create a method that finds the absolute difference of 2 int numbers and returns it
//Create a method that finds the absolute difference of 2 double numbers and returns it
//Create a method that finds the product of 2 int numbers and returns it
//Create a method that finds the product of 2 double numbers and returns it

}
