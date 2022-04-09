package utilities;

public class MathHelper {
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    //method overloading
    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num2, num3));
    }
     /*
     Please create a method that takes int as an argument and returns true if even
      */

    public static boolean isEven(int num) {
        return (num % 2 == 0);              //if(num%2==0) return true; --> this is another way
        // else return false;

    }

    // method isOdd() that takes one int parameter and returns true if number is odd
    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isPositive(int num) {
        return (num > 0);                             //method isPositive() number returns true if its positive
    }                                               // otherwise, its false
    //  public static boolean isPositive(int num) {
    //  return num!=0 && num=Math.abs(num)

    public static boolean isNegative(int num) {    // method isNegative() number returns true if its positive false
        return (num < 0);
    }


    public static boolean isZero(int num) {
        return (num == 0);
    }
}

