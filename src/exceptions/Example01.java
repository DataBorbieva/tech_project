package exceptions;

public class Example01 {
    public static void main(String[] args) {

        String[] names = {"Alex", "John", "Max"};

        //How to handle the exception
        try {
            System.out.println(names[-5]); //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException exception){
      //      System.out.println(exception.getMessage());
            exception.printStackTrace();
            /*
            printStackTrace() -> java.lang.ArrayIndexOutOfBoundsException: -5
	at exceptions.Example01.main(Example01.java:10)
             */

            System.out.println("An ArrayIndexOutOfBoundsException is caught");
        }
        System.out.println("End of the program!");
    }
}


