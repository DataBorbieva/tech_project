package exceptions;

public class Try_Catch_Finally_Blocks {
    public static void main(String[] args) {
        try{
            System.out.println(3 / 0);
        }catch (Exception e){          //java.lang.ArithmeticException: / by zero
           // at exceptions.Try_Catch_Finally_Blocks.main(Try_Catch_Finally_Blocks.java:6)

            e.printStackTrace();

    } finally {

        System.out.println("Here is the report!");
    }
            System.out.println("End of program!");
    }
}
