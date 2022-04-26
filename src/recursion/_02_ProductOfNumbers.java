package recursion;

public class _02_ProductOfNumbers {
    public static int productOfNumRecursion(int n) {

        if(n <= 0) return 0;     //negative numbers can NOT break this program
       else  if (n > 1) return n * productOfNumRecursion(n - 1);    //negative numbers can break this program
        return 1;
    }
/*
        or same method with different way
        if(n == 1) return 1;
        return n * productOfNumRecursion (n-1)
 */
    public static void main(String[] args) {
        System.out.println(productOfNumRecursion(2)); //2
        System.out.println(productOfNumRecursion(4)); //24
        System.out.println(productOfNumRecursion(0)); //0
        System.out.println(productOfNumRecursion(-2)); //0
    }
}
