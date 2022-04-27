package exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println(("hello").charAt(100));
        }catch(StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }
   catch(ArithmeticException e){
            e.printStackTrace();
   }
        System.out.println("End of the Program!");
    }
}
