package exceptions;

public class Example01 {
    public static void main(String[] args) {

        String[] names = {"Alex", "John", "Max"};

        //How to handle the exception
        try {
            System.out.println(names[-5]); //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("An ArrayIndexOutOfBoundsException is caught");
        }
        System.out.println("End of the program!");
    }
}


