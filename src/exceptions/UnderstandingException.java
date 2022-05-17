package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {
        //UNCHECKED EXCEPTIONS = Runtime exceptions - you see it when you execute the problem

        String name = "John"; //0,1,2,3;

        //How to handle the exception
        try {
            System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is here!!!!");
        }
        System.out.println("End of the program"); //this will not be executed


    }
}
