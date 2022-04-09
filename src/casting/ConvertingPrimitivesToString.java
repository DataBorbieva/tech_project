package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {
        int num = 36;
        // if we want to convert that to String  + (concatenation)
        //if we want to convert that to String - second option is valueOf() method

        String numStr = num +"";
        //String numStr = "" + 45 + 36 //output 4536
        //String numStr = 45 + "" + 36 // output 4536

        String numStr1 = String.valueOf(num);

        System.out.println("numStr1 " + numStr1);
    }
}
