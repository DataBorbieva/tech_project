package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {
        /*
        Method TASK: this methods are used to convert letters of a string to upeercase or lowercase
        - non - static , because we can not call STRING CLASS before this method
        - non -static we can call them with object  of String class
        - they are return type methods and they return the modified String abject back
        - they dont take any argument in parentheses

         */
        String s1 = "HELLO world 10$";

        System.out.println(s1); //HELLO world 10$
        System.out.println(s1.toLowerCase());//hello world 10$
        System.out.println(s1.toUpperCase()); //HELLO WORLD 10$

        System.out.println(" SSJDHJD KSDKkskdkjkjsd 29392839ksdksjd $%**W".toLowerCase());
        //only letters can be converted to lower and uppercase in this method
        //%^&*$#@ and digits can not be converted

        String sentence = "I paid $100.99 to buy airpods";
        String s2 = sentence.toUpperCase();//I PAID $100.99 TO BUY AIRPODS
        System.out.println(s2.toLowerCase().toUpperCase());// it will be converted to Uppercase because left to right in java
    }
}
