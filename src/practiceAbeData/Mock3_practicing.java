package practiceAbeData;

import java.util.Arrays;

public class Mock3_practicing {
    public static int[] factorial(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else{
                int number =  numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }


    //Testing method
    public static void main(String[] args) {

        System.out.println("\n\n\n");
        int[] nums = {1,2,8,8,0,0};


        System.out.println(Arrays.toString((factorial(nums))));
        System.out.println("\n checked above");
        System.out.println(Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2}))); // [1, 120, 24, 1, 6, 2]

  String a = "Hello";
        System.out.println(new StringBuilder(a).reverse().toString());





    }
}