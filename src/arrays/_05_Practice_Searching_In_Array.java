package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {
        /*

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
         */
        System.out.println("Task-1");
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        boolean objT1 = false;
        for (String obj : objects) {
            if (obj.equals("Mouse")) {  //we can not use contains. because if we give Mickey mouse it will give true, but
                                       // should be false
                objT1 = true;

             break;
            }
        }
         System.out.println(objT1);

        System.out.println("\n\nTask-2");
        /*
TASK-2
Check the collection you have above and print true if one of the element is board
Print false otherwise

RESULT:
false
*/
        boolean objT2 = false;
        for (String objs : objects) {
            if (objs.equals("board")) {
                objT2 = true;
                break;
            }
        }
        System.out.println(objT2);

    int[] numbersT4 = {5,-2,0,-7,0,5,8,45,53};
    Arrays.sort(numbersT4);
        System.out.println(Arrays.binarySearch(numbersT4,5) >= 0);//true
        System.out.println(Arrays.binarySearch(numbersT4,0) >= 0);//true
        System.out.println(Arrays.binarySearch(numbersT4,45) >= 0);//true
        System.out.println(Arrays.binarySearch(numbersT4,3) >= 0);//false , because we dont have 3
        System.out.println(Arrays.binarySearch(numbersT4,-7) >= 0); //true









    }
}
