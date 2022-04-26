package exceptions;

public class Example02 {
    public static void main(String[] args) {
        int number = 45;
        System.out.println(number /3 ); //15
        System.out.println(number / 0 ); //Exception in thread "main" java.lang.ArithmeticException: / by zero
      //  at exceptions.Example02.main(Example02.java:7)

        try {
            System.out.println(number / 0 );
        } catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End of the Program");
    }
}
