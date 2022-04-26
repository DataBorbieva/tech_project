package recursion;

public class _02_ProductOfNumbers {
    public static int productOfNumRecursion(int n) {

        if (n > 1)
            return n * productOfNumRecursion(n - 1);    //negative numbers can break this program
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(productOfNumRecursion(2));
    }
}
