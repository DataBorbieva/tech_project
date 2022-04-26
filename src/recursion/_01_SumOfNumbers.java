package recursion;

public class _01_SumOfNumbers {
    public static int sumOfNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }                               //negative numbers can break this program


    public static int sumOfNumRecursion(int n) {

        if (n > 0)
            return n + sumOfNumRecursion(n - 1);    //negative numbers can break this program
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(5)); //15
        System.out.println(sumOfNum(7)); //28
        System.out.println(sumOfNum(-77)); //0
        System.out.println(sumOfNum(-3));  //0 because our sum starts with 0

        System.out.println("\n----------WITH using of RECURSION-----------");
        System.out.println(sumOfNumRecursion(5)); //15
        System.out.println(sumOfNumRecursion(4)); //10
        System.out.println(sumOfNumRecursion(-3)); //0
    }






}