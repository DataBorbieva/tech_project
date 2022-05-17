package arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
 /*
        TASK-1
         */
        System.out.println("\nTask-1");

        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers)
            System.out.println(number);

        System.out.println("\n\nTask-2 for each loop");
        int sum = 0;
        for (int number : numbers)                         //sum += number ++;
            sum += number;
        System.out.println(sum);

        System.out.println("\n\nTask-2 for  loop");
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        System.out.println(sum1);

        System.out.println("\n\nTask-3 for  loop");
        /*
TASK-3
Find the sum of first 3 elements in the array

RESULT:
0
 */
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum2 += numbers[i];
        }
            System.out.println(sum2);

        System.out.println("\n\nTask-4 for  loop");

        /*
TASK-4
Find the sum of last 5 elements in the array
// 10, -3, -7, 0, 0, 7, 22

RESULT:
22
 */
        int sum3 = 0;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
          sum3 += numbers[i];
        }
        System.out.println(sum3);

        /*
TASK-5
Find the product of last 4 elements in the array but exclude zero if there are any
// 10, -3, -7, 0, 0, 7, 22

RESULT:
156
 */
        System.out.println("\n\nTask-5 for  loop");
        int product = 1;
        for (int i = numbers.length - 4; i < numbers.length; i++) {
            if (numbers[i] != 0) product *= numbers[i];
        }
            System.out.println(product);

        System.out.println("\n\nTask-6 for each  loop");
        /*
TASK-6
Check your collection and print true if one of the element is 0
Print false if none of the elements is zero

RESULT:
true
 */


        boolean zeros = false;
        for(int nums : numbers) {
            if (nums == 0) {
                zeros = true; // do it one line . or use {}

                break;
            }
        }
            System.out.println(zeros);







    }
    }
