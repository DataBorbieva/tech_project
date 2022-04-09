package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method Task: Convert given variable to a String
        It is static - you can call it with class name
        it is a return type and it returns a String
        Both side of the equal side should be same data type
        It takes different argument as it is a overloaded method and converts given args to a String
     */

        int i = 5;
        String num = String.valueOf(i); // num = 5 text
        System.out.println(i+i); //10 ( addition between numbers)
        System.out.println(num+num);// 55 - text
    }
}
