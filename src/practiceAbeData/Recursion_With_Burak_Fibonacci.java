package practiceAbeData;

public class Recursion_With_Burak_Fibonacci {

    public static int fiboRecursion(int n) { //0 1 1 2 3 5 8 13 21 ......
        if (n <= 1)
            return n;
        return fiboRecursion(n - 1) +  fiboRecursion(n - 2);
    }


    public static int factRecursion(int n) {
        if (n < 0)
            return n;
        else if(n == 0) return 1;
        return n * factRecursion(n-1);
    }



    public static void main(String[] args) {
        System.out.println(fiboRecursion(8)); //21

        System.out.println(factRecursion(4)); //24
    } }