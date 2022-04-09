package loops;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Task-1    fori loop");
        /*
            TASK-1
            Write a program that prints all the numbers between 1-100
            But do not print any number that can be divided by 2 or 3

            Expected output:
            1
            5
            7
            11
            13
            17
            19
            23
            .
            .
            .
            97
             */

        for(int num = 1; num <= 100 ; num++) {
            if (num % 2 != 0 && num % 3 != 0) System.out.println(num);
        }
            System.out.println("\nTask-1    While loop");
            int count = 1;
            while (count <= 100) {
                if (count % 2 != 0 && count % 3 != 0) System.out.println(count);
                count++;
            }

            System.out.println("\nTask-1     DO While loop");

            int count1 = 1;
            do {
                if(count1 % 2 != 0 && count1 % 3 != 0) System.out.println("count1");
                count1++;
            } while (count1 <= 100);


        }
    }

