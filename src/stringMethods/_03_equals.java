package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        /*Method Task:compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison  is case -sensitive
        - non -static , and we call it with another String object
        - its return type and returns boolean
        -It takes a String as an argument


         */
        System.out.println("Melda".equals("Melda"));//true
        System.out.println("melda".equals("Melda"));//false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James" ;
        System.out.println(name1.equals(name2));//false
        System.out.println(name2.equals(name3));//true

        String str1 = "Hello";
        String str2=str1;
        boolean b = !(str1.equals(str2)); //false
        System.out.println(b); //false

        System.out.println(!"abc".concat("xyz").equals("abcx"+"yz")); // first we are checking what is in parentheses
        // "abcxyz".equals("abcxyz") --> !true -> false


    }
}
