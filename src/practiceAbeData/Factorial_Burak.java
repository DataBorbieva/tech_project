package practiceAbeData;

import java.util.Arrays;

public class Factorial_Burak {
    public static void main(String[] args) {
        int factorial = 1;
        int factNumber = 5;
        for (int i = 2; i <= factNumber ; i++) { // we can start with 2
            factorial *= i ;
        }
        System.out.println(factorial); //120

        // 1 2 3 4 5 -> 5*4 =20 * 3 = 60 * 2 = 120

        int[] arr = { 5, 4, 7, 2};

        System.out.println(Arrays.toString(factorialCollection(arr)));
    }

 public static int[] factorialCollection(int [] nums){

     for (int i = 0; i < nums.length; i++) { // { 5, 4, 3, 2, 1 } // 5 { 120,
        int factorial = 1; // then we reset our container after each  iteration
         for (int j = 2; j <= nums[i]; j++) {
             factorial *= j; // we find the factorial here
         }
         nums[i] = factorial; // then we are assigning our index of an element with our  new factorial number
     }
  return nums;

    }












}
