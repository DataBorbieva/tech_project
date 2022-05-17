public class UnderstandingLoops {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("Hello"+"\nHello" +"\nHello"+"\nHello"+"\nHello");
        System.out.println("Hello"+"\nHello" +"\nHello"+"\nHello"+"\nHello");
        System.out.println("Hello"+"\nHello" +"\nHello"+"\nHello"+"\nHello");
        System.out.println("Hello"+"\nHello" +"\nHello"+"\nHello"+"\nHello");

        for(int count = 10; count >= 1; count--){ //post-decrement
            System.out.println("Hello World!");



        }
    }
}
