package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework22 {

    /*
    Requirement:
-Create a method called fibonacciSeries1()
-This method will take an int argument as n, and it will
return n series of Fibonacci numbers as an int
array.
REMEMBER: Fibonacci series = 1, 1, 2, 3, 5, 8, 13, 21
Test Data 1: 3
Expected Result 1: [1, 1, 2]
Test Data 2: 5
Expected Result 2: [1, 1, 2, 3, 5]
Test Data 3: 7
Expected Result 3: [1, 1, 2, 3, 5, 8, 13]
     */

    //TASK 1
    public static int[] fibonacciSeries1(int n) {
        int[] array = new int[n];
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < array.length; i++) {
            array[i] += num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return array;
    }




    /*
    Requirement:
-Create a method called fibonacciSeries2()
-This method will take an int argument as n, and it will
return the nth series of Fibonacci number as an
int.
REMEMBER: Fibonacci series = 1, 1, 2, 3, 5, 8, 13, 21
Test Data 1: 2
Expected Result 1: 1
Test Data 2: 4
Expected Result 2: 3
Test Data 3: 8
Expected Result 3: 21
     */

    //TASK 2
    public static int fibonacciSeries2(int n) {
        int[] array = new int[n];
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < array.length; i++) {
            array[i] += num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return array[array.length - 1];
    }
    /*
    Requirement:
-Create a method called findUniques()
-This method will take 2 int array argument and it will return
an int array which has only the unique values from both given
arrays.
NOTE: If both arrays are empty, then return an empty array.
NOTE: if one of the array is empty, then return unique values
from the other array.
Test Data 1: [], []
Expected Result 1: []
Test Data 2: [], [1, 2, 3, 2]
Expected Result 2: [1, 2, 3]
Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
Expected Result 3: [1, 2, 5]
Test Data 4: [8, 9], [9, 8, 9]
Expected Result 4: []
     */

    //TASK 3

    public static int[] findUniques(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) list.add(array1[i]);
            else contains = false;

        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
/*
Requirement:
-Create a method called isPowerOf3()
-This method will take an int argument and it will
return true if given int argument is equal to 3
power of the X. Otherwise, it will return false.
Numbers that are power of 3 = 1, 3, 9, 27, 81, 243....
Test Data 1: 1
Expected Result 1: true
Test Data 2: 2
Expected Result 2: false
Test Data 3: 3
Expected Result 3: true
Test Data 4: 81
Expected Result 4: true
 */
//TASK 4

    /*
public static boolean isPowerOf3(int number) {
    return number == Math.pow(3, Math.round(Math.log(number) / Math.log(3)));
}*/

    public static boolean isPowerOf3(int number) {
        if (number < 1) return false;
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }

/*
Requirement:
-Create a method called firstDuplicate()
-This method will take an int array argument and it will
return an int which is the first duplicated number.
NOTE: All elements will be positive numbers.
NOTE: If there are no duplicates, then return -1
NOTE: If there are more than one duplicate, then return
the one for which second occurrence has the smallest
index.
Test Data 1: []
Expected Result 1: -1
Test Data 2: [1]
Expected Result 2: -1
Test Data 3: [1, 2, 2, 3]
Expected Result 3: 2
Test Data 4: [1,  2, 3, 3, 4, 1]
Expected Result 4: 3
 */
//TASK 5
public static int firstDuplicate(int[] array) {
    if (array.length <= 1) return -1;
    else {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                arr[i] = array[i];
            }
            Arrays.sort(arr);
        }
        return arr[arr.length - 1];
    }
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries1(5)));

        System.out.println(fibonacciSeries2(2));

        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));

        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));

        System.out.println(isPowerOf3(2));

        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
        System.out.println(firstDuplicate(new int[]{1}));
    }

}
